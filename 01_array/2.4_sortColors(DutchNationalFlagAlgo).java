// https://leetcode.com/problems/sort-colors

// brootfoce solution using merge sort


class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        for (int t = 0; t < temp.length; t++) {
            nums[left + t] = temp[t];
        }
    }
}


// better solution

class Solution {
    public void sortColors(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count0++;
            }
            else if(nums[i] == 1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int i = 0;
        while(count0-- > 0){
            nums[i++] = 0;
        }
         while(count1-- > 0){
            nums[i++] = 1;
        }
         while(count2-- > 0){
            nums[i++] = 2;
        }
    }
}


// optimal solution

class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    // Swap helper method
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
