package Graphs2;

import java.util.*;
import java.util.PriorityQueue;

public class PrimsAlgorithm {

	static void prims(int[][] edges)
	{
		
		System.out.println("*****");
		
		int src = 0;
		
		int[] visited = new int[edges.length];
		visited[src]=1;
		
		List<int[]> mst = new ArrayList();
      
		PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a,b)-> a[2]-b[2]);
		
		
		for(int i=0;i<edges.length;i++)
		{
			if(visited[i]==0 && edges[src][i]!=0)
			{
				queue.offer(new int[] {src,i,edges[src][i]});
				
				
			}
			
			
		}
		System.out.println(queue);
   System.out.println(Arrays.toString(visited));
		
	while(!queue.isEmpty())
		{
			int[] polled = queue.poll();
			int source = polled[1];
			
			if(visited[source]==0)
			  mst.add(polled);
			else
				continue;//already visted

			
			
			visited[source]=1;
			
			//else continue;

			for(int i=0;i<edges.length;i++)
			{
				if(visited[i]==0 && edges[source][i]!=0 && source!=i)
				{  
					//System.out.println("&"+ i);
					queue.offer(new int[] {source,i,edges[source][i]});
					
					
				}
				
				
			}
			
			
			
		}
		
		//System.out.println(mst);
		for(int[] e: mst)
		{ 
			System.out.println(e[0]+"->"+e[1]+"w="+e[2]);
			
		}
		

		
	}
	
	
	
	
	
	public static void main(String[] args)
    {
        /* Let us create the following graph
        2 3
        (0)--(1)--(2)
        | / \ |
        6| 8/ \5 |7
        | /     \ |
        (3)-------(4)
            9         */
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                      { 2, 0, 3, 8, 5 },
                                      { 0, 3, 0, 0, 7 },
                                      { 6, 8, 0, 0, 9 },
                                      { 0, 5, 7, 9, 0 } };
 
        // Print the solution
                                      
                                      
      prims(graph);                              
                                      
                                      
    }	
	
	
	
	
	
}
