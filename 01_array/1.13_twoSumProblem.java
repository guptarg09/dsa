// Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add up to target.

// brootforce solution

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){

                if(nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}

// optimal solution

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}