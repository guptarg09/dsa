// https://www.geeksforgeeks.org/problems/square-root/1

// brootforce solution
class Solution {
    int floorSqrt(int n) {
        // Your code here
        int low = 1;
        int high = n;
        int ans = 1;
        
        for(int i = 0; i <= n; i++){
            if(i*i <= n){
                ans = i;
            }
            else{
                break;
            }
        }
        return ans;
    }
}


// optimal solution
class Solution {
    int floorSqrt(int n) {
        // Your code here
        int low = 1;
        int high = n;
        int ans = 1;
        
        while(low <= high){
            
            int mid = low + (high - low) / 2;
            if(mid*mid <= n){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}