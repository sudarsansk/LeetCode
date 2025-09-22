class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        // If we are here, it means all digits were 9, so we need to create a new array
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}