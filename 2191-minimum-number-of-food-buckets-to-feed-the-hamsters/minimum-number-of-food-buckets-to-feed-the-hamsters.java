class Solution {
    public int minimumBuckets(String s) {
        char[]hamsters=s.toCharArray();
        int count=0;
        for(int i=0;i<hamsters.length;i++){
            if(hamsters[i]=='H'){
                if(i-1>=0 && hamsters[i-1]=='B'){
                    continue;
                }
                if(i+1<hamsters.length && hamsters[i+1]=='.'){
                    hamsters[i+1]='B';
                }
                else if(i-1>=0 && hamsters[i-1]=='.'){
                    hamsters[i-1]='B';
                }else{
                    return -1;
                }
            }
        }
        for(int i=0;i<hamsters.length;i++){
            if(hamsters[i]=='B'){
                count++;
            }
        }
        return count;
    
        }
}