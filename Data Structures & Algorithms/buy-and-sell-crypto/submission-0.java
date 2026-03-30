class Solution {
    public int maxProfit(int[] prices) {
        boolean des = true;
        for(int i = 0; i < prices.length - 1; i++) if(prices[i] < prices[i+1]) des = false;
        if(des) return 0;

        int max = 0;

        for(int i = 0; i < prices.length; i++)
        {
            for(int j = i+1; j < prices.length; j++)
            {
                int curr = prices[j] - prices[i];
                if(curr > max) max =curr;
            }
        }
        return max;

    }
}
