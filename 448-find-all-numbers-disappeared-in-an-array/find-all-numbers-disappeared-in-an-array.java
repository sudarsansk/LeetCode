class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*
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
        */
        int[] newArr = new int[nums.length + 1];
        List<Integer> output = new ArrayList<>();
        for(int i=0 ; i < nums.length ; i++){
            newArr[nums[i]]++;
        }
        for(int j=1; j <= nums.length; j++){
            if(newArr[j] == 0){
                output.add(j);
            }
        }
        return output;
    }
}