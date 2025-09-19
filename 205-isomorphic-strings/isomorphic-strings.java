class Solution {
    public boolean isIsomorphic(String s, String t) {
    if(s.length() != t.length()){
        return false;
    }
    Map<Character,Character> map1 = new HashMap<>();
    Map<Character,Character> map2 = new HashMap<>();
    for(int i=0 ; i < s.length(); i++){
        char first = s.charAt(i);
        char second = t.charAt(i);

        if(map1.containsKey(first)){
            if(map1.get(first) != second){
                return false;
            }
        } else{
            map1.put(first, second);
        }

        if(map2.containsKey(second)){
            if(map2.get(second) != first){
                return false;
            }
        } else{
            map2.put(second, first);
        }
    }
    return true;
    }
}