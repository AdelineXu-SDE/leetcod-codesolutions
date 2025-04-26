class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        
        int first = n - 1;

        while(first >= 0){
            while(first >= 0 && s.charAt(first) == ' '){
                first--;
            }
            if(first < 0) break;

            int second = first;
            while(second >= 0 && s.charAt(second) != ' '){
                second--;
            }
            sb.append(s.substring(second + 1, first + 1));
            sb.append(' ');
            first = second;
        }

        return sb.toString().trim();
        
    }
}