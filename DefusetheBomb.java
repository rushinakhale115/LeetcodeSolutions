public class DefusetheBomb {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] code1 = {5, 7, 1, 4};
        int k1 = 3;
        int[] result1 = solution.decrypt(code1, k1);
        System.out.println("Decrypted code for k=3: " + java.util.Arrays.toString(result1));

        int[] code2 = {1, 2, 3, 4};
        int k2 = 0;
        int[] result2 = solution.decrypt(code2, k2);
        System.out.println("Decrypted code for k=0: " + java.util.Arrays.toString(result2));

        int[] code3 = {2, 4, 9, 3};
        int k3 = -2;
        int[] result3 = solution.decrypt(code3, k3);
        System.out.println("Decrypted code for k=-2: " + java.util.Arrays.toString(result3));
    }
}

class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res=new int[code.length];
        if(k==0){
            return res;
        }
        int[] ans=new int[code.length*2];
        for(int i=0;i<code.length*2;i++){
                ans[i]=code[i%code.length];
        }
        int j=0;
        if(k>0){
            for(int i=0;i<code.length;i++){
                j=i;
                while(j-i<k){
                  res[i]+=ans[j+1];
                  j++;
                }
            }
        }
        if(k<0){
            for(int i=code.length;i<code.length*2;i++){
                j=i;
                while(i-j<Math.abs(k)){
                  res[i-code.length]+=ans[j-1];
                  j--;
                }
            }
        }
        return res;
    }
}