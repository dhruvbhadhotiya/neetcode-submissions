class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length-1;
        int max = 0;

        while(i < j)
        {
            max = Math.max(max, Math.min(heights[i], heights[j])*(j-i));
            if(heights[i] > heights[j]) j--;
            else i++;
        }

        return max;
    }
}
