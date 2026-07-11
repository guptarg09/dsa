import java.util.ArrayList;
public class Find{
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 4};
        int target = 4;
        System.out.println(findAllIndexes(arr, target, 0, new ArrayList<Integer>()));
    }

    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }  
        return findAllIndexes(arr, target, index+1, list);
    }
}


// we are adding element in list object via different refrence variable