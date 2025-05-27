// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
class Solution {
    public int findMin(int[] nums) {
        
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){

            int mid = low + (high - low) / 2;

            // check if array is already sorted
            if(nums[low] <= nums[high]){
                ans = Math.min(ans, nums[low]);
                break;
            }

             // if left sorted
            if(nums[low] <= nums[mid]){
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            }

             // if right sorted 
            else{
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}