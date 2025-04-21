class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for(int i = 0; i < n; i++){
            int h = n - i;
            int count = 0;
            if (citations[i] >= h){
                return h;
            }  
        }
        return 0;
        
    }
}