class Solution {
    public int finalElement(int[] nums) {
        int n=nums.length;
        return Math.max(nums[0],nums[n-1]);
        
    }
}