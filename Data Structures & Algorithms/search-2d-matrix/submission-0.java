class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int i = 0, j = matrix.length-1;
        while(i <= j)
        {
            int mid = i + (j-i)/2;
            int[] arr = matrix[mid];
            if(target >= arr[0] && target <= arr[arr.length-1])
            {
                int l = 0, r = arr.length-1;
                while(l <= r)
                {
                    int mid1 = l + (r - l)/2;
                    int midele = arr[mid1];
                    if(midele == target) return true;
                    else if(target < midele) r = mid1 - 1;
                    else l = mid1 + 1;
                }
                return false;
            }
            else if(target < arr[0]) j = mid - 1;
            else i = mid + 1;

        }
        return false;
    }
}
