
// brootforce solution
class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= k){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
}


// optimal solution
class Solution {
    public int findKthPositive(int[] arr, int k) {
         
         int n = arr.length;
         int low = 0;
         int high = n-1;

         while(low <= high){

            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);

            if(missing < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        // you can also return high + 1 + k
        return low + k;
    }
}