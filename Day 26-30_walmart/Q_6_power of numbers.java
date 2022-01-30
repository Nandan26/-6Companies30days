class Solution
{
    int mod=1000000007;
    long power(int N,int R)
    {
        return helper(N,R)%mod;

    }

    long helper(int N,int R){
        if (N == 0)
            return 0;

        if (R == 0)
            return 1;

        long y;
        if (R % 2 == 0) {

            y = helper(N, R/2);
            y = (y * y) % mod;
        }

        else {
            y = N % mod;

            y = (y * helper(N, R - 1) % mod) % mod;
        }

        return ((y + mod) % mod);
    }

}
