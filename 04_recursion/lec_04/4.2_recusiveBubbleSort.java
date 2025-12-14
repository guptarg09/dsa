import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {25, 32, 22, 12, 4, 12};
        bubble(arr, 0, arr.length - 1);

        // print the array in one line
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int start, int end) {
        if (end == 0) return; // base case

        if (start < end) {
            if (arr[start] < arr[start + 1]) {
                int temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
            bubble(arr, start + 1, end); // continue this pass
        } else {
            bubble(arr, 0, end - 1); // start next pass
        }
    }
}


// here do'nt need to return something because the each time same array object
//  is modified through different refrence variable