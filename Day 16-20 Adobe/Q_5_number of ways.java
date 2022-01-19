class Solution
{
    static int ans = 0;
    static int helper(int num, int rem, int k, int x)
    {
        if (rem == 0)
            ans++;

        int r = (int)Math.floor(Math.pow(num, 1.0 / x));

        for (int i = k + 1; i <= r; i++) {
            int a = rem - (int)Math.pow(i, x);
            if (a >= 0)
                helper(num, rem - (int)Math.pow(i, x), i, x);
        }
        return ans;
    }
    static int numOfWays(int n, int x)
    {
        return helper(n, n, 0, x);
    }
}
