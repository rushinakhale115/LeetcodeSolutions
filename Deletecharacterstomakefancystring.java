public class Deletecharacterstomakefancystring {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String test1 = "leeetcode";
        String test2 = "aaabaaaa";
        String test3 = "aab";

        System.out.println("Input: " + test1 + " -> Output: " + solution.makeFancyString(test1));
        System.out.println("Input: " + test2 + " -> Output: " + solution.makeFancyString(test2));
        System.out.println("Input: " + test3 + " -> Output: " + solution.makeFancyString(test3));
    }
}


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
