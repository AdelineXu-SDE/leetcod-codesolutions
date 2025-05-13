class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        if(intervals.length < 2) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] cur = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            int[] next = intervals[i];
            if(next[0] <= cur[1]){
                cur[1] = Math.max(cur[1], next[1]);
            }else{
                result.add(cur);
                cur = next;
            }
        } 
        result.add(cur);
        return result.toArray(new int[result.size()][]); 
    }
}