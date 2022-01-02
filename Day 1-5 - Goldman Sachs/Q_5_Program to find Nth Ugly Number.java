class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        long[] dp=new long[n+1];
        dp[1]=1;
        int p2=1,p3=1,p5=1;
        for(int i=2;i<=n;i++){
            long m2=2*dp[p2];
            long m3=3*dp[p3];
            long m5=5*dp[p5];
            
            long min=Math.min(Math.min(m2,m3),m5);
            dp[i]=min;
            if(min==m2){
                p2++;
            }
            if(min==m3){
                p3++;
            }
            if(min==m5) p5++;
        }
        return dp[n];
    }
}
