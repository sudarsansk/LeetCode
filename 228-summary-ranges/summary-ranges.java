class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        if (nums.length == 0) {
            return ranges;
        }
        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                int end = nums[i - 1];
                if (start == end) {
                    ranges.add(String.valueOf(start));
                } else {
                    ranges.add(start + "->" + end);
                }
                start = nums[i];
            }
        }

        // Handle the last range
        int end = nums[nums.length - 1];
        if (start == end) {
            ranges.add(String.valueOf(start));
        } else {
            ranges.add(start + "->" + end);
        }
        return ranges;  
    }
}