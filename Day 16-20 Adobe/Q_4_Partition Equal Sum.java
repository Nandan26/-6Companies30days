class Solution{
    static int equalPartition(int N, int arr[])
    {
        int totalsum = 0;
        for(int i=0 ; i<N ; i++){
            totalsum = totalsum + arr[i];
        }
        if(totalsum % 2 != 0)
            return 0;
        else
            return helper(arr , totalsum/2 , N);
    }
    static int helper(int arr[] , int target , int n){

        int dp[][] = new int[n+1][target+1];

        for(int i=0 ; i<=n ; i++){
            for(int j=0 ; j<=target ; j++){

                if(i==0) dp[i][j]=0;
                else if(j == 0)
                    dp[i][j] = 1;

                else if(arr[i-1] <= j){
                    dp[i][j] = Math.max(dp[i-1][j-arr[i-1]] , dp[i-1][j]);
                }
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][target];

    }
}
