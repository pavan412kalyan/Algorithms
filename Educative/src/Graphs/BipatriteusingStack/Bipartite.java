package Graphs.BipatriteusingStack;
import java.util.*;

//A class to store a graph edge
class Edge
{
 int source, dest;

 public Edge(int source, int dest) {
     this.source = source;
     this.dest = dest;
 }
}

//A class to represent a graph object
class Graph
{
 // A list of lists to represent an adjacency list
 List<List<Integer>> adjList = null;

 // Constructor
 Graph(List<Edge> edges, int N) {
     adjList = new ArrayList<>();
     for (int i = 0; i < N; i++) {
         adjList.add(new ArrayList<>());
     }

     // add edges to the undirected graph
     for (Edge edge: edges)
     {
         int src = edge.source;
         int dest = edge.dest;

         // add an edge from source to destination
         adjList.get(src).add(dest);

         // add an edge from destination to source
         adjList.get(dest).add(src);
     }
 }
}

class Main
{
 

	
	private static boolean check(Graph graph, int src, int n) {
		// TODO Auto-generated method stub
		
		
		int[] color = new int[n];
		
		for(int i=0;i<n;i++)
		{
			color[i]=-1;			
			
		}
		//color[src]=1;
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(src);
	     for(int i=1;i<n;i++)	
		{
		  
		    if(color[i]==-1)
		    {
		    	stack.push(i);
		    	color[i]=0;
		    	
		    	
		    	while(stack.size()!=0)
		    	{
		    		
		    		int parent  = stack.pop();
		    		
		    		
					    		for(int child : graph.adjList.get(parent))
					    		{ 
					    			
						
							    			if(color[child]==-1)
							    			{  stack.push(child);
							    				color[child] = color[parent]==0 ? 1:0 ;
							    						   		
							    			}
							    			
							    			else if(color[child]==color[parent])
							    			       return false;	    							    			
					    		}
		    			    	    	  		
		    	}		    	
		    	 	
	      }
	    	 
			
	
		}
		
		
		
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
 public static void main(String[] args)
 {
     // List of graph edges as per the above diagram
     List<Edge> edges = Arrays.asList(
                         new Edge(1, 2), new Edge(2, 3), new Edge(2, 8),
                         new Edge(3, 4), new Edge(4, 6), new Edge(5, 7),
                         new Edge(5, 9), new Edge(8, 9)
                         // if we add edge `2 —> 4`, the graph becomes non-bipartite
                     );

     // total number of nodes in the graph
     final int N = 10;

     // build a graph from the given edges
     Graph graph = new Graph(edges, N);

     // Perform BFS traversal starting from vertex 1
     if (check(graph, 1, N)) {
         System.out.println("The graph is bipartite");
     } else {
         System.out.println("The graph is not bipartite");
     }
 }


}




