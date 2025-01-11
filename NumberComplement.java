class NumberComplement{
public static void main(String[] args) {
    Solution solution = new Solution();

    // Example inputs
    int num1 = 5; // Binary representation: 101, complement: 010, result: 2
    int num2 = 7; // Binary representation: 111, complement: 000, result: 0

    // Testing the findComplement method
    System.out.println("Complement of " + num1 + ": " + solution.findComplement(num1));  // Output: 2
    System.out.println("Complement of " + num2 + ": " + solution.findComplement(num2));  // Output: 0
}
}

class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        String res = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                res += '1';
            }
            else{
                res += '0';
            }
        }
        return Integer.parseInt(res,2);
    }
}   