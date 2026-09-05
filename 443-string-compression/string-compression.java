class Solution {
    public int compress(char[] chars) {
        int index=0;
        int v=0;
        while(index<chars.length){

        int count=0;
        char ch=chars[index];
        while(index<chars.length && chars[index]==ch){
            count++;
            index++;
        }
        chars[v++]=ch;
        if(count>1){
            for(char digit :Integer.toString(count).toCharArray()){
                chars[v++]=digit;
            }
        }
    }
    return v;
}
}