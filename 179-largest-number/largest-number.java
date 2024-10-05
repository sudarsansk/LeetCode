class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0; i< nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));
        String result = String.join("", arr);
        return result.charAt(0) == '0' ? "0" : result;
    }
}