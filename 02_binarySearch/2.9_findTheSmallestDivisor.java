// brootforce solution

import java.util.Arrays;

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxVal = Arrays.stream(nums).max().getAsInt();

        for (int divisor = 1; divisor <= maxVal; divisor++) {
            int sum = 0;
            for (int num : nums) {
                sum += (num + divisor - 1) / divisor; 
            }
            if (sum <= threshold) {
                return divisor;
            }
        }

        return maxVal;
    }
}


// optimal solution 

import java.util.Arrays;

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sumOfDiv = getSum(nums, mid);

            if (sumOfDiv <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static int getSum(int[] nums, int divisor) {
        int divSum = 0;
        for (int num : nums) {
            divSum += (num + divisor - 1) / divisor;
        }
        return divSum;
    }
}
