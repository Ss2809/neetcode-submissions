class Solution {
    public boolean ischeck(String a, String b){
        char[] arr = a.toCharArray();
        char[] arr1 = b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr,arr1);
    }
    public boolean checkInclusion(String s1, String s2) {
        
        int k = s1.length();
        for(int i = 0 ;i <= s2.length()-k; i++){
            String sub = s2.substring(i,i+k);
            if(ischeck(sub,s1)){
                return true;
            }
        }
        return false;
    }
}
