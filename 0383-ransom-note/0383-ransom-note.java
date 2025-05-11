class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(char i : magazine.toCharArray()){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(char j : ransomNote.toCharArray()){
            if(map.containsKey(j)){
                map.put(j, map.get(j) - 1);
                if(map.get(j) == 0){
                    map.remove(j);
                }
            }else{
                return false;
            }
            
        }
        return true;
        
    }
}