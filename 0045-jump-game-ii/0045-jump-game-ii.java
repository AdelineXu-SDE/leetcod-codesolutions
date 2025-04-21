class Solution {
    public int jump(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int fastest = 0;
        int end = 0;
        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){
            fastest = Math.max(i + nums[i], fastest);
            if(i == end){
                count++;
                end = fastest;
            }
        }
        return count; 
    }
}