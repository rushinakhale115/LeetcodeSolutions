class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int maxLen=0,start=0;
        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
            if(hm.containsKey(ch) && hm.get(ch)>=start){
                start=hm.get(ch)+1;
            }
            
            hm.put(ch,end);
            maxLen=Math.max(maxLen,end-start+1);
            

        }
        return maxLen;
    }
}