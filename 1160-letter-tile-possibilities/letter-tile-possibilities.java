class Solution {
    public int numTilePossibilities(String tiles) {
        int[]count=new int[26];
        for(char c:tiles.toCharArray()){
            count[c-'A']++;

        }return backtrack(count);
        
    }
    private int backtrack(int[]count){
        int sum=0;
        for(int i=0;i<26;i++){
            if(count[i]>0){
                sum++;
                count[i]--;
                sum+=backtrack(count);
                count[i]++;
            }
        }return sum;
    }
}