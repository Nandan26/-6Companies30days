class Tree
{
    //Function to count number of subtrees having sum equal to given sum.
    private int ans;
    int countSubtreesWithSumX(Node root, int X)
    {
        ans=0;
        helper(root,X);
        return ans;
    }
    private int helper(Node root,int X){
        if(root==null) return 0;
        int left=helper(root.left,X);
        int right=helper(root.right,X);

        int total=left+right+root.data;

        if(total==X) ans++;

        return total;
    }
}
