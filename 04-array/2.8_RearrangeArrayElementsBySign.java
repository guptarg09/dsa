// https://leetcode.com/problems/rearrange-array-elements-by-sign

// brootforce solution

class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int posIndex = 0;
        int negIndex = 0;
        int n = nums.length;
        int[] posEle = new int[n/2];
        int[] negEle = new int[n/2];

        for(int i = 0; i < n; i++){

            if(nums[i] > 0){
                posEle[posIndex++] = nums[i];
            }
            else{
                negEle[negIndex++] = nums[i];
            }
        }
        int i = 0;
        posIndex = 0;
        negIndex = 0;

        while(posIndex < n/2 && negIndex < n/2){

            nums[i++] = posEle[posIndex++];
            nums[i++] = negEle[negIndex++];

        }
        return nums;
    }
}


// optimal solution

class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int posIndex = 0;
        int negIndex = 1;
        int n = nums.length;
        int[] result = new int[n];

        for(int i = 0; i < n; i++){

            if(nums[i] > 0){
                result[posIndex] = nums[i];
                posIndex += 2;
            }
            else{
                result[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return result;
    }
}