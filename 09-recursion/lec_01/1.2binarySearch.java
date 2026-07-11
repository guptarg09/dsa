class bs{
    public static void main(String[] args){
        
        int[] arr = {2, 3, 5, 8, 10};
        int target = 10;
        
        int low = 0;
        int high = arr.length-1;
        System.out.println(binarySearch(arr, target, low, high));
    }
    static int binarySearch(int[] arr, int target, int    low, int high){
        
        if(low > high){
            return -1;
        }
        int mid = low + (high-low) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return binarySearch(arr, target, low, mid-1);
        }
        return binarySearch(arr, target, mid+1, high);
    }
}