class Solution {
    public int orangesRotting(int[][] grid) {
     
        int i,j,x,y,n=grid.length;
        int m=grid[0].length;
        int ans=0,fresh=0;
        Queue<int[]> queue=new LinkedList();
        int[][] dirs={{-1,0},{1,0},{0,1},{0,-1}};
        
        for(i=0;i<n;i++)
            for(j=0;j<m;j++) {
                if(grid[i][j]==2) {

                    queue.add(new int[]{i,j});  
                    
                }
                else if(grid[i][j]==1)
                    fresh++;
			}
        if(fresh==0) return 0;
        
        int time=-1;
        while(!queue.isEmpty())  {
            
            int size=queue.size();
            time++;

            while(size-->0)
            {
                int tm[]=queue.poll();
                x=tm[0];
                y=tm[1];
                for(i=0;i<dirs.length;i++){
                    int newx=x+dirs[i][0];
                    int newy=y+dirs[i][1];
                    if(newx>=0 && newy>=0 && newx<n && newy<m && grid[newx][newy]==1 ){
                        
                        queue.add(new int[]{newx,newy});  
                        grid[newx][newy]=2;
                        fresh--;
                    }
                }

            }
            
        }
        
        if(fresh>0)
            return -1;
        return time;
    }
}
