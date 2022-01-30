class Solution
{
    //Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b)
    {
        int[][] dp=new int[a][b];
        for(int i=a-1;i>=0;i--){
            for(int j=b-1;j>=0;j--){
                if(i==a-1 && j==b-1){
                    dp[i][j]=1;
                }
                else if(i==a-1){
                    dp[i][j]=dp[i][j+1];
                }
                else if(j==b-1){
                    dp[i][j]=dp[i+1][j];
                }
                else dp[i][j]=dp[i][j+1]+dp[i+1][j];
            }
        }
        return dp[0][0];
    }
}
