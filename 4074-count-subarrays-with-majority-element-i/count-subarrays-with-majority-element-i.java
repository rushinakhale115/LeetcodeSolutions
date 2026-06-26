class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=i;j<n;j++){
                if(nums[j]==target){
                    cnt++;
                }
                int size=(j-i+1);
                if(cnt>(size/2)){
                    ans++;
                }
            }
        }
        return ans;
    }
}