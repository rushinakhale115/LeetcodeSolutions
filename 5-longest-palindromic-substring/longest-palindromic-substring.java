class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("^"); // Starting sentinel
        for (int i = 0; i < s.length(); i++) {
            sb.append("#");
            sb.append(s.charAt(i));
        }
        sb.append("#$"); // Ending sentinel

        char[] sChars = sb.toString().toCharArray();
        int[] p = new int[sChars.length];
        int center = 0, right = 0;

        int maxLen = 0;
        int centerIndex = 0;

        for (int i = 1; i < sChars.length - 1; i++) {
            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            
            while (sChars[i + (1 + p[i])] == sChars[i - (1 + p[i])]) {
                p[i]++;
            }

         
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}
