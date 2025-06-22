// https://www.geeksforgeeks.org/problems/maximum-no-of-1s-row3027/0

// brootforce solution
class Sol {
    public static int maxOnes(int Mat[][], int N, int M) {
        // your code here
        int maxCnt = -1;
        int index = -1;
        int rowCnt = 0;
        
        for(int i=0; i<N; i++){
            
            rowCnt = 0;
            
            for(int j=0; j<M; j++){
                
                rowCnt += Mat[i][j];
            }
            if(rowCnt > maxCnt){
                maxCnt = rowCnt;
                index = i;
            }
        }
        return index;
    }
}


// optimal solution
class Sol {
    public static int maxOnes(int Mat[][], int N, int M) {
        // your code here
        int max_cnt = -1;
        int index = -1;
        
        for(int i=0; i<N; i++){
            int cnt_ones = M - rowWithMax1s(Mat[i], M, 1);
            if(cnt_ones > max_cnt){
                max_cnt = cnt_ones;
                index = i;
            }
        }
        return index;
    }
    
    
    static int rowWithMax1s(int[] row, int M, int x){
        
        int low = 0;
        int high = M-1;
    
        while(low <= high){
            
            int mid = low + (high - low) / 2;
            
            if(row[mid] >= x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}