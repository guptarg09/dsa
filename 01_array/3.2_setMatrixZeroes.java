// https://leetcode.com/problems/set-matrix-zeroes


// brootforce solution

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] mark = new boolean[m][n];

        // Mark cells to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    markRow(mark, i, n);
                    markCol(mark, j, m);
                }
            }
        }

        //Apply the marks
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mark[i][j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    static void markRow(boolean[][] mark, int row, int cols) {
        for (int j = 0; j < cols; j++) {
            mark[row][j] = true;
        }
    }

    static void markCol(boolean[][] mark, int col, int rows) {
        for (int i = 0; i < rows; i++) {
            mark[i][col] = true;
        }
    }
}


// brtter solution

class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rowZero = new boolean[m];
        boolean[] colZero = new boolean[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                
                if(matrix[i][j] == 0){
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(rowZero[i] || colZero[j] ){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}


// optimal solution 
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // step 01: Check if the first row has any zero
        for(int j = 0; j < n; j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }

        // step 02: Check if the first row has any zero
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }

        // step 03: Use the first row and first column to mark rows and columns that should be zeroed
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // step 04: Zero out the matrix based on the markers in the first row and column
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // step 05: Zero out the first row if needed
        if(firstRowZero){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }

        // step 06: Zero out the first column if needed
        if(firstColZero){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}