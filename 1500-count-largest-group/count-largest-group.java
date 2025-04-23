class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            int s = sum(i);
             map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
        int max = 0;
        for(int i:map.keySet()){
            max = Math.max(map.get(i),max); 
        }
        int res =0;
        for(int i:map.keySet()){
            if(max==map.get(i))
            res++;
        }

        return res;
    }

    int sum(int n){
        int su=0;
        while(n>0){
            su += n%10;
            n=n/10;
        }
        return su;
    }
}