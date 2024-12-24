public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test case
        int n = 4;  // Number of iterations
        int x = 3;  // Value to OR with
        
        // Call the method and print the result
        long result = solution.minEnd(n, x);
        System.out.println("Result: " + result);
    }
}
    

class Solution {
    public long minEnd(int n, int x) {
        long ans=x;
        n-=1;
        while(n-->0){
            ans=(ans+1)|x;
            
        }
        
        return ans;
    }
}
