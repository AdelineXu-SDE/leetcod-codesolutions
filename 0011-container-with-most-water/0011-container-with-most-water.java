class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;

        while(left < right){
            if(height[left] < height[right]){
                maxArea = Math.max(maxArea, (right - left) * height[left]);
                left++;
            }else{
                maxArea = Math.max(maxArea, (right - left) * height[right]);
                right--;
            }

        }
        return maxArea;
        
    }
}