
// Given an array nums containing n distinct numbers in the range [0, n], 
// return the only number in the range that is missing from the array.


// brootforce solution

class Solution {
    public int missingNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            boolean bool = false;
            for(int j = 0; j < nums.length; j++){
                if(i == nums[j]){
                    bool = true;
                    break;
                }
            }
            if(!bool){
                    return i;
            }
        }
        return nums.length;
    }
}


// better - 1st
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i = 0; i <= nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}

// better - 2nd
class Solution {
    public int missingNumber(int[] nums) {
        boolean[] seen = new boolean[nums.length+1];
        for(int num : nums){
            seen[num] = true;
        }
        for(int i = 0; i <= seen.length; i++){
            if(!seen[i]){
                return i;
            }
        }
        return -1;
    }
}


// optimal - 1st(sum approach)
public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}


// optimal - 2nd(XOR method)
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int XOR1 = 0;
        int XOR2 = 0;
        for(int i = 0; i < n; i++){
            XOR2 = XOR2^nums[i];
            XOR1 = XOR1^(i+1);
        }
        // XOR1 = XOR1^(n+2);
        return XOR1^XOR2;
    }
}