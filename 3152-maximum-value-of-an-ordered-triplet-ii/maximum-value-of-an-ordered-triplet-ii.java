class Solution {
    public long maximumTripletValue(int[] nums) {
        long soln = 0;
        long maxDiff = 0;
        long maxNum = 0;
        for(int val : nums){
            soln = Math.max(soln, maxDiff * val);
            maxDiff = Math.max(maxDiff, (maxNum - val));
            maxNum = Math.max(maxNum, val);
        }
        return soln;
    }
}