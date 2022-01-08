// User function Template for Java

class Solution {
    static int maxProfit(int K, int N, int A[]) {
        int[][] dp=new int[K+1][N+1];
        int max=0;
        for(int t=1;t<=K;t++){
            for(int d=1;d<A.length;d++){
                max=dp[t][d-1];
                
                for(int pd=0;pd<d;pd++){
                    int ptill=dp[t-1][pd];
                    int pro=A[d]-A[pd];
                    
                    max=Math.max(max,ptill+pro);
                }
                
                dp[t][d]=max;
            }
        }
        return max;
    }
}
