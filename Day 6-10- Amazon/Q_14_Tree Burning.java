class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    private static Node MapParent(Node root,
                HashMap<Node, Node> map, int start) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        Node res = new Node(-1);
        while(!q.isEmpty()) {
            Node node = q.poll();
            if(node.data == start) res = node;
            if(node.left != null) {
                map.put(node.left, node);
                q.offer(node.left);
            }
            if(node.right != null) {
                map.put(node.right, node);
                q.offer(node.right);
            }
        }
        return res;
    }
    private static int findMaxDistance(HashMap<Node, Node> mpp, Node target) {
        Queue<Node> q = new LinkedList<>();
        q.offer(target);
        HashMap<Node,Integer> vis = new HashMap<>();
        vis.put(target, 1);
        int maxi = 0;
        
        while(!q.isEmpty()) {
            int sz = q.size();
            int fl = 0;
            
            for(int i = 0;i<sz;i++) {
                Node node = q.poll();
                if(node.left != null && vis.get(node.left) == null) {
                    fl = 1;
                    vis.put(node.left, 1);
                    q.offer(node.left);
                }
                if(node.right != null && vis.get(node.right) == null) {
                    fl = 1;
                    vis.put(node.right, 1);
                    q.offer(node.right);
                }

                if(mpp.get(node) != null && vis.get(mpp.get(node)) == null) {
                    fl = 1;
                    vis.put(mpp.get(node), 1);
                    q.offer(mpp.get(node));
                }
            }
            if(fl == 1) maxi++;
        }
        return maxi;
    }
    
    public static int minTime(Node root, int target) 
    {
        HashMap<Node, Node> map = new HashMap<>();
        Node start = MapParent(root, map, target);
        int max = findMaxDistance(map, start);
        return max;
    }
}
