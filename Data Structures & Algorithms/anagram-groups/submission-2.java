class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String i : strs)
        {
            int[] key = new int[26];
            for(char j : i.toCharArray()) key[j - 'a'] += 1;
            String sorted = Arrays.toString(key);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(i);
        }
        return new ArrayList<>(map.values());
    }
}
