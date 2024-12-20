public class Integertoroman {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int num1 = 1994; // Expected: "MCMXCIV"
        int num2 = 58;   // Expected: "LVIII"
        int num3 = 9;    // Expected: "IX"
        int num4 = 3999; // Expected: "MMMCMXCIX"
        
        System.out.println("Roman numeral for " + num1 + ": " + solution.intToRoman(num1));
        System.out.println("Roman numeral for " + num2 + ": " + solution.intToRoman(num2));
        System.out.println("Roman numeral for " + num3 + ": " + solution.intToRoman(num3));
        System.out.println("Roman numeral for " + num4 + ": " + solution.intToRoman(num4));
    }
}


class Solution {
    public String intToRoman(int num) {
        
            int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
    StringBuilder sb = new StringBuilder();
    
    for(int i=0;i<values.length;i++) {
        while(num >= values[i]) {
            num -= values[i];
            sb.append(strs[i]);
        }
    }
    return sb.toString();
}
    }
