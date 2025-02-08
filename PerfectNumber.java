class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
                }
        }
        if(sum==num){
            return true;
        } 
        return false;
        
    }
}

public class PerfectNumber {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] testNumbers = {6, 28, 496, 8128, 33550336, 12};  // Sample test numbers
        
        for (int num : testNumbers) {
            System.out.println("Is " + num + " a perfect number? " + sol.checkPerfectNumber(num));
        }
    }
}
