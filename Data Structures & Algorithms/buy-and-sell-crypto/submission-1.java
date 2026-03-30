class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int i : prices)
        {
            if(i < min) min = i;
            int sell = i - min;
            if(sell > max) max = sell;
        }
        return (max > 0) ? max : 0;
    }
}
