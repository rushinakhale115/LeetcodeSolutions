class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute-force approach: Check all pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No Match Found");
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method and print the result
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
