public class PrimeSubstractionOperation {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {10, 15, 20};
        System.out.println("Test case 1: " + solution.primeSubOperation(nums1)); // Output: true/false

        // Test case 2
        int[] nums2 = {8, 7, 6};
        System.out.println("Test case 2: " + solution.primeSubOperation(nums2)); // Output: false

        // Test case 3
        int[] nums3 = {5, 10, 11};
        System.out.println("Test case 3: " + solution.primeSubOperation(nums3)); // Output: true/false

        // Test case 4
        int[] nums4 = {4, 3, 2, 1};
        System.out.println("Test case 4: " + solution.primeSubOperation(nums4)); // Output: false

        // Test case 5
        int[] nums5 = {3, 11, 17, 19};
        System.out.println("Test case 5: " + solution.primeSubOperation(nums5)); // Output: true
    }
}


class Solution {
    public boolean primeSubOperation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (checkSort(nums)) {
                return true;
            }
            int n = (i == 0) ? nums[0] : nums[i] - nums[i - 1];
            if (n <= 0) {
                return false;
            }
            nums[i] -= getLessPrime(n);
        }
        return checkSort(nums);
    }

    boolean checkSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    int getLessPrime(int n) {
        n--;
        while (n > 1 && !isPrime(n)) {
            n--;
        }
        return n > 1 ? n : 0;
    }

    boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}