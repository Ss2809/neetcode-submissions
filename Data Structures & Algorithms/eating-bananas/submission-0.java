class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // koko naa at time 1 banana eat karel aani maximum max aahet arr madhe tevde eat karle okay 
        int left = 1;
        int right = 0;
        for(int i : piles){
            right =  Math.max(i,right);
        }

        while(left < right){
            int mid = left + (right-left)/2;
            int hour = 0;
            for(int i : piles){
                hour  += (i+mid-1)/mid;
            }
            if(hour <= h){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}
