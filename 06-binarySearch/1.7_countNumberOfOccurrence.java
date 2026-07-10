// https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1

class Solution {
    int countFreq(int[] arr, int target) {
        
        int n = arr.length;
        int first = lowerBound(arr, target, n);
        int last = upperBound(arr, target, n);

        if (first == -1 || last == -1) return 0;

        return last - first + 1;
    }

    // function for first occurrence
    public static int lowerBound(int[] arr, int target, int n) {
        
        int low = 0;
        int high = n - 1;
        int firstOcc = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                firstOcc = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return firstOcc;
    }

    // function for last occurrence
    public static int upperBound(int[] arr, int target, int n) {
        
        int low = 0;
        int high = n - 1;
        int lastOcc = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                lastOcc = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lastOcc;
    }
}
