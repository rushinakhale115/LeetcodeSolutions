public class MaximumSubarray {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums1));
        // Expected Output: 6 (subarray [4, -1, 2, 1])

        // Test case 2
        int[] nums2 = {1};
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums2));
        // Expected Output: 1

        // Test case 3
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums3));
        // Expected Output: 23 (subarray [5, 4, -1, 7, 8])

        // Test case 4
        int[] nums4 = {-1, -2, -3, -4};
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums4));
        // Expected Output: -1 (subarray [-1])
    }
}


class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i<n ; i++){
           
            sum = sum + nums[i];
           
            if(sum > maxi){
                 maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
            
        }
        return maxi;
        
    }
}
