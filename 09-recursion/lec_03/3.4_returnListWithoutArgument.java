// same question but here we d'nt define array list in argument

class solution{
    public static void main(String[] args){
        int[] arr = [1, 2, 3, 4, 4, 8];
        int target = 4;
        int index = 0;
        System.out.println(findAllIndexes(arr, target, index));
    }

    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){   // base condition
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndexes(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}