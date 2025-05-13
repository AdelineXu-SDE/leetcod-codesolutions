class Solution {
    public List<String> summaryRanges(int[] nums) {

        int n = nums.length;
        int start = 0;

        List<String> result = new ArrayList<>();

        if(n == 0) return result;

        while(start < n){
            int end = start;
            while(end + 1 < n && nums[end + 1] == nums[end] + 1){
                end++;
            }
            if(end == start){
                result.add(String.valueOf(nums[start]));
            }else{
                result.add(nums[start] + "->" + nums[end]);
            }
            start = end + 1;
        }
        return result;
        
    }
}