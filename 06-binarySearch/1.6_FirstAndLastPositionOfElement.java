// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

// brootforce solution
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = -1, last = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }
}





// optimal solution 
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        int lb = lowerBound(nums, n, target);
        int ub = upperBound(nums, n, target);;

        if(lb == n || nums[lb] != target){
            return new int[]{-1, -1};
        }
        return new int[]{lb, ub-1};
    }


    // function for lb
     public int lowerBound(int[] arr, int n, int target) {

        int low = 0, high = n - 1;
        int ans = n; 

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = mid;         
                high = mid - 1;   
            } 
            else {
                low = mid + 1;     
            }
        }
        return ans;
    }


    // function for ub
      int upperBound(int[] arr, int n, int target) {

        int low = 0;
        int high = n-1;
        int ans = n;
        

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
}




// 2nd - optimal solution using a single binary search

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        // lowerBound(nums, target, n);
        // upperBound(nums, target, n);
        return new int[]{lowerBound(nums, target, n), upperBound(nums, target, n)};
    }

    // function for first occurence
    public static int lowerBound(int[] nums, int target, int n){

        int low = 0;
        int high = n-1;
        int firstOcc = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                firstOcc = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return firstOcc;
    }

    // function for last occurence
    public static int upperBound(int[] nums, int target, int n){

        int low = 0;
        int high = n-1;
        int lastOcc = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                lastOcc = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return lastOcc;
    }  
}