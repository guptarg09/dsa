// https://leetcode.com/problems/majority-element


// brootforce

class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){

                if(nums[i] == nums[j]){
                    count++;

                    if(count > n/2){
                        return nums[j];
                    }
                }
            }
        }
        return -1;
    }
}


// better solution

class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if(count > n/2){
                return num;
            }
        }
        return -1;
    }
}


// optimal solution using Moon's Voting Algo

class Solution {
    public int majorityElement(int[] nums) {
        int el = 0; 
        int count = 0;

        for(int i = 0; i < nums.length; i++){

            if(count == 0){
                el = nums[i];
                count++;
            }
            else if(nums[i] == el){
                count++;
            }
            else{
                count--;
            }
        }
        return el;
    }
}