class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        int max = 0;
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            leftmax[i] = max; 
            max = Math.max(max, height[i]);
        }
        max = 0;
        for(int i = n-1; i >= 0; i--)
        {
            rightmax[i] = max;
            max = Math.max(max, height[i]);
        }
        for(int i = 0; i < n; i++)
        {
            int tmp = Math.min(leftmax[i], rightmax[i]) - height[i];
            if(tmp > 0) sum+= tmp;
        }
        return sum;
    }
}
