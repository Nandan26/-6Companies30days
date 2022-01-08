class Solution
{
    //Function to count number of ways to reach the nth stair 
    //when order does not matter.
    Long countWays(int m)
    {
        long[] res = new long[m + 1];
        res[0] = 1;
        res[1] = 1;
 
        for (int i = 2; i <= m; i++)
            res[i] = 1 + res[i - 2];
 
        return res[m];
    }    
}
