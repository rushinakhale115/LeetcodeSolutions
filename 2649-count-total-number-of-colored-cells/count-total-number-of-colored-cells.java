class Solution {
    // O(n) solution - calculates the arithmetic progression
    // from previous number
    public long n_coloredCells(int n) {
        long previous = 1l, // previous holds the value of the previous element in the series 
            current = 1l; // current holds the value of the result, the nth element

        // Iterate from 1 -> n, 1-indexed series
        for (int i = 1; i <= n; i++) {

            // The current number and the previous in this series
            // differs by a factor of 4 multiplied by the previous's
            // position
            current = previous + 4l * (i - 1);
            
            // Update previous's value with current's
            previous = current;
        }

        // Return result
        return current;
    }

    // O(1) solution - calculates the nth element in the A.P.
    // series with 2 times the number's position as common
    // difference
    public long coloredCells(int n) {
        return 1l + (long)  2 * n * (n - 1);
    }
}