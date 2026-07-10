// https://leetcode.com/problems/find-numbers-with-even-number-of-digits


class Solution {

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int num) {
        return digits(num) % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = -num;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}


// class Solution {
//     public int findNumbers(int[] nums) {
//         int count = 0;

//         for(int i = 0 ; i<nums.length; i++) {
//             int digits = String.valueOf(nums[i]).length();

//             if(digits %2 == 0){
//                 count++;
//             }
//         }
//         return count;
//     }
// }
