class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] arr = new long[n];
        long maxVal = 0;
        long res = 0;
        for(int i=0; i<n; i++) {
            int next = i + questions[i][1] + 1;

            maxVal = Math.max(maxVal, arr[i]);

            if(next < n) arr[next] = Math.max(arr[next], questions[i][0] + maxVal);
            else {
                res = Math.max(res, questions[i][0] + maxVal);
            }
            
        }
        return Math.max(res, arr[n-1]);
    }
}