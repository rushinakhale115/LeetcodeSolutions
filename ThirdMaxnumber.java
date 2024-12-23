import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=1;
        for(int i=n-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i-1];
            }
         }
         return nums[n-1];
        
    }
}

public class ThirdMaxnumber {
    public static void main(String[] args) {
        // Create a Solution object
        Solution solution = new Solution();

        // Test case 1: Array with more than 3 unique elements
        int[] nums1 = {3, 2, 1};
        System.out.println("Third maximum of " + Arrays.toString(nums1) + ": " + solution.thirdMax(nums1));
    }}
