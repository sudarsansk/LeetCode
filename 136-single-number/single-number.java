class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> result = new HashMap<>(); 
        for(int num : nums){
            if(!result.containsKey(num)){
                result.put(num,1);
            } else {
                result.put(num, result.get(num) +  1);
            }        
        }

        //Using Stream 
        Optional<Integer> output = result.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst();
            
        //Using XOR Truth Table
        // A (Input 1) | B (Input 2) | X = A'B + AB'
        // ------------|-------------|---------------
        //     0      |      0      |       0
        //     0      |      1      |       1
        //     1      |      0      |       1
        //     1      |      1      |       0
        int count = 0;
        for (int num : nums) {
            count ^= num;  // XOR operation
        }

        //Using Simple EntrySet and For Loop
        for(Map.Entry<Integer, Integer> entry : result.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return output.isPresent() ? output.get() : 0;
    }
}