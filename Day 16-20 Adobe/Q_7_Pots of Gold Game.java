class GfG
{
    private static int helper(int[][] dp, int i, int j)
    {
        if (i <= j) {
            return dp[i][j];
        }

        return 0;
    }
    public static int maxCoins(int A[],int n)
    {
        int[][] dp=new int[n][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        for(int gap=0;gap<n;gap++){
            for(int i=0,j=gap;j<n;j++,i++){
                int val1 = A[i] + Math.min(helper(dp, i + 2, j),
                        helper(dp, i + 1, j - 1));

                int val2 = A[j] + Math.min(helper(dp, i + 1, j - 1),
                        helper(dp, i, j - 2));

                dp[i][j] = Math.max(val1, val2);
            }

        }
        return dp[0][n-1];
    }
}
