public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String test1 = "babad";
        String test2 = "cbbd";
        String test3 = "a";
        String test4 = "ac";
        String test5 = "forgeeksskeegfor";
        
        // Print results
        System.out.println("Longest Palindromic Substring of \"" + test1 + "\": " + solution.longestPalindrome(test1));
        System.out.println("Longest Palindromic Substring of \"" + test2 + "\": " + solution.longestPalindrome(test2));
        System.out.println("Longest Palindromic Substring of \"" + test3 + "\": " + solution.longestPalindrome(test3));
        System.out.println("Longest Palindromic Substring of \"" + test4 + "\": " + solution.longestPalindrome(test4));
        System.out.println("Longest Palindromic Substring of \"" + test5 + "\": " + solution.longestPalindrome(test5));
    }
}

class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String lps = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            // odd length
            int low = i;
            int high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            String palindrome = s.substring(low + 1, high);
            if (palindrome.length() > lps.length()) {
                lps = palindrome;
            }
            // even length
            low = i;
            high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            palindrome = s.substring(low + 1, high);
            if (palindrome.length() > lps.length()) {
                lps = palindrome;
            }
        }
        return lps;
    }
}
