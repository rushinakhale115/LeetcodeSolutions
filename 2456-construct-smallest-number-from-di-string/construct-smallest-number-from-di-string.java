class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st = new Stack<>();
        String res = "";
        int n = pattern.length();
        int c = 1;
        st.push(c);
        //c+=1;
        for(int i=0;i<n;i++){
            if(pattern.charAt(i)=='I'){
                while(!st.empty()){
                    int r = st.peek();
                    res += Integer.toString(r);
                    st.pop();
                }
            }
            st.push(++c);
        }
    while(!st.empty()){
        int r = st.peek();
        res += Integer.toString(r);
        st.pop();
    }
        return res;
    }
}