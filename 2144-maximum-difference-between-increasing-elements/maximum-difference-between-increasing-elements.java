class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                max=Math.max((nums[j]-nums[i]),max);

            }
        }
        if(max>0){
            return max;
        }else{
            return -1;
        }
        
    }
}