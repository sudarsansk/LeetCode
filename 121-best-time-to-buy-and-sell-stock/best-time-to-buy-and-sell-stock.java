class Solution {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int maxProfit = 0;
        for(int price : prices){
            if(price < minimum){
                minimum = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minimum);
            }
        }
        return maxProfit;
    }
}