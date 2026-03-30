class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        List<Integer> lst = new ArrayList<>();
        for(int i : nums) if(!lst.contains(i)) lst.add(i);
        lst.sort((a, b) -> a - b);
        System.out.println(lst);
        int max = 0, curr = 0;
        for(int i = 0; i < lst.size() -1; i++)
        {
            if(lst.get(i) + 1 == lst.get(i+1)) curr += 1;
            else curr = 0;
            if(curr > max) max = curr;
        }
        return max+1;
    }
}
