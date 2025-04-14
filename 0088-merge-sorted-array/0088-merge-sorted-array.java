class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;
        int size1 = m - 1;
        int size2 = n - 1;
        while(size1 >= 0 && size2 >= 0){
            if(nums1[size1] >= nums2[size2]){
                nums1[index] = nums1[size1];
                index--;
                size1--;
            }else{
                nums1[index] = nums2[size2];
                index--;
                size2--;
            }
        }
        while(size2 >= 0){
            nums1[index--] = nums2[size2--];
        }
        
    }
}