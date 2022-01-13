class solve{

    static ArrayList<String> generate(int N)
    {
        ArrayList<String> ans = new ArrayList<String>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for(int i = 0; i<N; i++)
        {
            ans.add(q.poll());
            q.add(ans.get(i)+"0");
            q.add(ans.get(i)+"1");
        }

        return ans;
    }

}
