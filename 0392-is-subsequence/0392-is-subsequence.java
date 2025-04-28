class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(t.length() < s.length()) return false;
        int first = 0;
        int second = 0;

        while(first < t.length()){
            if(t.charAt(first) == s.charAt(second)){
                second++;
                if(second == s.length()) return true;
            }
            first++;
        }
        return second == s.length();
        
    }
}