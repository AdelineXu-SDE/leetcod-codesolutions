class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] result = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int liveNeighbors = countLiveNeighbors(board, i, j);

                if(board[i][j] == 1){
                    if(liveNeighbors < 2 || liveNeighbors > 3){
                        result[i][j] = 0;
                    }else{
                        result[i][j] = 1;
                    }
                }else{
                    if(liveNeighbors == 3){
                        result[i][j] = 1;
                    }
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = result[i][j]; 
            }
        }   
    }

    private int countLiveNeighbors(int[][] board, int row, int col){
        int liveNeighbors = 0;
        int m = board.length;
        int n = board[0].length;

        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(i == 0 && j == 0) continue;
                int newRow = row + i;
                int newCol = col + j;

                if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n){
                    liveNeighbors += board[newRow][newCol];
                }
            }
        }
        return liveNeighbors;
    }
}