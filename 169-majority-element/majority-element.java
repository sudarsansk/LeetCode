class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for(int num : nums){
            int count = result.getOrDefault(num, 0) + 1;
            result.put(num, count);
        }

        Optional<Integer> output = result.entrySet().stream()
                                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                .map(entrySet -> entrySet.getKey())
                                .findFirst();

        // Find majority element
        int max =  result.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .get()
            .getKey();
        
        return output.get();
    }
}