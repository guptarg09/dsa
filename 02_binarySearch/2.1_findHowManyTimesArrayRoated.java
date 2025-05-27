// https://www.geeksforgeeks.org/problems/rotation4723/1

class Solution {
    public int findKRotation(List<Integer> arr) {
        
        int n = arr.size();
        int low = 0, high = n - 1;
        int index = -1;
        int minElement = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            // If left part is sorted
            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) < minElement) {
                    minElement = arr.get(low);
                    index = low;
                }
                low = mid + 1;
            }
            // If right part is sorted
            else {
                if (arr.get(mid) < minElement) {
                    minElement = arr.get(mid);
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
}