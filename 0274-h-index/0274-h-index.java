class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        //0 1 3 5 6
        for(int i = 0; i < n; i++){
            int h_index = n - i;
            if(citations[i] >= h_index){
                return h_index;
            }

        }
        return 0;
        
    }
}