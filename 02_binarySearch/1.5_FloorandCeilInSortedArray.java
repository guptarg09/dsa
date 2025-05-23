// https://takeuforward.org/plus/dsa/problems/floor-and-ceil-in-sorted-array


class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        
        int low = 0, high = nums.length - 1;
        int floor = -1;
        int ceil = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(nums[mid] == x){
                return new int[]{nums[mid], nums[mid]};
            }
            else if(nums[mid] < x){
                floor = nums[mid];
                low = mid + 1;
            }
            else{
                ceil = nums[mid];
                high = mid - 1;
            }
        }
        return new int[]{floor, ceil};
    }
}