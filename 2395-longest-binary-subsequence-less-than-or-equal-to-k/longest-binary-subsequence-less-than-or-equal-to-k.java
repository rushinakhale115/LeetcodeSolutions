class Solution {
    public int longestSubsequence(String s, int k) {
        int ans=0;
        int curr=0;
        int p=0;
        for(int i=s.length()-1 ; i>=0;i--){
            if(s.charAt(i)=='0'){
                ans++;
                p++;
            }
            else{
                curr+=Math.pow(2,p);
                if(curr<=k){
                    ans++;
                    p++;
                }

            }
        }


        return ans;
    }
}