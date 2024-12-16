public class PowerofFour {
    public boolean isPowerOfFour(int n) {
        while (n >= 4) {
            if (n % 4 != 0) return false;
            n = n / 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        PowerofFour solution = new PowerofFour();
        
        // Test cases
        System.out.println(solution.isPowerOfFour(16));  // true
        System.out.println(solution.isPowerOfFour(5));   // false
        System.out.println(solution.isPowerOfFour(64));  // true
        System.out.println(solution.isPowerOfFour(1));   // true
        System.out.println(solution.isPowerOfFour(0));   // false
    }
}
