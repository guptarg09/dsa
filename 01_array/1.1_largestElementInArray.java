// task is to find the largest element in array

class Solution {
    public static int largest(int[] arr) {
        // code here
        int largestElement = arr[0];
        for(int i = 1; i < arr.length; i++){
            
            if(arr[i] > largestElement){
                largestElement = arr[i];
            }
        }
    return largestElement;
    }
}
