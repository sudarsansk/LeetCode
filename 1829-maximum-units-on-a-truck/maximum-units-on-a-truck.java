class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int count = 0;
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        for(int[] a : boxTypes) {
           int min = Math.min(truckSize, a[0]);
           count += min * a[1];
           truckSize -= min;
           if(truckSize == 0) return count;
        }
        return count;
    }
}