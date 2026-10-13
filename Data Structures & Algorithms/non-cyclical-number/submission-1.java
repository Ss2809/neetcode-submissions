class Solution {
    public boolean isHappy(int n){
        HashSet<Integer>vis = new HashSet<>();

        while(!vis.contains(n)){
            vis.add(n);
            n = Sumcal(n);
            if( n== 1){
                return true;
            }
        }
        return false;
    }
    public int Sumcal(int n) {
      int sum = 0;
      while(n > 0){
        int digit = n % 10;
        sum += digit*digit;
        n = n/10;
        
      }
      return sum;  
     
    }
}
