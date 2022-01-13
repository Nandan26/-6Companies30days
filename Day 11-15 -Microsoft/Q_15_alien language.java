class Solution
{
    //Write your code here
    public String findOrder(String [] dict, int N, int K)
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<K;i++) {
            adj.add(i,new ArrayList<>());
        }

        for(int i=0;i<dict.length-1;i++) {
            for(int j=0;j<Math.min(dict[i].length(),dict[i+1].length());j++) {
                if(dict[i].charAt(j)!=dict[i+1].charAt(j)) {
                    adj.get(dict[i].charAt(j)-'a').add(dict[i+1].charAt(j)-'a');
                    break;
                }
            }
        }

        String str=toposort(adj, K);

        return str;

    }
    private String toposort(ArrayList<ArrayList<Integer>> adj,int K) {
        Stack<Integer> st=new Stack<>();
        boolean vis[]=new boolean [K];


        for(int i=0;i<K;i++) {
            if(vis[i]==false) {
                dfs(adj,i,st,vis);
            }
        }

        String str="";
        while(!st.isEmpty()) {
            char c=(char)(st.pop()+'a');
            str+=Character.toString(c);
        }

        return str;

    }
    private void dfs(ArrayList<ArrayList<Integer>> adj, int i, Stack<Integer> st, boolean[] vis) {
        vis[i]=true;

        for(int it:adj.get(i)) {
            if(vis[it]==false) {
                dfs(adj,it,st,vis);
            }
        }

        st.push(i);
    }

}
