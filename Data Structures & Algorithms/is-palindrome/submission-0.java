class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder b = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                b.append(Character.toLowerCase(c));
            }
        }
        return b.toString().equals(b.reverse().toString());
    }
}
