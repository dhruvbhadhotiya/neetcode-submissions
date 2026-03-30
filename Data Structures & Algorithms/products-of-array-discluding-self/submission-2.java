class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1; 
        ans[n-1] = 1;

        int prod = 1;
        // left product array
        for(int i = 1; i < n; i++){
            prod = prod * nums[i-1];
            ans[i] = prod;
        }

        prod = 1;
        // right product array;
        for(int i = n - 2; i >= 0; i--)
        {
            prod = prod * nums[i+1];
            ans[i] = ans[i] * prod;
        }

        return ans;
    }
}  
