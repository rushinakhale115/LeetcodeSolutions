public class Solution34 {
    public boolean isHappy(int n) {
        int num = n;
        while(n>9){
            int x = 0;
            while(n!=0){
                int a = n%10;
                n/=10;
                x += (a*a);
            }
            n=x;
        }
        if(n==1 || n==7){
            return true;
        }
        return false;
    }
}

public static void main(String[] args) {
    Solution34 solution = new Solution34();
    
    // Test case 1: 19 is a happy number
    System.out.println("Is 19 a happy number? " + solution.isHappy(19));  // Output: true
    
    // Test case 2: 2 is not a happy number
    System.out.println("Is 2 a happy number? " + solution.isHappy(2));    // Output: false
    
    // Test case 3: 7 is a happy number
    System.out.println("Is 7 a happy number? " + solution.isHappy(7));    // Output: true
    
    // Test case 4: 4 is not a happy number
    System.out.println("Is 4 a happy number? " + solution.isHappy(4));    // Output: false
    
    // Test case 5: 23 is a happy number
    System.out.println("Is 23 a happy number? " + solution.isHappy(23));  // Output: true
}