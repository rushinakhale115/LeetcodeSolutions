class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] newArr = new int[n];
        for(int i = 0 ; i < n ; i++){
            newArr[(i + k) % n] = nums[i];
        }
        for(int i = 0; i < n ; i++){
            nums[i] = newArr[i];
        }
    }
}

public class RotateArray {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(nums1, k1);
        System.out.print("Rotated array 1: ");
        printArray(nums1);

        // Test case 2
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        solution.rotate(nums2, k2);
        System.out.print("Rotated array 2: ");
        printArray(nums2);

        // Test case 3
        int[] nums3 = {1, 2};
        int k3 = 3;
        solution.rotate(nums3, k3);
        System.out.print("Rotated array 3: ");
        printArray(nums3);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
