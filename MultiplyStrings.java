public class MultiplyStrings {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        String num1 = "123";
        String num2 = "456";
        String result = solution.multiply(num1, num2);
        System.out.println("Result of " + num1 + " * " + num2 + " = " + result);

        // Test case 2
        num1 = "0";
        num2 = "987";
        result = solution.multiply(num1, num2);
        System.out.println("Result of " + num1 + " * " + num2 + " = " + result);

        // Test case 3
        num1 = "999";
        num2 = "999";
        result = solution.multiply(num1, num2);
        System.out.println("Result of " + num1 + " * " + num2 + " = " + result);

        // Test case 4
        num1 = "1";
        num2 = "1";
        result = solution.multiply(num1, num2);
        System.out.println("Result of " + num1 + " * " + num2 + " = " + result);
    }
}


class Solution {
    public String multiply(String num1, String num2) {
     int m = num1.length(), n = num2.length();
     int[] pos = new int[m + n];
    
     for(int i = m - 1; i >= 0; i--) {
         for(int j = n - 1; j >= 0; j--) {
             int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
             int p1 = i + j, p2 = i + j + 1;
             int sum = mul + pos[p2];
 
             pos[p1] += sum / 10;
             pos[p2] = (sum) % 10;
         }
     }  
     
     StringBuilder sb = new StringBuilder();
     for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
     return sb.length() == 0 ? "0" : sb.toString();
 }
 }
