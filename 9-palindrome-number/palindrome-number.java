class Solution {
    public boolean isPalindrome(int x) {
        String name = String.valueOf(x);
        StringBuilder out = new StringBuilder();
        for(int i = name.length() - 1; i >= 0 ; i--){
            out.append(name.charAt(i));
        }
        return name.equals(out.toString());
        
    }
}