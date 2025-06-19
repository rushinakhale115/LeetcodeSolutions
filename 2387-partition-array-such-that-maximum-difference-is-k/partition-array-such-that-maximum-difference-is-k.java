class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int rec=nums[0];
        int ans=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-rec>k){
                ans++;
                rec=nums[i];
            }
        }
return ans;
        
        
    }
}