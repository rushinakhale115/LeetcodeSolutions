class Solution5 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }



    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4};  // Example input

        int newLength = solution.removeDuplicates(nums);

        // Print the updated array with unique elements
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

