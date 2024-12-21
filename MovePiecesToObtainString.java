public class MovePiecesToObtainString {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String start1 = "_L__R__R_";
        String target1 = "L______RR";
        System.out.println("Test Case 1: " + solution.canChange(start1, target1)); // Expected output: true

        String start2 = "R_L_";
        String target2 = "__RL";
        System.out.println("Test Case 2: " + solution.canChange(start2, target2)); // Expected output: false

        String start3 = "_R";
        String target3 = "R_";
        System.out.println("Test Case 3: " + solution.canChange(start3, target3)); // Expected output: false

        String start4 = "L__R__L_";
        String target4 = "_L__RL__";
        System.out.println("Test Case 4: " + solution.canChange(start4, target4)); // Expected output: false

        String start5 = "_R__L_";
        String target5 = "_R__L_";
        System.out.println("Test Case 5: " + solution.canChange(start5, target5)); // Expected output: true
    }
}


class Solution {
    public boolean canChange(String start, String target) {
        int i1 = 0;
        int i2 = 0;
        while (true) {
            while(i1 < target.length() && target.charAt(i1) == '_') {
                i1++;
            }
            while(i2 < start.length() && start.charAt(i2) == '_') {
                i2++;
            }
            if (i1 == target.length() || i2 == start.length()) {
                break;
            }
            if (target.charAt(i1) != start.charAt(i2)) {
                return false;
            }
            if (target.charAt(i1) == 'L' && i1 > i2) {
                return false;
            }
            if (target.charAt(i1) == 'R' && i1 < i2) {
                return false;
            }
            i1++;
            i2++;
        }
        return i1 == i2;
    }
}
