class Solution {
    public int maximumCandies(int[] candies, long k) {
        Arrays.sort(candies);
        int n=candies.length;
        int left=1;
        int right=candies[n-1];
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canDistribute(candies,k,mid)){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }return ans;
        
        
    }
    public boolean canDistribute(int[]candies,long k,int mid){
        long count=0;
        for(int val:candies){
            if(mid!=0){
                count+=val/mid;
            }
        }return count>=k;
    }
}