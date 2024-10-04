class Solution {
    public int maxSubArray(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            count += nums[i];
            max = count > max ? count : max;
            count = count < 0 ? 0 : count;
        }
        return max;
    }
}