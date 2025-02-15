class Solution {
    public int punishmentNumber(int n) {
        int sum=0;

        for(int i=1;i<=n;i++){
            int square=i*i;
            if(partition(0,0,i,String.valueOf(square))){
                sum=sum+square;
            }
        }
        return sum;
    }

    private static boolean partition(int index,int currentSum,int target,String s){
        if(index==s.length()){
            return currentSum==target;
        }
        int num=0;
        for(int i=index;i<s.length();i++){
            num=num*10+(s.charAt(i)-'0');

            if(partition(i+1,currentSum+num,target,s)){
                return true;
            }
        }
        return false;
    }
}
    
