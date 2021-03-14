package Graphs.CycleDetectionUndirected;

//A Java Program to detect cycle in an undirected graph 
import java.io.*; 
import java.util.*; 
//This class represents a 
//directed graph using adjacency list 
//representation 
class Graph 
{ 
	
	// No. of vertices 
	private int V; 
	
	// Adjacency List Represntation 
	private LinkedList<Integer> adj[]; 

	// Constructor 
	Graph(int v) 
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for(int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	// Function to add an edge 
	// into the graph 
	void addEdge(int v,int w) 
	{ 
		adj[v].add(w); 
		adj[w].add(v); 
	} 

	private boolean isCyclic() {
		// TODO Auto-generated method stub
		
		int[] visited = new int[V];
		
		//System.out.println(adj);
		
		for(int i=0;i<V; i++)
		{
			if(visited[i]==0)
			{
				if( dfs(i,visited,-1)==true);//source,visited,parent
			        return true;
			}
		}
		
		
		
		return false;
	} 
	
	
	private boolean dfs(int src, int[] visited, int parent) {
		// TODO Auto-generated method stub
		  System.out.println(src);
		visited[src]=1;
		
		  for(int child : adj[src])
		  {
			  if(visited[child]==0)
			  {
				  if(dfs(child,visited,src)==true)
					  return true;
			  }
			  
			  else if(child!=parent)
			  {
				  return true;
			  }
			  	  
		  }
		  
		  return false;	
		
	}

	// Driver method to test above methods 
	 public static void main(String args[]) 
	    { 
	          
	        // Create a graph given  
	        // in the above diagram 
//	        Graph g1 = new Graph(5); 
//	        g1.addEdge(1, 0); 
//	        g1.addEdge(0, 2); 
//	        g1.addEdge(2, 1); 
//	        g1.addEdge(0, 3); 
//	        g1.addEdge(3, 4); 
//	        if (g1.isCyclic()) 
//	            System.out.println("Graph  contains cycle"); 
//	        else
//	            System.out.println("Graph  doesn't contains cycle"); 
	  
	        Graph g2 = new Graph(3); 
	        g2.addEdge(0, 1); 
	        g2.addEdge(1, 2); 

	        
	        if (g2.isCyclic()) 
	            System.out.println("Graph  contains cycle"); 

	        else
	            System.out.println("Graph  doesn't contains cycle"); 

	    } 
	} 