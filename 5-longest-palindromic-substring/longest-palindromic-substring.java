class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n==0){
            return "";
        }
        String ans ="";

        //for odd length Palindrome
        for(int i=0;i<n;i++){
            int start=i,end=i;
            while(start>=0 && end<n && s.charAt(start)==s.charAt(end)){
                String current=s.substring(start,end+1);
                if(current.length()>ans.length()){
                    ans=current;
                }
                start--;
                end++;
            }
            
        }

        //for even length Pallindrome
        
        for(int i=0;i<n-1;i++){
            int start2=i;
            int end2=i+1;
            while(start2>=0 && end2<n && s.charAt(start2)==s.charAt(end2)){
                String current=s.substring(start2,end2+1);
                if(current.length()>ans.length()){
                    ans=current;
                }
                start2--;
                end2++;
            }
            
        }
        return ans;
    }
}