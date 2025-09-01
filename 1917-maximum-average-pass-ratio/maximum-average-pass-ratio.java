class Pair implements Comparable<Pair> {
    int sum; // Passes
    int n;   // Total students
    double ratio; // Current ratio

    public Pair(int sum, int n, double ratio) {
        this.sum = sum;
        this.n = n;
        this.ratio = ratio;
    }

    @Override
    public int compareTo(Pair pair) {
        
        double thisGain = (double)(this.sum + 1) / (this.n + 1) - this.ratio;
        double pairGain = (double)(pair.sum + 1) / (pair.n + 1) - pair.ratio;
        return Double.compare(pairGain, thisGain); 
    }
}

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < classes.length; i++) {
            int sum = classes[i][0];
            int n = classes[i][1];
            pq.add(new Pair(sum, n, (double)sum / n));
        }

        while (extraStudents > 0) {
            Pair pair = pq.poll();
            int pass = pair.sum + 1;
            int total = pair.n + 1;
            pq.add(new Pair(pass, total, (double)pass / total));
            extraStudents--;
        }

        double sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll().ratio;
        }
        return sum / classes.length; 
    }
}