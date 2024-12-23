class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < word.length()) {
            char curr = word.charAt(idx);
            int charcount = 0;
            while (idx < word.length() && word.charAt(idx) == curr
                    && charcount < 9) {
                charcount++;
                idx++;
            }
            sb.append(charcount).append(curr);
        }
        return sb.toString();
    }
}

public class StringCompression3 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String word1 = "aaaaaaaaaa";  // Expected output: "9a1a"
        String word2 = "aabbbcccccccccc"; // Expected output: "2a3b9c3c"
        String word3 = "abcdef"; // Expected output: "1a1b1c1d1e1f"
        String word4 = "zzzzyyyyxxxxwwwwvvv"; // Expected output: "4z4y4x4w3v"

        // Testing the compressedString method
        System.out.println("Compressed \"" + word1 + "\": " + solution.compressedString(word1));
        System.out.println("Compressed \"" + word2 + "\": " + solution.compressedString(word2));
        System.out.println("Compressed \"" + word3 + "\": " + solution.compressedString(word3));
        System.out.println("Compressed \"" + word4 + "\": " + solution.compressedString(word4));
    }
}
