class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char st = s.charAt(i);
            char ts = t.charAt(i);

            if(mapST.containsKey(st)){
                if(mapST.get(st) != ts) return false;
            }else{
                mapST.put(st, ts);
            }

            if(mapTS.containsKey(ts)){
                if(mapTS.get(ts) != st) return false;
            }else{
                mapTS.put(ts, st);
            }
        }
        return true;
        
    }
}