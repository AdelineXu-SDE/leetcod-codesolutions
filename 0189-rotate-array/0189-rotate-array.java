class Solution {
    public void rotate(int[] nums, int k) {
        //rotate all
        //rotate k - 1 to nums.length - 1
        //rotate 0 to k
        int n = nums.length;
        k = k % n;  
        helper(nums, 0, n - 1);
        helper(nums, 0, k - 1);
        helper(nums, k, n - 1);
    }

    private void helper(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
    }
}