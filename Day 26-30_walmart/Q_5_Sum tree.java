class Solution{

    public void toSumTree(Node root){
        helper(root);
    }
    private int helper(Node root){
        if(root==null) return 0;

        int leftSum= helper(root.left);
        int rightSum=helper(root.right);

        int prev=root.data;
        root.data=leftSum+rightSum;
        return prev+root.data;
    }
}
