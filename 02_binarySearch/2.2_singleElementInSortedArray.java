// https://leetcode.com/problems/single-element-in-a-sorted-array

// brootforce - 1st
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length;
        int low = 0;
        int high = n-1;

         if (nums.length == 1){
            return nums[0];
        }

        int i = 0;
        while(i < n-1){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
            i += 2;
        }
        return nums[n-1];
    }
}

// brootforce - 2nd
class Solution{
    public int singleNonDuplicate(int[] nums){
        if (nums.length == 1){
            return nums[0];
        }
        
        for (int i = 0; i < nums.length; i++){
            if (i == 0) {
                if (nums[i] != nums[i + 1]){
                    return nums[i];
                }
            } else if (i == nums.length - 1){
                if (nums[i] != nums[i - 1]){
                    return nums[i];
                }
            } else{
                if (nums[i-1] != nums[i] && nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
        }
        
        return -1;
    }
}