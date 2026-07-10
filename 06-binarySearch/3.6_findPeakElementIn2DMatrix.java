// https://leetcode.com/problems/find-a-peak-element-ii

// optimal solution
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int n = mat.length;
        int m = mat[0].length; 

        int low = 0; 
        int high = m-1;

        while(low <= high){

            int mid = low+(high-low)/2;
            int maxRowIndex = findMaxIndex(mat, m, n, mid);

            int left = (mid > 0) ? mat[maxRowIndex][mid-1] : -1;
            int right = (mid < m-1) ? mat[maxRowIndex][mid+1] : -1;
            int curr = mat[maxRowIndex][mid];

            if(curr > left && curr > right){
                return new int[]{maxRowIndex, mid};
            }
            else if(curr < left){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int findMaxIndex(int[][] mat, int m, int n, int col){ 
        int maxVal = -1;
        int index = -1;

        for(int i=0; i<n; i++){
            if(mat[i][col] > maxVal){
                maxVal = mat[i][col];
                index = i;
            }
        }
        return index;
    }
}