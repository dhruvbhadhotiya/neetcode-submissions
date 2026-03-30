class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++)
        {
            for(int j = i+1; j < nums.length-1; j++)
            {
                for(int k = j+1; k < nums.length; k++)
                {
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        Collections.sort(tmp);
                        if(!lst.contains(tmp)) lst.add(tmp);
                    }
                }
            }
        }
        return lst;
    }
}
