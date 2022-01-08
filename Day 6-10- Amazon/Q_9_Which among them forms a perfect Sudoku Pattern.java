class Solution{
    public int isValid(int mat[][]){
        int row[][]=new int[9][9];
        int col[][]=new int[9][9];
        int box[][][]=new int[3][3][9];
        
    
        int num;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (mat[i][j] > 0 && mat[i][j] <= 9) {
                    num = mat[i][j] - 1;
                    if (row[i][num]!=0)   return 0;
                    row[i][num] = 1;
                    if (box[i / 3][j / 3][num] !=0)    return 0;
                    box[i / 3][j / 3][num] = 1;
                    if (col[j][num]!=0)   return 0;
                    col[j][num] = 1;
                    
                }
            }
        }
        return 1;
    }
}
