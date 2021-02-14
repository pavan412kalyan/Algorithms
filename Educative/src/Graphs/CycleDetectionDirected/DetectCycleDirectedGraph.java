package Graphs.CycleDetectionDirected;

//A Java Program to detect cycle in a graph 
import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List; 

class Graph { 
	
	private final int V; 
	private final List<List<Integer>> adj; 
	int[] visited;

	public Graph(int V) 
	{ 
		visited  = new int[V];
		this.V = V; 
		adj = new ArrayList<>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new LinkedList<>()); 
	} 
	


	private void addEdge(int source, int dest) { 
		adj.get(source).add(dest); 
	} 

	
	private boolean checkBydfs(int src, int[] visited, int[] stack, Graph graph)
	{
		if(stack[src]==1)
		   return true;
		
		if(visited[src]==1)
		      return false ; //already visted answer no found in that path
		
		visited[src]=1;
		stack[src]=1;
		
		System.out.println("source  "+src);
		List<Integer> parent = graph.adj.get(src);
				System.out.println(parent);
	    if(parent!=null)			
		for(int child : parent  )
		{
			if(checkBydfs(child,visited,stack,graph))
				      return true;
			
			
		}
		
		stack[src]=0; // removing from the stack
	
	
		return false;
	}
	
	

	private boolean isCyclic(Graph graph) 
	{ 
	    int[] visited = new int[V];
	    int[] stack = new int[V];  // to store the elements in stack

		  System.out.println(graph.adj);
		for(int  i=0;i<V;i++)
		{
			
				if(checkBydfs(i,visited, stack,graph))
					return true;			
			
		}
		
		
		
		return false;
	} 
	
	
	
	
	
	

	public static void main(String[] args) 
	{ 
		Graph graph = new Graph(4); 
		graph.addEdge(0, 1); 
		graph.addEdge(0, 2); 
		graph.addEdge(1, 2); 
		graph.addEdge(2, 0); 
		graph.addEdge(2, 3); 
		graph.addEdge(3, 3); 
		
		if(graph.isCyclic(graph)) 
			System.out.println("Graph contains cycle"); 
		else
			System.out.println("Graph doesn't "
									+ "contain cycle"); 
		
	    Graph g2 = new Graph(3);
        g2.addEdge(0,1);
        g2.addEdge(1,2);
		
    	
		if(g2.isCyclic(g2)) 
			System.out.println("Graph contains cycle"); 
		else
			System.out.println("Graph doesn't "
									+ "contain cycle"); 
		
        
		
	} 
} 

