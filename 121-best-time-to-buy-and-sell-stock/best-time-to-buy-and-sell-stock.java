class Solution {
    public int maxProfit(int[] prices) {
        int minprices=prices[0];
        int mx=0;
        for(int i=0;i<prices.length;i++){
            mx=Math.max(mx,prices[i]-minprices);
            minprices=Math.min(minprices,prices[i]);
        }
        return mx;
    }
}