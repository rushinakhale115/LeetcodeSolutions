class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=0;int neg=1;
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[neg]=nums[i];
                neg+=2;
            }
            else{
                ans[p]=nums[i];
                p+=2;
            }
        }
        return ans;
        
    }
}