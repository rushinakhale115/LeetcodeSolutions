class Solution {
    public int differenceOfSums(int n, int m) {
         int a=0,b=0;
        for (int i=1;i<=n;i++){
            if(i%m==0){
                b=b+i;
            }

            else {
                a=a+i;
            }
        }
        return a-b;
    }
}