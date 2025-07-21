class Solution {
    public String makeFancyString(String s) {
        char prev = s.charAt(0);
        int freq = 1;

        StringBuilder sb = new StringBuilder();
        sb.append(prev);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                freq++;
            } else {
                prev = s.charAt(i);
                freq = 1;
            }

            if (freq < 3)
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}