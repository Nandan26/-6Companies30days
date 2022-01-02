class Solution
{
    public int CountWays(String str)
    {
        if (str.length() == 0) {
            return 0;
        }
        int n = str.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        char[] ch=str.toCharArray();
        
        //to decode the first character
        if(ch[0]=='0') return 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i]=0;
            if (ch[i - 1] > '0')
                dp[i] = dp[i - 1];

            if (ch[i - 2] == '1' || (ch[i - 2] == '2' && ch[i - 1] < '7')) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
}
