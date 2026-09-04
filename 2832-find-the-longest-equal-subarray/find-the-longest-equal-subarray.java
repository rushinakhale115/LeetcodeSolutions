class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int s=0,maxFrequency=0;
        int n=nums.size();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int val=nums.get(i);
            map.put(val,map.getOrDefault(val,0)+1);
            maxFrequency=Math.max(maxFrequency,map.get(val));

            int extraElement=(i-s+1)-maxFrequency;
            if(extraElement>k){
                int num=nums.get(s);
                map.put(num,map.get(num)-1);
                s++;
            }
        }
        return maxFrequency;
        
    }
}