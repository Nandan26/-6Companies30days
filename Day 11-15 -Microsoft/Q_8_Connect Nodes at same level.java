class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        if(root==null) return;
        Queue<Node> que = new LinkedList<>();

        que.add(root);

        Node temp = null;
        while (!que.isEmpty()) {
            int n = que.size();
            for (int i = 0; i < n; i++) {
                Node prev = temp;
                temp = que.poll();

                if (i > 0)
                    prev.nextRight = temp;

                if (temp.left != null)
                    que.add(temp.left);

                if (temp.right != null)
                    que.add(temp.right);
            }

            temp.nextRight = null;
        }

    }
}
