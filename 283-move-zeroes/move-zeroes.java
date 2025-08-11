class Solution {
    public void moveZeroes(int[] nums){
        int l=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp=nums[l];
                nums[l]=nums[right];
                nums[right]=temp;
                l++;
            }
        }

    }
    }
