class Solution {
    public int minOperations(String s) {
        int n = s.length();

        boolean sorted = true;
        char min = s.charAt(0);
        char max = s.charAt(0);

        // Check whether the string is sorted
        // and find minimum and maximum characters
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);

            if (c < s.charAt(i - 1)) {
                sorted = false;
            }

            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);
        }

        if (sorted) {
            return 0;
        }

        if (n == 2) {
            return -1;
        }

        // If the minimum is at the beginning
        // or the maximum is at the end
        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }

        // Check the middle characters
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min || s.charAt(i) == max) {
                return 2;
            }
        }

        return 3;
    }
}