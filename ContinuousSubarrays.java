import java.util.TreeMap
public class ContinuousSubarrays {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test cases
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {10, 10, 11, 12, 10};

        // Test case 1
        long result1 = solution.continuousSubarrays(nums1);
        System.out.println("Number of continuous subarrays for nums1: " + result1);

        // Test case 2
        long result2 = solution.continuousSubarrays(nums2);
        System.out.println("Number of continuous subarrays for nums2: " + result2);

        // Test case 3
        long result3 = solution.continuousSubarrays(nums3);
        System.out.println("Number of continuous subarrays for nums3: " + result3);
    }
}

class Solution {
    public long continuousSubarrays(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int i = 0;
        int j = 0;
        int n = nums.length;
        long count = 0;
        while (j < n) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while (Math.abs(map.firstKey() - map.lastKey()) > 2) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;
            }
            count += j - i + 1;
            j++;
        }
        return count;
    }
}
