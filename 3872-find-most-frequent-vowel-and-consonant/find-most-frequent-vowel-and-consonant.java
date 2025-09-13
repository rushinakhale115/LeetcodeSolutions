class Solution {
    public int maxFreqSum(String s) {
        int vowelmax=0;
        int[]freq=new int[26];
        int consonentmax=0;
        for(char c:s.toCharArray()){
            int index=c-'a';
            freq[index]+=1;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowelmax=Math.max(vowelmax,freq[index]);
                
            }else{
                consonentmax=Math.max(consonentmax,freq[index]);
            }
        }
        return vowelmax+consonentmax;
        
    }
}