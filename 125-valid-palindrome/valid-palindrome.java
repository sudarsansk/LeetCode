class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                result.append(Character.toLowerCase(c));
            }
        }
        String output = result.toString();
        String reverse = result.reverse().toString();
        return reverse.equals(output);
    }
}