class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        Map<Character, String> mapSP = new HashMap<>();
        Map<String, Character> mapPS = new HashMap<>();

        for(int i = 0; i < words.length; i++){
            char ps = pattern.charAt(i);
            String sp = words[i];

            if(mapSP.containsKey(ps)){
                if(!mapSP.get(ps).equals(sp)) return false;
            }else{
                mapSP.put(ps, sp);
            }

            if(mapPS.containsKey(sp)){
                if(mapPS.get(sp) != ps) return false;
            }else{
                mapPS.put(sp, ps);
            }
        }
        return true;
    }
}