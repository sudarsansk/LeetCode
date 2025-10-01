class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        Map<Character,Integer> letters = new HashMap<>();
        int j=0;
        for(int i=97; i<=122;i++){
            letters.put((char)i, widths[j]);
            j++;
        }
        int[] result = new int[2];
        int rowCount = 0;
        int count = 0;
        for(int z=0; z < s.length() ;z++){
            if(count < 100){
                count += letters.get(s.charAt(z));
                if(count > 100){
                    rowCount++;
                    count=letters.get(s.charAt(z));
                }
            } else {
                rowCount++;
                count=letters.get(s.charAt(z));
            }
        }

        result[0] = rowCount + 1;
        result[1] = count;
        return result;
    }
}