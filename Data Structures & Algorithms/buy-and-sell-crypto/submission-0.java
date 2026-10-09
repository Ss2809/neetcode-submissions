class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int mini = prices[0];
        
        for (int i = 0; i < prices.length; i++) {
            maxp = Math.max(maxp, prices[i] - mini);
            if (mini > prices[i]) {
                mini = prices[i];
            }
        }
        return maxp;
    }
}
