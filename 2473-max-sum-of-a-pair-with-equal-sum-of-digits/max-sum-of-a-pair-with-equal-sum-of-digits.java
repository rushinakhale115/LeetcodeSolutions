class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> H = new HashMap<>();
        int ms = -1 ;
        for(int num: nums){
            int sum = 0;
            int val = num;
            while(val>0){
                sum += (val%10);
                val /= 10 ;
            }
            if(H.containsKey(sum)){
                ms = Math.max(H.get(sum)+num,ms);
                if(H.get(sum) < num){
                    H.put(sum,num);
                }
            }
            else{
                H.put(sum,num);
            }
        }
        return ms ;
    }
}