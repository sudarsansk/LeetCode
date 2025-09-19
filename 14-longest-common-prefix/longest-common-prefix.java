class Solution {
    public String longestCommonPrefix(String[] strs) {
       // strs = new String[]{"cir", "car"};
        String first = strs[0];
        int minimum = strs[0].length();
        for(int i=1; i < strs.length; i++){
            int j = 0;
            for(int k=0; k < strs[i].length(); k++){
                if(k < first.length() && first.charAt(k) == strs[i].charAt(k)){
                    j++;
                } else {
                    break;
                }
            }
            minimum = Math.min(minimum, j);
        }
        return first.substring(0, minimum);
    }
}