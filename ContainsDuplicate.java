
import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        // Example test array
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Check for duplicates in the array
        boolean result = solution.containsDuplicate(nums);

        // Print the result
        if (result) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("The array does not contain duplicates.");
        }
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    return true;
                }

            }
        
        return false;
    }
}