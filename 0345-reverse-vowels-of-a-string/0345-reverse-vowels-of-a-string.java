class Solution {

    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
        ArrayList<Character> v = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                v.add(s.charAt(i));
            }
        }

        Collections.reverse(v);

        StringBuilder sb = new StringBuilder(s);
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                sb.setCharAt(i, v.get(j++));
            }
        }

        return sb.toString();
    }
}