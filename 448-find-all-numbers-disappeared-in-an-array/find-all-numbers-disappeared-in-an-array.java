class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for(int num : nums){
            result.put(num, result.getOrDefault(num, 0) + 1);
        }
        List<Integer> output = new ArrayList<>();
        for(int i =1; i <= nums.length; i++){
            if(result.get(i) == null){
                output.add(i);
            }
        }
        return output;
    }
}