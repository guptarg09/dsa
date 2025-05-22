// https://leetcode.com/problems/rotate-image

// brootforce solution
class Solution {
    public void rotate(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] rotated = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                rotated[j][n-1-i] = matrix[i][j];
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = rotated[i][j];
            }
        }
    }
}



// optimal solution
class Solution {
    public void rotate(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){
            for(int j = i+1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}