class Solution {
    public int subarraySum(int[] nums, int k) {
       int prefix=0; 
        int count=0; 
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(0,1); 
        for(int i=1;i<=nums.length;i++){ 
            prefix+=nums[i-1]; 
            int reqPre=prefix-k; 
            if(map.containsKey(reqPre)){ 
                count+=map.get(reqPre);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1); 
            
        }
        return count;
    }
}