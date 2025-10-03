class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> result = new HashMap<>();
        result.put(')','(');
        result.put('}','{');
        result.put(']','[');

        Stack stack = new Stack();
        for(Character letter : s.toCharArray()){
            if(result.containsKey(letter)){
                if(stack.isEmpty() || stack.pop() != result.get(letter)){
                    return false;
                }
            } else {
                stack.push(letter);
            }
        }
        return stack.isEmpty();
    }
}