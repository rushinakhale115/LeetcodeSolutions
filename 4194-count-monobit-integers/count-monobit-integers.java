class Solution {
    public int countMonobit(int n) {
        int k=1, i=1;
        while(i<=n){
            k++;
            i=(i<<1) | 1;
        }
        return k;
        

        
    }
}