class Solution {
    public int numberOfSubstrings(String s) {
        int[] counts = new int[3]; 
        int  j = 0;
        int n = s.length();
        for(;j<3;j++){
            counts[s.charAt(j)-'a']++;
        }
        int i = 0;
        int count = 0;
        while(j<=n){
            if (j -i >2 && counts[0]>0 && counts[1]>0 && counts[2]>0) {
                count+=(n-j)+1;
                counts[s.charAt(i) - 'a']--;
                i++;
            }
            else{
                if(j<n) counts[s.charAt(j) - 'a']++;
                j++;
            }
        }   
        return count;
    }
}