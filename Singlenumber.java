import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1) {
            return nums[0];
        }
        for(int i = 0; i < nums.length - 1; i += 2) {
            if(nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {4, 1, 2, 1, 2};
        System.out.println("Single number in nums1: " + solution.singleNumber(nums1));  // Output: 4

        // Test case 2
        int[] nums2 = {2, 2, 3, 3, 4, 4, 5};
        System.out.println("Single number in nums2: " + solution.singleNumber(nums2));  // Output: 5

        // Test case 3
        int[] nums3 = {7};
        System.out.println("Single number in nums3: " + solution.singleNumber(nums3));  // Output: 7
    }
}
