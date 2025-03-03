class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> x=new ArrayList<>();
        ArrayList <Integer> y=new ArrayList<>();
        ArrayList<Integer> z=new ArrayList<>();

        for(int i:nums){
            if(i<pivot){
                x.add(i);
            }
        
        else if (i==pivot){
            y.add(i);
        }
        else{
            z.add(i);
        }
        }
        int n=0;
        for(int i=0;i<x.size();i++){
            nums[n]=x.get(i);
            n++;
        }
        for(int i=0;i<y.size();i++){
            nums[n]=y.get(i);
            n++;
        }
        for(int i=0;i<z.size();i++){
            nums[n]=z.get(i);
            n++;
        }
        return nums;
        
    }
}