import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Adding 1 to [1, 2, 3]
        int[] digits1 = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(digits1));
        int[] result1 = solution.plusOne(digits1);
        System.out.println("Output: " + Arrays.toString(result1));

        // Test case 2: Adding 1 to [9, 9, 9]
        int[] digits2 = {9, 9, 9};
        System.out.println("Input: " + Arrays.toString(digits2));
        int[] result2 = solution.plusOne(digits2);
        System.out.println("Output: " + Arrays.toString(result2));

        // Test case 3: Adding 1 to [0]
        int[] digits3 = {0};
        System.out.println("Input: " + Arrays.toString(digits3));
        int[] result3 = solution.plusOne(digits3);
        System.out.println("Output: " + Arrays.toString(result3));

        // Test case 4: Adding 1 to [4, 3, 2, 1]
        int[] digits4 = {4, 3, 2, 1};
        System.out.println("Input: " + Arrays.toString(digits4));
        int[] result4 = solution.plusOne(digits4);
        System.out.println("Output: " + Arrays.toString(result4));
    }
}


class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
    }
}
