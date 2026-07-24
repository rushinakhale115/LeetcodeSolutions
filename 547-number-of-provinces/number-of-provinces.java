class Solution {
    
        
        public static void dfs(int node,ArrayList<ArrayList<Integer>> adj, int[] visited){
            visited[node]=1;
            for(int neighbour : adj.get(node)){
                if(visited[neighbour]==0){
                    dfs(neighbour,adj,visited);
                }
            }
        }
        public int findCircleNum(int[][] isConnected) {
        int V=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int[] visited=new int[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                count+=1;
                dfs(i,adj,visited);
            }
        }
        return count;

        
    }
}