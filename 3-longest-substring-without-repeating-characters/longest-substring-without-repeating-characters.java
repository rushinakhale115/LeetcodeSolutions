class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n<=1) return n;
        HashMap<Character,Integer>hm=new HashMap<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            if(hm.containsKey(ch)){
                left=Math.max(left,hm.get(ch)+1);
            }
            hm.put(ch,right);

            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
        

        
    }
}