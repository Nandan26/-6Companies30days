class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();

        int maxrow = r-1;
        int minrow=0,mincol=0;
        int maxcol = c-1;
        int cnt=0;
        int total=matrix[0].length*matrix.length;
        while(cnt<total){
            for(int i = minrow,j=mincol; j <= maxcol && cnt<total; j++){
                res.add(matrix[i][j]);
                cnt++;
            }
            minrow++;

            for(int i = minrow,j=maxcol; i <= maxrow && cnt<total; i++){
                res.add(matrix[i][j]);
                cnt++;
            }
            maxcol--;

            for(int i = maxrow,j=maxcol; j >= mincol && cnt<total; j--){
                res.add(matrix[i][j]);
                cnt++;
            }
            maxrow--;


            for(int i = maxrow,j=mincol; i >= minrow && cnt<total; i--){
                res.add(matrix[i][j]);
                cnt++;
            }
            mincol++;
        }

        return res;
    }

}
