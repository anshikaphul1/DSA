class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int total = 0;
        for(int i=0;i<prices.length;i++){
            if (prices[i] > buy) {
                profit = prices[i] - buy; // profit from this transaction
                total += profit;           // add only this transaction's profit
            }
             buy = prices[i];
        }
        return total;
    }
}