class Solution {
    public int jump(int[] nums) {
        int end = 0;
        int fastest = 0;
        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){
            fastest = Math.max(fastest, i + nums[i]);
            if(i == end){
                count++;
                end = fastest;
            }
        }
        return count;
        
    }
}