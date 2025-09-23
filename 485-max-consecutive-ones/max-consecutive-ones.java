class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximum = 0;
        int count = 0;
        for(int num : nums){
            if(num != 0){
                count++;
            } else {
                maximum = Math.max(maximum,count);
                count = 0;
            }
        }
        return maximum = Math.max(maximum,count);
    }
}