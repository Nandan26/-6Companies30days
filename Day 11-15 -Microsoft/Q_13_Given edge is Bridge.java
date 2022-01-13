class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        //remove that undirected edge which we want to check
        adj.get(c).remove(new Integer(d));
        adj.get(d).remove(new Integer(c));

        boolean[] visited=new boolean[V];
        checkifposs(adj,c,visited);

        if(visited[d]==true)    return 0;
        return 1;
    }
    static void checkifposs(ArrayList<ArrayList<Integer>> adj,int target,boolean[] vis){
        vis[target]=true;
        for(int it:adj.get(target)){
            if(vis[it]==false)
                checkifposs(adj,it,vis);
        }
    }
}
