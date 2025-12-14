class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3, 4};
        int target = 5;
        int low = 0;
        int high = arr.length - 1;
        System.out.println(search(arr, target, low, high));
    }
    static int search(int[] arr, int target, int low,int high){
        
        int mid = (low + high) / 2;
        
        // base condition
        if(low > high){
            return -1;
        }
        
        // target found
        if(arr[mid] == target){
            return mid;
        }
        
        // left sorted
        if(arr[low] < arr[mid]){
            if(arr[low] <= target && target <= arr[mid]){
                return search(arr, target, low, mid - 1);
            }
            else{
                return search(arr, target, mid + 1, high);
            }
        }
        
        // right sorted
        else{
            if(arr[mid] <= target && target <= arr[high]){
                return search(arr, target, mid + 1, high);
            }
            else{
                return search(arr, target, low, mid - 1);
            }
        }
    }
}