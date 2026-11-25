class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder newstr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                newstr.append(Character.toLowerCase(ch));
            }
        }

        int i = 0;
        int r = newstr.length() - 1;

        while (i < r) {
            if (newstr.charAt(i) != newstr.charAt(r)) {
                return false;
            }

            i++;
            r--;
        }

        return true;
    }
}