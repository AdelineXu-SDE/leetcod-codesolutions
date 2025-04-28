class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;

        while(left < right){
            if(height[left] < height[right]){
                int area = (right - left) * height[left];
                maxArea = Math.max(area, maxArea);
                left++;
            }else{
                int area = (right - left) * height[right];
                maxArea = Math.max(area, maxArea);
                right--;
            }

        }
        return maxArea;
        
    }
}