import java.util.*

class Solution {
    public boolean isCircularSentence(String sentence) {
        List<String> words = Arrays.asList(sentence.split(" "));
        
        if (words.size() == 1) {
            return words.get(0).charAt(0) == words.get(0).charAt(words.get(0).length() - 1);
        }      
        for (int i = 0; i < words.size() - 1; i++) { 
            char lastCharOfCurrent = words.get(i).charAt(words.get(i).length() - 1);
            char firstCharOfNext = words.get(i + 1).charAt(0);           
            if (lastCharOfCurrent != firstCharOfNext) {
                return false;
            }
        }        
        char lastCharOfLast = words.get(words.size() - 1).charAt(words.get(words.size() - 1).length() - 1);
        char firstCharOfFirst = words.get(0).charAt(0);
        return lastCharOfLast == firstCharOfFirst;
    }
}

public class CircularSentence {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String sentence1 = "hello orange eagle";
        String sentence2 = "racecar";
        String sentence3 = "apple elk kangaroo";
        String sentence4 = "noon";
        
        System.out.println("Is Circular Sentence (\"hello orange eagle\"): " + solution.isCircularSentence(sentence1));
        System.out.println("Is Circular Sentence (\"racecar\"): " + solution.isCircularSentence(sentence2));
        System.out.println("Is Circular Sentence (\"apple elk kangaroo\"): " + solution.isCircularSentence(sentence3));
        System.out.println("Is Circular Sentence (\"noon\"): " + solution.isCircularSentence(sentence4));
    }
}
