class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int profit = 0;
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if (prices[i] < prices[j]) {
                    int currentProfit = prices[j] - prices[i];
                    profit = Math.max(currentProfit, profit);
                }
            }
        }

        return profit;
    }
}
