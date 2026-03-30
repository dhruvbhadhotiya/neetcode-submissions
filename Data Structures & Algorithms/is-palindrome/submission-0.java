class Solution {
    boolean palin(String s)
    {
        int i = 0, j = s.length()-1;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for(char i : arr)
        {
            if(Character.isLetterOrDigit(i)) sb.append(Character.toLowerCase(i));
        }
        return palin(sb.toString());
    }
}
