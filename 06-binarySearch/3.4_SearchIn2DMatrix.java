// https://leetcode.com/problems/search-a-2d-matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            if(searchElement(matrix[i], target, m)){
                return true;
            }
        }
        return false;
    }

    static boolean searchElement(int[] row, int target, int len){

        int low = 0;
        int high = len - 1;

        while(low <= high){

            int mid = low+(high-low)/2;
            if(row[mid] == target){
                return true;
            }
            else if(row[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}