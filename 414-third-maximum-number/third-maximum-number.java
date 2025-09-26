class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;  // Largest
        long second = Long.MIN_VALUE; // Second largest  
        long third = Long.MIN_VALUE;  // Third largest
        
        for (int num : nums) {
            // Skip duplicates
            if (num == first || num == second || num == third) {
                continue;
            }
            
            if (num > first) {
                // Shift values down
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }
        
        if (third == Long.MIN_VALUE) {
            return (int) first;
        }
        
        return (int) third;
    }
}