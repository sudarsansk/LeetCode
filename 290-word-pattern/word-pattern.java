class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> result = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        for(int i = 0 ; i < pattern.length(); i++){
            if(result.containsKey(pattern.charAt(i))){
                if(!words[i].equals(result.get(pattern.charAt(i)))){
                    return false;
                }
            } else {
                result.put(pattern.charAt(i), words[i]);
            }
            if(wordToChar.containsKey(words[i])){
                if(wordToChar.get(words[i]) != pattern.charAt(i)){
                    return false;
                }
            } else {
                wordToChar.put(words[i], pattern.charAt(i));
            }

        }
        return true;
    }
}