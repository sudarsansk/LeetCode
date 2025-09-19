class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        // Two maps to ensure bijective (one-to-one) mapping
        Map<Character, Character> map1 = new HashMap<>(); // s -> t mapping
        Map<Character, Character> map2 = new HashMap<>(); // t -> s mapping
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // Check if mapping from s to t exists
            if (map1.containsKey(charS)) {
                if (map1.get(charS) != charT) {
                    return false; // Inconsistent mapping
                }
            } else {
                map1.put(charS, charT);
            }
            
            // Check if mapping from t to s exists
            if (map2.containsKey(charT)) {
                if (map2.get(charT) != charS) {
                    return false; // Inconsistent reverse mapping
                }
            } else {
                map2.put(charT, charS);
            }
        }
        
        return true;
    }
}