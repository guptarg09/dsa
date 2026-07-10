// https://leetcode.com/problems/maximum-subarray

// brootforce solution uses three loops(k -> from i to j)

// better solution

class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int maxSumSubArraySum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int subArraySum = 0;
            for(int j = i; j < n; j++){

                subArraySum = subArraySum + nums[j];
                if(subArraySum > maxSumSubArraySum){

                    maxSumSubArraySum = subArraySum;
                }
            }
        }
        return maxSumSubArraySum;
    }
}


// optimal solution usinf kadane's algo

class Solution {
    public int maxSubArray(int[] nums) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){

            currSum += nums[i];

            if(currSum > maxSum){
                maxSum = currSum;
            }

            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}