package Graphs.TopologicalSort.TSByDFS;


import java.io.*;
import java.util.*;
 
// This class represents a
// directed graph using adjacency
// list representation
class Graph {
    private int V; // No. of vertices
 
    // Array  of lists for
    // Adjacency List Representation
    private LinkedList<Integer> adj[];
 
    // Constructor
    @SuppressWarnings("unchecked") Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
 
    // Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj[v].add(w); // Add w to v's list.
    }
 
    
    private List<Integer> Topological(Graph g) {
		// TODO Auto-generated method stub
    	
    	
    	
    	List<Integer> order = new ArrayList<Integer>();
    	int [] visited = new int[V];
    	
    	for(int  i=0;i<V;i++)
         {    if(visited[i]==0)
    		dfsHelper(order,visited,i,g);    	
         }
  	
		return order;
	}
    private void dfsHelper(List<Integer> order, int[] visited, int src,Graph g) {
		// TODO Auto-generated method stub
    	if(visited[src]==1) return;
    	visited[src] =1 ;
    	
    	for(int child : g.adj[src])
    	{
    		  dfsHelper(order, visited,child, g);
    		
    		
    	}
    	
    	   
    	    order.add(0,src);
    	
    	
		
	}

	public static void main(String args[])
    {
        Graph g = new Graph(4);
    //[6, 4], [6, 2], [5, 3], [5, 4], [3, 0], [3, 1], [3, 2], [4, 1]
//        g.addEdge(6, 4);
//        g.addEdge(6, 2);
//        g.addEdge(5, 3);
//        g.addEdge(5, 4);
//        g.addEdge(3, 0);
//
//        g.addEdge(3, 1);
//
//        g.addEdge(3, 2);
//        g.addEdge(4, 1);

//        g.addEdge(2,0); 
//        g.addEdge(2,3); 
//        g.addEdge(0,1);
//        g.addEdge(3,1);
  
        g.addEdge(0,1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3,0);
        
        
        
 
        System.out.println(
            "Following is Depth First Traversal");
 
        System.out.println(g.Topological(g));
    }

	
}
// This 