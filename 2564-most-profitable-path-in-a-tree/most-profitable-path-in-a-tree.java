import java.util.*;

class Solution {
    private void buildGraph(ArrayList<ArrayList<Integer>> g, int[][] edges, int[] amount) {
        int n = amount.length;
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());  // Initialize adjacency list
        }
        for (int[] e : edges) {
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }
    }

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        buildGraph(g, edges, amount);
        int[] time = new int[amount.length];
        Arrays.fill(time,-1);
        bob(g, 0, time, new HashSet<>(), bob);
        // System.out.println(Arrays.toString(time));
        return alice(g, 0, time, new HashSet<>(), 1, amount);
    }

    private int bob(ArrayList<ArrayList<Integer>> g, int node, int[] time, Set<Integer> vis, int bob) {
        if (node == bob) {
            time[node] = 1;
            return 1;
        }
        vis.add(node);
        for (int i = 0; i < g.get(node).size(); i++) {
            int adj = g.get(node).get(i);
            if (vis.contains(adj)) continue;
            int temp = bob(g, adj, time, vis, bob);
            if (temp != -1) {
                time[node] = temp + 1;
                return temp + 1;
            }
        }
        return time[node] = -1;
    }

    private int alice(ArrayList<ArrayList<Integer>> g, int node, int[] time, Set<Integer> vis, int t, int[] amount) {
        vis.add(node);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < g.get(node).size(); i++) {
            int adj = g.get(node).get(i);
            if (vis.contains(adj)) continue;
            max = Math.max(max, alice(g, adj, time, vis, t + 1, amount));
        }
        
        int temp = 0;
        if (time[node] == -1) {
            temp = amount[node];
        } else if (t == time[node]) {
            temp = amount[node] / 2;
        } else if (t < time[node]) {
            temp = amount[node];
        }
        
        return (max == Integer.MIN_VALUE) ? temp : temp + max;
    }
}