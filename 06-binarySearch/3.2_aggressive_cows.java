// brootforce solution
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int min = stalls[0];
        int max = stalls[n-1];
        
        for(int i = 1; i <= max-min; i++){
            
            if(canWePlace(stalls, k, i)){
                continue;
            }
            else{
                return i-1;
            }
        }
        return max - min;
    }
    // function for placement of cows
    static boolean canWePlace(int[] stalls, int cows, int distance){
        
        int n = stalls.length;
        int cntCows = 1;
        int last = stalls[0];
        
        for(int i = 1; i < n; i++){
            
            if(stalls[i] - last >= distance){
                cntCows++;
                last = stalls[i];
            }
        }
        if(cntCows >= cows){
            return true;
        }
        return false;
    }
}


// optimal solution
public class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int min = stalls[0];
        int max = stalls[stalls.length - 1];

        int result = 0;

        for (int d = 1; d <= max - min; d++) {
            if (canWePlace(stalls, k, d)) {
                result = d; // Try larger distance
            } else {
                break; // No need to try bigger distances
            }
        }

        return result;
    }

    static boolean canWePlace(int[] stalls, int cows, int distance) {
        int count = 1;
        int lastPlaced = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlaced >= distance) {
                count++;
                lastPlaced = stalls[i];
            }
        }

        return count >= cows;
    }
}