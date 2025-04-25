class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int first = n - 1;

        
        while(first >= 0 && s.charAt(first) == ' '){
            first--;
        }

        int second = first;

        while(second >= 0 && s.charAt(second) != ' '){
            second--;
        }
        
        return first - second;
        
    }
}