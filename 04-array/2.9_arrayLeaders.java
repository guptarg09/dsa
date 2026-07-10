// brootforce solution

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            
            boolean isLeader = true;
            
            for(int j = i+1; j < n; j++){
                
                if(arr[i] < arr[j]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                list.add(arr[i]);
            }
        }
        return list;
    }
}


// optimal solution

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        int maxRight = arr[n-1];
        list.add(maxRight);
        
        for(int i = n-2; i >= 0; i--){
            
            if(arr[i] >= maxRight){
                
                maxRight = arr[i];
                list.add(maxRight);
            }
        }
        Collections.reverse(list);
        return list;
    }
}