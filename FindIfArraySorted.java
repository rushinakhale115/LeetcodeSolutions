class Solution {
    private boolean check(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return false;
        }
        return true;
    }

    public boolean canSortArray(int[] nums) {
        int[] bitCount = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            bitCount[i] = Integer.bitCount(nums[i]);
        }

        int k = 0;
        while (k < nums.length) {
            for (int i = 1; i < nums.length; i++) {
                if (bitCount[i] == bitCount[i - 1] && nums[i] < nums[i - 1]) {
                    // int temp = nums[i];
                    // nums[i]=nums[i-1];
                    // nums[i-1]=temp;
                    nums[i] = nums[i] + nums[i - 1];
                    nums[i - 1] = nums[i] - nums[i - 1];
                    nums[i] = nums[i] - nums[i - 1];
                }
            }
            if (check(nums))
                return true;
            k++;
        }
        return false;
    }
}
public class FindIfArraySorted {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] nums1 = {3, 1, 7, 5};
        int[] nums2 = {5, 7, 3, 9};
        int[] nums3 = {8, 4, 2, 1};

        // Call the method and print results
        System.out.println("Can sort nums1: " + solution.canSortArray(nums1)); // Expected: true or false
        System.out.println("Can sort nums2: " + solution.canSortArray(nums2)); // Expected: true or false
        System.out.println("Can sort nums3: " + solution.canSortArray(nums3)); // Expected: true or false

        // Optional: print the array after attempting to sort
        System.out.println("Final state of nums1: " + java.util.Arrays.toString(nums1));
        System.out.println("Final state of nums2: " + java.util.Arrays.toString(nums2));
        System.out.println("Final state of nums3: " + java.util.Arrays.toString(nums3));
    }
}
