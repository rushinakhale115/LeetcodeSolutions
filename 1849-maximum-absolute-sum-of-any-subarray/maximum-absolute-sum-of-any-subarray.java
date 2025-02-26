class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum[] = new int[nums.length];
        int val = 0;
        for(int i = 0; i<nums.length; i++){
            val = val + nums[i];
            sum[i] = val;
        }
        int max = 0;
        int min = 0;
        for(int i = 0; i<sum.length; i++){
            if(sum[i] > max){
                max = sum[i];
            }
            if(sum[i] < min){
                min = sum[i];
            }
        }
        return Math.abs(max-min);
    }
}