package Graphs2;

import java.util.*;

public class IslandProblemDistinct {
	
	static StringBuilder s= new StringBuilder();
	public static int numberofDistinctIslands(int[][] grid) {
        // write your code here
        
	

        if(grid==null || grid.length==0) return 0;
        int r =grid.length;
        int c=grid[0].length;
       int count=0 ;
    
        
        
        int[][] visited = new int[r][c];
        
        Set<String> set = new HashSet();
        
       for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        {
      
            if(grid[i][j]==1 && visited[i][j]==0)
            {
               s.delete(0, s.length());
                dfs(i,j,grid,visited);
                System.out.println("s-"+s);
                System.out.println("*****");
                set.add(s.toString());
            }
            
        }
        
        return set.size();
        
             
        
        
        
    }
    
    
    
    static void dfs(int i,int j,int[][] grid,int[][] visited)
    {
    	System.out.println("--");
          int r =grid.length;
        int c=grid[0].length;
        System.out.println("s-"+s);    
        if( i<0 || i>=r || j<0 || j>=c)
             {
                 s.append('O');
                 return ;
                 
             }
        
        if(visited[i][j]==1||grid[i][j]==0 )
        {
        	 s.append('O');
             return ;
             
            
        }
        
                visited[i][j]=1;
      
        
        
        
        
                s.append('L');
                dfs(i,j-1,grid,visited);

                
                s.append('R');
                dfs(i,j+1,grid,visited);

                
                s.append('D');

                dfs(i+1,j,grid,visited);

                
                s.append('U');
                dfs(i-1,j,grid,visited);

         
         
                 
            
     
                 
        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] grid = new int[][] {{1,1,0,0,1},
		                             {1,1,0,0,0},
		                             {0,0,0,1,1},
		                             {1,0,0,1,1}};
			
			
			
		                            
	System.out.println(numberofDistinctIslands(grid));	
		
	}
	
}
