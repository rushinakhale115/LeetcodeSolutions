public class Checkifwordoccursasprefix {

        public static void main(String[] args) {
            Solution15 solution = new Solution15();

            // Test case 1
            String sentence1 = "i love eating burgers";
            String searchWord1 = "burg";
            int result1 = solution.isPrefixOfWord(sentence1, searchWord1);
            System.out.println("Result for test case 1: " + result1); // Expected output: 4

            // Test case 2
            String sentence2 = "this problem is an easy problem";
            String searchWord2 = "pro";
            int result2 = solution.isPrefixOfWord(sentence2, searchWord2);
            System.out.println("Result for test case 2: " + result2); // Expected output: 2

            // Test case 3
            String sentence3 = "i am tired";
            String searchWord3 = "you";
            int result3 = solution.isPrefixOfWord(sentence3, searchWord3);
            System.out.println("Result for test case 3: " + result3); // Expected output: -1

            // Test case 4
            String sentence4 = "hello world";
            String searchWord4 = "hell";
            int result4 = solution.isPrefixOfWord(sentence4, searchWord4);
            System.out.println("Result for test case 4: " + result4); // Expected output: 1
        }
    }



class Solution15 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s=sentence.split(" ");
        int ans=0;
        for(int i=0;i<s.length;i++){
            if(s[i].indexOf(searchWord)==0){
                ans=i+1;
                break;
            }
        }
        if(ans==0){
            return -1;
        }
        else return ans;
    }
}