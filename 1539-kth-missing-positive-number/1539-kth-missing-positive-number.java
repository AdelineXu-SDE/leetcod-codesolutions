class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(arr == null || arr.length == 0 || k == 0) return 0;
        
        int count = 1;
        int index = 0;

        while(k > 0){
            if(index < arr.length && arr[index] == count){
                index++;
            }else{
                k--;
                if(k == 0){
                    return count;
                }
            }
            count++;
        }

        return count;

        
    }
}