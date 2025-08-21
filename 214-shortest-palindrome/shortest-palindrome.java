class Solution {
    public String shortestPalindrome(String s) {
        String rev=new StringBuilder(s).reverse().toString();
        String temp=s+"#"+rev;
        int n=temp.length();
        int lps[]=new int[n];
        for(int i=1;i<n;i++){
            int j=lps[i-1];
            while(j>0 && temp.charAt(i)!=temp.charAt(j))
            j=lps[j-1];
            if(temp.charAt(i)==temp.charAt(j)){
                
                j++;
            }
            lps[i]=j;
            
        
        }
        return rev.substring(0,s.length()-lps[n-1])+s;
        
        
    }
}