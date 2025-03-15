class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        int first = 0;
        for(int second = 0; second < nums.length; second++){
            if(nums[second] != 0){
                if(first != second){
                    nums[first] = nums[second];
                    nums[second] = 0;
                }
                first++;
            }
        } 
    }
}