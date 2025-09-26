class Solution {
    public String longestCommonPrefix(String[] strs) {
    String [] str = strs;
    if (strs == null || strs.length == 0) {
        return "";
    }
    String first = strs[0];
    int k = 0;
    for(; k < first.length() ; k++) {
		char currentChar = str[0].charAt(k);
			
		for(int z =1; z < str.length ; z++) {
			if(k >= str[z].length() || currentChar != str[z].charAt(k)) {
				return str[0].substring(0, k);
			}
		}
	}

	return first.substring(0, k);
    }
}