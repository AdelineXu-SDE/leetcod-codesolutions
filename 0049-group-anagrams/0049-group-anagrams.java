class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        String[] sortedWords = new String[strs.length];
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(map.containsKey(sorted)){
                List<String> path = map.get(sorted);
                path.add(str);
            }else{
                map.put(sorted, new ArrayList<>(Arrays.asList(str)));
            }

        }
        return new ArrayList<>(map.values()); 
    }
}