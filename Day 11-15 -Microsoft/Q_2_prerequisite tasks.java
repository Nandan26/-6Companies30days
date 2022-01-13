class Solution {
    public boolean isPossible(int N, int[][] prerequisites)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < N; i++)
            adj.add(new ArrayList<Integer>());

        for(int[] a:prerequisites){
            adj.get(a[1]).add(a[0]);
        }

        boolean[] visited = new boolean[N];
        boolean[] checkNoCycle = new boolean[N];

        for(int i=0; i<N; i++){
            if(dfscycle(adj,visited,i,checkNoCycle))
                return false;
        }
        return true;
    }

    private boolean dfscycle(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int course,boolean[] checkNoCycle){
        if(visited[course]){
            return true;
        }
        if(checkNoCycle[course]) return false;

        else
            visited[course] = true;

        for(int c:adj.get(course)){
            if(dfscycle(adj,visited,c,checkNoCycle))
                return true;
        }
        visited[course] = false;

        checkNoCycle[course] = true;
        return false;
    }
}
