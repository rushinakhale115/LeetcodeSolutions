class Solution {
    // Custom Pair class for tracking rectangle information
    static class Pair {
        int count;       // Number of rectangles at this point
        boolean isEnd;   // Whether this is an end point

        Pair(int count, boolean isEnd) {
            this.count = count;
            this.isEnd = isEnd;
        }
    }

    public boolean checkValidCuts(int n, int[][] rectangles) {
        // TreeMaps to track x and y coordinates
        TreeMap<Integer, Pair> xMap = new TreeMap<>();
        TreeMap<Integer, Pair> yMap = new TreeMap<>();

        // Process each rectangle
        for (int[] rectangle : rectangles) {
            int x1 = rectangle[0], x2 = rectangle[2];
            int y1 = rectangle[1], y2 = rectangle[3];

            // Mark start and end points for x-coordinates
            xMap.merge(x1 + 1, new Pair(1, false), this::mergePairs);
            xMap.merge(x2, new Pair(-1, true), this::mergePairs);

            // Mark start and end points for y-coordinates
            yMap.merge(y1 + 1, new Pair(1, false), this::mergePairs);
            yMap.merge(y2, new Pair(-1, true), this::mergePairs);
        }
    
        // Check validity of cuts in both x and y directions
        return isValid(xMap, n) || isValid(yMap, n);
    }

    // Helper method to merge Pair objects
    private Pair mergePairs(Pair oldPair, Pair newPair) {
        oldPair.count += newPair.count;
        oldPair.isEnd |= newPair.isEnd;
        return oldPair;
    }

    // Validate cuts at coordinates
    public boolean isValid(TreeMap<Integer, Pair> map, int n) {
        int curRect = 0;       // Current active rectangles
        int lastRectEnd = 0;   // Last point where rectangles ended
        int cuts = 0;          // Number of valid cuts

        // Iterate through sorted coordinates
        for (Map.Entry<Integer, Pair> entry : map.entrySet()) {
            int val = entry.getKey();
            Pair p = entry.getValue();
            
            // Update active rectangle count
            curRect += p.count;

            // Mark end of rectangles
            if (p.isEnd) {
                lastRectEnd = val;
            }
            
            // Count cuts where no rectangles are active
            if (lastRectEnd != 0 && curRect == 0) {
                cuts++;
            }
        }

        // Require at least 3 cuts
        return cuts >= 3;
    }
}