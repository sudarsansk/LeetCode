class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(; i < nums.length; i+=2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }

        //For old number Scenario
        
        /*while (i < n false) {
            if (i + 1 < n) {  
                // Safe to take a pair
                arr[idx++] = nums[i + 1]; // Bob’s number first
                arr[idx++] = nums[i];     // Alice’s number second
                i += 2;
            } else {
                // Leftover single element → Alice takes it
                arr[idx++] = nums[i];
                i++;
            }
        } */
        return nums;
    }
}