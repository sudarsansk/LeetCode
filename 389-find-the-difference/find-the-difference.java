class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        for(char c : s.toCharArray()){
            result ^= c;
        }

        for(char c : t.toCharArray()){
            result ^= c;
        }

        return result;

    /*
    
        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();

        for(char c : s.toCharArray()){
            s_map.put(c, s_map.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            if(!s_map.containsKey(c)){
                return c;
            }
            s_map.put(c, s_map.get(c) - 1);
            if(s_map.get(c) < 0){
                return c;
            }
            
        }
        return ' ';
    */
    }
}