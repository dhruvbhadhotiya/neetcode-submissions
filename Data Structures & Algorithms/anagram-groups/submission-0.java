class Solution {
    String sort(String s)
    {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String i : strs)
        {
            String sorted = sort(i);
            if(map.containsKey(sorted))
            {
                map.get(sorted).add(i);
            }
            else
            
            {
                map.put(sorted, new ArrayList<String>());
                map.get(sorted).add(i);
            }
        }
        return new ArrayList<>(map.values());
    }
}
