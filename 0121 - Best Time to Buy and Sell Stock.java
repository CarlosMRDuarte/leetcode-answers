class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowestValueSoFar = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowestValueSoFar) {
                lowestValueSoFar = prices[i];
                continue;
            }

            int diff = prices[i] - lowestValueSoFar;
            if (diff > profit) {
                profit = diff;
            }
        }

        return profit;
    }
}
