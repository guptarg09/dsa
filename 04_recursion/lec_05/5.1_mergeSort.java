import java.util.Arrays;
class mergeSort{
    public static void main(String[] args){
        int[] arr = {12, 3, 23, 2, 23, 65, 43};
        System.out.println(Arrays.toString(divide(arr)));
    }
    static int[] divide(int[] arr){
        
        // base condition
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int left[] = divide(Arrays.copyOfRange(arr, 0, mid));
        int right[] = divide(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k++] = first[i++];
            }
            else{
                mix[k++] = second[j++];
             }
        }
        while(i < first.length){
            mix[k++] = first[i++];
        }
        
        while(j < second.length){
            mix[k++] = second[j++];
        }
        return mix;
    }
}