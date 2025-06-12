// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets

// brootforce solution
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int n = Arrays.stream(bloomDay).max().getAsInt();

        for(int i = 1; i <= n; i++){

            int sequences = numberOfSeq(bloomDay, k, i);
            if(sequences == m){
                return i;
            }
        }
        return -1;
    }

    static int numberOfSeq(int[] bloomDay, int k, int i){

        int count = 0;
        int bouquet = 0;

        for(int j = 0; j < bloomDay.length;  j++){
            if(bloomDay[j] <= i){
                count++;
            }
            else{
                count = 0;
            }
            if(count == k){
               bouquet++;
                count = 0; 
            }
        }
        return bouquet++;
    }
}


// optimal solution
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int n = bloomDay.length;

        int low = 1;
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;

        while(low <= high){
            
            int mid = low + (high - low) / 2;
            int sequences = numberOfSeq(bloomDay, m, k, mid);
            if(sequences >= m){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    static int numberOfSeq(int[] bloomDay, int m, int k, int mid){

        int bouquet = 0;
        int count = 0;
        for(int i =0; i < bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                count++;
            }
            else{
                count = 0;
            }
            if(count == k){
                bouquet++;
                count = 0;
            }
        }
        return bouquet;
    }
}