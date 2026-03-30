class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        
        int max = 0;
        for(Integer i : set){
            if(!set.contains(i - 1))
            {
                int curr = 0;
                while(set.contains(i + curr))
                {
                    curr += 1;
                }
                max = Math.max(max, curr);
            }
        }
        return max;
    }
}
