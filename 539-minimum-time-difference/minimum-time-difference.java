class Solution {
    public int findMinDifference(List<String> timePoints) {
       int[] arr = new int[timePoints.size()];
       for(int i=0; i < timePoints.size();i++){
            int hours = Integer.parseInt(timePoints.get(i).substring(0,2));
            int minutes = Integer.parseInt(timePoints.get(i).substring(3));
            arr[i] = hours * 60 + minutes;
       }

        Arrays.sort(arr);
        int least = Integer.MAX_VALUE;
        int temp;
        for (int i = 1; i < arr.length; i++) {
            temp = Math.min(least, arr[i] - arr[i-1]);
            least = temp > 720 ? 1440 - temp : temp;
        }
        int circular = arr[arr.length-1] - arr[0];
        return Math.min(least, circular > 720 ? 1440 - circular : circular);
    }
}