class Solution{
    static char start;
    static StringBuilder sb=new StringBuilder();
    static void getString(int i, int j, int n, int[][] bracket,StringBuilder sb){

        if (i == j)
        {
          sb.append(start++);
          return;
        }
        sb.append("(");
    

        getString(i, bracket[i][j], n, bracket,sb);

        getString(bracket[i][j] + 1, j, n, bracket,sb);
        sb.append(")");
    }
    static String matrixChainOrder(int p[], int n){
        int[][] m = new int[n][n];

        int[][] bracket = new int[n][n];

        for (int i = 1; i < n; i++){
            m[i][i] = 0;
        }

        for (int gap = 2; gap < n; gap++) 
        {
            for (int i = 1; i < n - gap + 1; i++) 
            {
                int j = i + gap - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++)
                {
                  int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                  if (q < m[i][j]) 
                  {
                    m[i][j] = q;
        
                    bracket[i][j] = k;
                  }
                }
            }
        }
        start='A';
        getString(1, n - 1, n, bracket,sb);
        
        return sb.toString();
    }
}
