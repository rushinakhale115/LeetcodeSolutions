class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLength=0;
        int left=0;
        int currentMask=0;
        for (int right=0;right<nums.length;right++){
            while((currentMask & nums[right])!=0){
                currentMask ^=nums[left];
                left++;
            }
            currentMask |= nums[right];
            maxLength=Math.max(maxLength,right-left+1);
        }return maxLength;
        
    }
}