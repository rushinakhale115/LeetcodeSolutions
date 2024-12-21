public class MaxConsecutiveones {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Test Case 1: " + solution.findMaxConsecutiveOnes(nums1)); // Expected Output: 3

        // Test Case 2
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Test Case 2: " + solution.findMaxConsecutiveOnes(nums2)); // Expected Output: 2

        // Test Case 3
        int[] nums3 = {0, 0, 0, 0, 0};
        System.out.println("Test Case 3: " + solution.findMaxConsecutiveOnes(nums3)); // Expected Output: 0

        // Test Case 4
        int[] nums4 = {1, 1, 1, 1, 1};
        System.out.println("Test Case 4: " + solution.findMaxConsecutiveOnes(nums4)); // Expected Output: 5

        // Test Case 5
        int[] nums5 = {};
        System.out.println("Test Case 5: " + solution.findMaxConsecutiveOnes(nums5)); // Expected Output: 0

        // Test Case 6: Large input
        int[] nums6 = new int[1000000];
        for (int i = 0; i < nums6.length; i++) {
            nums6[i] = i % 2; // Alternating 1s and 0s
        }
        System.out.println("Test Case 6: " + solution.findMaxConsecutiveOnes(nums6)); // Expected Output: 1
    }
}


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0 , num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else
            count = 0;
            if(count>num)
            num=count;
        }
        return num;
    }
}
