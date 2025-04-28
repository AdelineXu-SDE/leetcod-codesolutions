class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        List<String> curLine = new ArrayList<>();
        int curLen = 0;


        for(String word : words){
            if(curLen + curLine.size() + word.length() > maxWidth){
                StringBuilder line = new StringBuilder();

                if(curLine.size() == 1){
                    line.append(curLine.get(0));
                    while(line.length() < maxWidth){
                        line.append(' ');
                    }
                }else{
                    int spaces = maxWidth - curLen;
                    int gaps = curLine.size() - 1;

                    int spacePerGap = spaces / gaps;
                    int extraSpaces = spaces % gaps;

                    for(int i = 0; i < curLine.size(); i++){
                        line.append(curLine.get(i));
                        if(i < gaps){
                            for(int s = 0; s < spacePerGap; s++){
                                line.append(' ');
                            }
                            if(extraSpaces > 0){
                                line.append(' ');
                                extraSpaces--;
                            }
                        }
                    }
                }

                result.add(line.toString());
                curLine.clear();
                curLen = 0;
            }
            curLine.add(word);
            curLen += word.length();
        }
        StringBuilder lastLine = new StringBuilder();
        for(int i = 0; i < curLine.size(); i++){
            lastLine.append(curLine.get(i));
            if(i != curLine.size() - 1){
                lastLine.append(' ');
            }
        }
        while(lastLine.length() < maxWidth){
            lastLine.append(' ');
        }

        result.add(lastLine.toString());

        return result;
    }
}