class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=2;
        int count=0;
        while(r<n){
            if(nums[l]+nums[r] == nums[l+1]/2 && nums[l+1]%2 == 0) count++;
            l++;
            r++;
        }
        return count;
    }
}