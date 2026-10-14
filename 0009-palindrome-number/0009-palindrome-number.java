class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) {
            return false;
        }

        String str = String.valueOf(x);
        String rev = new StringBuilder(str).reverse().toString();

        return str.equals(rev);
    }
}