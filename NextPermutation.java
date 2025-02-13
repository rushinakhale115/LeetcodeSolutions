import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1
        int[] nums1 = {1, 2, 3};
        solution.nextPermutation(nums1);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 2]
        
        // Test Case 2
        int[] nums2 = {3, 2, 1};
        solution.nextPermutation(nums2);
        System.out.println(Arrays.toString(nums2)); // Output: [1, 2, 3]

        // Test Case 3
        int[] nums3 = {1, 1, 5};
        solution.nextPermutation(nums3);
        System.out.println(Arrays.toString(nums3)); // Output: [1, 5, 1]

        // Test Case 4
        int[] nums4 = {1};
        solution.nextPermutation(nums4);
        System.out.println(Arrays.toString(nums4)); // Output: [1]
    }
}

class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i>=0 && nums[i] >= nums[i + 1]){
            i--;
        }

        if (i != -1) {
            int j= nums.length-1;
            while (j>=0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }

        int start = i + 1;
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}