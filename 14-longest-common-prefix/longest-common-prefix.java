class Solution {
    public String longestCommonPrefix(String[] strs) {
       if (strs == null || strs.length == 0) {
        return "";
       }
         // Use the first string as reference
    String first = strs[0];
    int maxCommonLength = first.length();
    
    for (int i = 1; i < strs.length; i++) {
        String current = strs[i];
        int j = 0;
        
        while (j < maxCommonLength && j < current.length() 
               && first.charAt(j) == current.charAt(j)) {
            j++;
        }
        
        // Update the maximum common length
        maxCommonLength = Math.min(maxCommonLength, j);
        
        if (maxCommonLength == 0) {
            return "";
        }
    }
    return first.substring(0, maxCommonLength);
    }
}