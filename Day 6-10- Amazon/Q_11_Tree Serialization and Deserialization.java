class Tree 
{
    class TreeHelper{
        int index;
    }
    
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    if(root==null){
	        A.add(-1);
	        return;
	    }   

	    A.add(root.data);

	    serialize(root.left, A);
	    serialize(root.right, A);
	}
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        TreeHelper th=new TreeHelper();
        //starting index of node
        th.index=0;
        
        return BinaryTree(A, th);
    }
	
	//Function to construct the tree.
	public Node BinaryTree(ArrayList<Integer> A, TreeHelper th) 
	{
        //check out of bound
        if (th.index == A.size() || A.get(th.index) == -1) 
        {
            th.index += 1;
            return null;
        }

        Node root = new Node(A.get(th.index));
        th.index += 1;
        
        //calling function recursively for left and right subtrees.
        root.left = BinaryTree(A, th);
        root.right = BinaryTree(A, th);
        return root;
    }
};
