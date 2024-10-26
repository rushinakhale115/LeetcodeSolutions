import java.util.Scanner;
import  java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        for(final char c:s.toCharArray())
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push ('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop()!=c)
                return false;

        return stack.isEmpty();
    }




    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of test cases: ");
            int t = scanner.nextInt();  // Number of test cases
            scanner.nextLine();  // Consume the newline after the integer input

            for (int i = 0; i < t; i++) {
                System.out.print("Enter a string of parentheses: ");
                String input = scanner.nextLine();

                boolean isValid = solution.isValid(input);
                System.out.println("Is the string valid? " + isValid);
            }

            scanner.close();
        }
    }


}