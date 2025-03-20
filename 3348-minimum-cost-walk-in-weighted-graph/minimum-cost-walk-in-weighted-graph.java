class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        int[] arr = IntStream.generate(() -> -1).limit(n).toArray();
        int[] val = IntStream.generate(() -> -1).limit(n).toArray();
        for(int[] edge: edges) {
            int a = edge[0];
            int b = edge[1];
            while(arr[a] >= 0) a = arr[a];
            while(arr[b] >= 0) b = arr[b];

            int bit = edge[2];
            if(val[a] != -1) bit &= val[a];
            if(val[b] != -1) bit &= val[b];

            if(a == b) {
                val[a] = bit;
            } else if(arr[a] <= arr[b]) {
                arr[a] += arr[b];
                arr[b] = a;
                val[a] = bit;
            } else {
                arr[b] += arr[a];
                arr[a] = b;
                val[b] = bit;
            }
        }

        int[] res = new int[query.length];
        for(int i=0; i<query.length; i++) {
            int a = query[i][0];
            int b = query[i][1];
            while(arr[a] >= 0) a = arr[a];
            while(arr[b] >= 0) b = arr[b];
            if(a==b)
                res[i] = val[a];
            else 
                res[i] = -1;
        }
        return res;
    }
}