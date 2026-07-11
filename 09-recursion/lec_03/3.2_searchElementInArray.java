public class Find{
    public static void main(String[] args){
        int[] arr = {1, 10, 4, 4, 5};
        int target = 4;
        System.out.println(findEle(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
    }

    // return true or false 
    static boolean findEle(int[] arr, int target, int index){
        // base condition
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || findEle(arr, target, index+1); 
    }

    // return the index 
    static int findIndex(int[] arr, int target, int index){
        // base condition
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }
} 