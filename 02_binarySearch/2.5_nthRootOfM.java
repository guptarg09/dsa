// https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1


// brootforce solution
class Solution {
    public int nthRoot(int n, int m) {
        if (n == 1) return m; // Edge case: 1st root of any number is the number itself

        for (int i = 1; i <= m; i++) {
            
            long power = (long) Math.pow(i, n);  // Cast to long to avoid lossy conversion
            if (power == m) return i;
            if (power > m) break;
        }
        return -1;
    }
}

// optimal solution
class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low = 1;
        int high = m;
        while(low <= high){
            
            int mid = (low + high) / 2;
            long midPower = power(mid, n);
            if(midPower == m){
                return mid;
            }
            else if(midPower > m){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    
    // method to find power of mid
    private long power(int mid, int n){
        long ans = 1;
        for(int i = 0; i < n; i++){
            ans = ans*mid;
        }
        return ans;
    }
}