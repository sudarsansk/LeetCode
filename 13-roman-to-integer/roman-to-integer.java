class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> result = new HashMap<>();
        result.put('I', 1);
        result.put('V', 5);
        result.put('X', 10);
        result.put('L', 50);
        result.put('C', 100);
        result.put('D', 500);
        result.put('M', 1000);

        int sum = 0;
        int n = s.length();
        for(int i=0; i < n;i++){
            int currentValue = result.get(s.charAt(i));
            if(i < n - 1){
                int nextVal = result.get(s.charAt(i+1));
                if(currentValue < nextVal) {
                    sum = sum + (nextVal - currentValue);
                    i++;
                } else {
                    sum = sum + currentValue;
                }
            } else{
                sum = sum + currentValue;
            }
        }

        return sum;

    }
}