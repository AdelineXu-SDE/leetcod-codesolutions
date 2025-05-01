class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int squareLen = board[0].length;

        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for(int i = 0; i < n; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();    
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                char val = board[i][j];
                if(val == '.') continue;

                if(rows[i].contains(val) || cols[j].contains(val) || boxes[(i / 3) * 3 + j / 3].contains(val)){
                    return false;
                }
                rows[i].add(val);
                cols[j].add(val);
                boxes[(i/3)*3 + j/3].add(val);
            }
        }
        return true;
        
    }
}