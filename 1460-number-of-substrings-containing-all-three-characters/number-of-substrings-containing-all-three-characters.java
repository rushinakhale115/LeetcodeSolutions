class Solution {
    public int numberOfSubstrings(String s) {
         int count = 0;
        // Length of the input string
        int n = s.length();
         int[] freq = new int[3];
        int left=0;

        // Outer loop to fix the start of the substring
        for (int right = 0; right< n; right++) {
            // Array to track the count of 'a', 'b', and 'c'
            freq[s.charAt(right) - 'a']++;
            // Inner loop to fix the end of the substring
            
                // Update frequency for current character
                

                // Check if all three characters are present
                while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                    // Add valid substring
                    count+=(n-right);
                    freq[s.charAt(left)-'a']--;
                    left++;

                    
             }
            
        }

        return count;
        
    }
}