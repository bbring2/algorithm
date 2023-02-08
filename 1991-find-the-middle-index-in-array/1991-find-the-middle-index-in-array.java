class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        
        for(int i : nums) sum += i;

        int leftSum = 0;
        int rightSum = sum;

        for(int i = 0; i < nums.length; i++){
            rightSum -= nums[i];

            if(rightSum == leftSum) return i;

            leftSum += nums[i];
        }
        return -1;
    }
}