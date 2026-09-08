class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtrack(nums,list,res);
        return res;

    }
    private void backtrack(int[] nums,List<Integer> list,List<List<Integer>> res){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
        if(!list.contains(nums[i])){
            list.add(nums[i]);
        
        backtrack(nums,list,res);
        list.remove(list.size()-1);
        }
        }

    }

}