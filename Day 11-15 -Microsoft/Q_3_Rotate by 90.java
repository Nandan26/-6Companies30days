class GFG
{
    static void rotate(int matrix[][])
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int temp=0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0, k = matrix[0].length - 1; j < k;j++, k--) {
                temp = matrix[j][i];
                matrix[j][i] = matrix[k][i];
                matrix[k][i] = temp;
            }
        }
    }
}
