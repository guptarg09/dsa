// https://leetcode.com/problems/longest-consecutive-sequence


// brootforce solution


class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        if(n == 0){
            return 0;
        }

        int longest = 1;

        for(int i = 0; i < nums.length; i++){
            int currEle = nums[i];
            int count = 1;

            boolean found;

            do{
                found = false;

                for(int j = 0; j < n; j++){

                    if(nums[j] == currEle+1){
                        found = true;
                        count++;
                        currEle++;
                        break;
                    }
                }
            }while(found);
    
        longest = Math.max(longest, count);
        } 
        return longest;   
    }
}


// optimal solution

class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        int currCount = 0;
        int longest = 0;
        int lastSmaller = Integer.MIN_VALUE;

        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){

            if(nums[i]-1 == lastSmaller){
                currCount++;
                lastSmaller = nums[i];
            }

            if(nums[i] != lastSmaller){
                currCount = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, currCount);
        }
        return longest;
    }
}

