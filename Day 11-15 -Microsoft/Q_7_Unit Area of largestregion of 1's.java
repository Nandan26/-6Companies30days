class Solution
{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        int ans=0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 1) {
                    int cnt = dfs(i,j,grid);
                    ans = Math.max(ans,cnt);
                }
            }
        }
        return ans;
    }
    public int dfs(int i,int j, int[][]grid) {

        if(i < 0 || j<0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 ) return 0;
        grid[i][j] = 0;
        int total = 0;
        //visit all 8 directions
        total += dfs(i+1,j+1,grid);
        total += dfs(i-1,j-1,grid);
        total += dfs(i+1,j-1,grid);
        total += dfs(i-1,j+1,grid);
        total += dfs(i+1,j,grid);
        total += dfs(i,j+1,grid);
        total += dfs(i,j-1,grid);
        total += dfs(i-1,j,grid);

        return total + 1;
    }
}
