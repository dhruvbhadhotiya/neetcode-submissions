class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // find max banana's pile
        int max = piles[0];
        for(int i : piles) if(i > max) max = i;
        // search for min rate
        int left = 1, right = max;
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            int currHour = 0;
            System.out.println(mid);
            for(int i : piles) currHour += (int)Math.ceil(i/(double)mid);
            System.out.println(currHour);
            if(currHour > h) left = mid+1;
            else right = mid -1;
        }
        return left;
    }
}
