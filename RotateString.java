

public class RotateString {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "abcde";
        String goal1 = "cdeab";
        System.out.println("Is \"" + goal1 + "\" a rotation of \"" + s1 + "\"? " + solution.rotateString(s1, goal1));

        String s2 = "abcde";
        String goal2 = "abced";
        System.out.println("Is \"" + goal2 + "\" a rotation of \"" + s2 + "\"? " + solution.rotateString(s2, goal2));
    }}

class Solution {
    public boolean rotateString(String s, String goal) {
        // Edge
        if (s.length() != goal.length()) {
            return false;
        }
        
        return ((s + s).indexOf(goal) >= 0);
    }
}
