// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1, high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            high = Math.max(high, nums[i]);
        }

        int result = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isDivisionPossible(nums, mid, threshold)) {
                result = Math.min(result, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    private boolean isDivisionPossible(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double) num / divisor);
            if (sum > threshold) {
                return false;
            }
        }
        return true;
    }
}
