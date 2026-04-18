class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int original=n;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return Math.abs(original-rev);
    
        
    }
}