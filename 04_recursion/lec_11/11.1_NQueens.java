class NQueens{
    public static void main(String[] args){
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println("total ways : " + queens(board, 0));
    }
    
    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and column
        for(int col = 0; col < board.length; col++){  
            // place the queen if it is safe
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col){

        // check column
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }

        // check upper-left diagonal
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j]){
                return false;
            }
        }

        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}