class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k=set.size();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> st=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                st.add(nums[j]);
                if(st.size()==k){
                    ans++;
                }
            }
        }
        return ans;
    }
}