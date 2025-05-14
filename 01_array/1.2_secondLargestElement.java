lass Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            if(arr[i] < largest && arr[i] > secLargest){
                secLargest = arr[i];
            }
        }
        return (secLargest == Integer.MIN_VALUE) ? -1 : secLargest;
    }
}