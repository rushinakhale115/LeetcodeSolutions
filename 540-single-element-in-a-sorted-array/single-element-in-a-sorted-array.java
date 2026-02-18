class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums[0]!=nums[1])return nums[0];
        
        int low=1, high=nums.length-1;
        if(nums[high]!=nums[high-1])return nums[high];
        high-=1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid] !=nums[mid+1])return nums[mid];
            else if((nums[mid]==nums[mid-1] && mid%2==1) || (nums[mid]==nums[mid+1] && mid%2==0))
            {
                low=mid+1;
            }
            else 
            {
                high=mid-1;
            }
        }
        return -1;
    }
}