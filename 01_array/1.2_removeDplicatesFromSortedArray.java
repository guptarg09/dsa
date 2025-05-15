class Solution {
    public int removeDuplicates(int[] nums){

        int x=0;
        for(int j=1; j<nums.length; j++){
            if (nums[j] != nums[x]) {
                x++;
                nums[x] = nums[j];
            }
        }
        return x+1;
    }
}