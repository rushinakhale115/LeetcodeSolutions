class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] r=new int[26];
        int[]m=new int[26];
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        
        for(int i=0;i<magazine.length();i++){
            m[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            r[ransomNote.charAt(i)-'a']++;

        }
        for(int i=0;i<26;i++){
            if(r[i]>m[i]){
                return false;
            }
        }
        return true;

        
    }
}