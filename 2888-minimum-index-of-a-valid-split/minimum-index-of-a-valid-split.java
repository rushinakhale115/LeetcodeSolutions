class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();

        int majority = -1; // Variable to store the majority element
        int count = 0; // Counter for Boyer-Moore Voting Algorithm

        // Step 1: Find the majority element candidate using Boyer-Moore Majority Vote Algorithm
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                majority = nums.get(i);
                count = 1;
            } else if (nums.get(i) == majority) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Count the occurrences of the majority element in the entire list
        int majorityCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == majority) { // Fixed incorrect condition
                majorityCount++;
            }
        }

        // Step 3: Find the minimum index where the split condition holds
        count = 0; // Reset count for checking the split condition

        for (int i = 0; i < n; i++) {
            if (nums.get(i) == majority) {
                count++; // Increment count for occurrences in the left part
            }

            int leftSize = i + 1; // Size of the left partition
            int rightSize = n - leftSize; // Size of the right partition
            int remainingCount = majorityCount - count; // Count of majority element in the right partition

            // Condition: majority must be dominant in both partitions
            if (count * 2 > leftSize && remainingCount * 2 > rightSize) {
                return i; // Return the minimum valid index
            }
        }

        return -1; // Return -1 if no valid split is found
    }
    
}