class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 1;
        int[] right = new int[n];
        right[n-1] = 1;
        int[] ans = new int[n];

        int prod = 1;
        // left product array
        for(int i = 1; i < n; i++){
            prod = prod * nums[i-1];
            left[i] = prod;
        }

        prod = 1;
        // right product array;
        for(int i = n - 2; i >= 0; i--)
        {
            prod = prod * nums[i+1];
            right[i] = prod;
        }

        for(int i = 0; i < n; i++)
        {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}  
