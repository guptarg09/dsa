

// Given two arrays a[] and b[], the task is to find the number of elements in the 
// union between these two arrays.

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int num : a){
            set.add(num);
        }
        for(int num : b){
            set.add(num);
        }
        return set.size();
    }
}