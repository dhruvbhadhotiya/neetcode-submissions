class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ind = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int diff = target - nums[i];
            if(map.containsKey(diff))
            {
                ind[0] = map.get(diff);
                ind[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return ind;
    }
}
