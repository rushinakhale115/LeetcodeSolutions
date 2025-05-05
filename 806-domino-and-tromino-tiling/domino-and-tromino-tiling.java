class Solution {
    public int numTilings(int n) {
        int mod=(int)(1000000007);
        if(n==1)return 1;
        if(n==2)return 2;
        if(n==3)return 5;
        int a[]=new int[n];
        a[0]=1;a[1]=2;a[2]=5;
        for(int i=3;i<n;i++){
            a[i]=(((a[i-1]+a[i-1])%mod)+a[i-3])%mod;
        }
        return (a[n-1])%mod;
    }
}