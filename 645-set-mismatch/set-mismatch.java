class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        boolean[] visited = new boolean[nums.length + 4];

        for(int num : nums) {
            if(visited[num]){
                result[0] = num;
            }
            visited[num] = true;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!visited[i]) {
                result[1] = i;
                break;
            }
        }
        
        return result;
    }
}