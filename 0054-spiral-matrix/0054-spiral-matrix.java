class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //DS: Array
        //S:
        //top - right - bottom - left
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, right = n - 1, bottom = m - 1, left = 0;
        List<Integer> result = new LinkedList<>();

        while(top <= bottom && left <= right){
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return result;
    }
}