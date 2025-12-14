// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero

class Solution {
    public int numberOfSteps(int num) {
        return countSteps(num);
    }
    static int countSteps(int num){
        return helper(num, 0);
    }
    static int helper(int n, int steps){
        if(n == 0){
            return steps;
        }
        int rem = n % 10;
        if(rem % 2 == 0){
            return helper(n/2, steps+1); // can't use steps++;
        }
        return helper(n-1, steps+1);
    }
}