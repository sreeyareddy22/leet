class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], profit = 0,res = 0;
        for(int i = 1;i < prices.length;i++){
            profit = prices[i]-buy;
            if(res < profit)
                res = profit;
            if(buy > prices[i])
                buy = prices[i];
        }
    return res;
    }
}