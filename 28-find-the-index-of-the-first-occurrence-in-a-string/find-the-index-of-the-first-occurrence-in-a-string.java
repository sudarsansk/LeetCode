class Solution {
    public int strStr(String haystack, String needle) {
        //Using Index Of
        //return haystack.indexOf(needle);
         if(haystack.contains(needle)){
            if(haystack.length()==1) return 0;
            int i=0;
            int j=needle.length();
            while(j<=haystack.length()){
                if(haystack.substring(i,j).equals(needle)) return i;
                i++;j++;
            }
        }
        return -1;
    }
}