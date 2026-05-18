class Solution {
    public int maxProfit(int[] prices) {
        int day = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            int PorL = prices[i] - day;
            if(prices[i] > day){
                maxProfit = maxProfit + PorL;
            }
            day = prices[i];
        }
        return maxProfit;
    }
}