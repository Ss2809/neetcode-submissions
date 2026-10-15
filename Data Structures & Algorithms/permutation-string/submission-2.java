class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        if(n > s2.length()){
            return false;
        }
        int[] a = new int[26];
        int[] b = new int[26];

        for(int i = 0; i < n; i++){
            a[s1.charAt(i)- 'a']++;
            b[s2.charAt(i)- 'a']++;
        }
        for(int i = n; i < s2.length(); i++){
            if(Arrays.equals(a,b)){
                return true;
            }
            b[s2.charAt(i)- 'a']++;
            b[s2.charAt(i-n) - 'a']--;

        }
        return Arrays.equals(a,b);
    }
}
