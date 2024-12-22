class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        while (n > 1) {
            if (n % 2 == 0)
                n /= 2;
            else if (n % 3 == 0)
                n /= 3;
            else if (n % 5 == 0)
                n /= 5;
            else
                return false;
        }
        return true;
    }
}

public class UglyNumber {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] testNumbers = {6, 8, 14, 1, 30};  // Sample numbers to test
        
        for (int num : testNumbers) {
            System.out.println("Is " + num + " an ugly number? " + sol.isUgly(num));
        }
    }
}

