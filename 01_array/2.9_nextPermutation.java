// brootforce done by making all pemutations through recursion and then match each one 

// optimal solution

class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int index = -1;

        // Step 1: Find the breakpoint
        for(int i = n-2; i >= 0; i--){

            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        // Step 2: Check if it is last permutation ?
        if(index == -1){
            reverse(nums, 0, n-1);
            return;
        }

        // Step 3: Find the smallest element larger than nums[i]
        for(int i = n-1; i > index; i--){

            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }

        // Step 3: Reverse the subarray to the right of i
        reverse(nums, index+1, n-1);
    }

    // reverse function
    public void reverse(int[] arr, int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // swap function
    public void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}