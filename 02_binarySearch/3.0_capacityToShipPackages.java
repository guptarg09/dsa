// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days


// brootforce solution 
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int minCapacity = getMax(weights);
        int maxCapacity = getSum(weights); 

        for(int capacity = minCapacity; capacity <= maxCapacity; capacity++){

            if(canShip(weights, days, capacity)){
                return capacity;
            }
        }   
        return maxCapacity; 
    }
    static boolean canShip(int[] weights, int days, int capacity){

        int day = 1;
        int currLoad = 0;

        for(int weight : weights){
            if(currLoad + weight > capacity){
                day += 1;
                currLoad = weight;
            } 
            else{
                currLoad += weight;
            }
        }
        return day <= days;
    }

    static int getMax(int[] weights){
        int max = weights[0];
        for(int w : weights){
            if(max < w){
                max = w;
            }
        }
        return max;
    }
    static int getSum(int[] weights){

        int sum = 0;
        for(int w : weights){
            sum += w;
        }
        return sum;
    }
}



// optimal solution 
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int low = getMax(weights);
        int high = getSum(weights); 

        while(low <= high){

            int mid = low + (high - low) / 2;
            int reqDays = canShip(weights, days, mid);
            
            if(reqDays <= days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    static int canShip(int[] weights, int days, int capacity){

        int day = 1;
        int currLoad = 0;

        for(int weight : weights){
            if(currLoad + weight > capacity){
                day += 1;
                currLoad = weight;
            } 
            else{
                currLoad += weight;
            }
        }
        return day;
    }

    static int getMax(int[] weights){
        int max = weights[0];
        for(int w : weights){
            if(max < w){
                max = w;
            }
        }
        return max;
    }
    static int getSum(int[] weights){

        int sum = 0;
        for(int w : weights){
            sum += w;
        }
        return sum;
    }
}