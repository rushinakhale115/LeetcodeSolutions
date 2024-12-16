public class MissingNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing Number: " + solution.missingNumber(nums1)); // Output: 2

        // Test Case 2
        int[] nums2 = {0, 1};
        System.out.println("Missing Number: " + solution.missingNumber(nums2)); // Output: 2

        // Test Case 3
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing Number: " + solution.missingNumber(nums3)); // Output: 8

        // Test Case 4
        int[] nums4 = {0};
        System.out.println("Missing Number: " + solution.missingNumber(nums4)); // Output: 1
    }
}


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int num:nums){
            actualSum += num;
        }

        return expectedSum-actualSum;
    }
}