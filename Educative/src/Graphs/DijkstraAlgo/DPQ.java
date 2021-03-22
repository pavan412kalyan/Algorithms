package Graphs.DijkstraAlgo;

import java.util.*; 
public class DPQ { 

	private int V; // Number of vertices 
	List<List<Node> > adj; 
	  public DPQ(int V) 
	    { 
	        this.V = V; 
	     
	    } 
	// Function for Dijkstra's Algorithm 
	public void dijkstra(List<List<Node> > adj, int src) 
	{ 
		
		PriorityQueue<int[]> pq  = new PriorityQueue<>((a,b)->a[1]-b[1]);
		pq.offer(new int[]{src,0});
		
		
		int[] dis = new int[V];
		Arrays.fill(dis,Integer.MAX_VALUE);
		
		dis[src]=0;
		
		Set<Integer> visited = new HashSet<Integer>();
		
		while(!pq.isEmpty())
		{
			int[] parent = pq.poll();
			int source=parent[0];
			if(visited.contains(source))
			     continue;
			visited.add(source);
			
			
			for(Node child : adj.get(source))
			{
				int cost = child.cost; //cost to parent edge
				int childNode = child.node;
				
				dis[childNode] = Math.min(dis[childNode], cost + dis[source]);		
		        pq.offer(new int[]{childNode,dis[childNode]});		
		
				
			}
				
			
		}
		
		
		
		
		System.out.println(Arrays.toString(dis));
		
		
		
		
		

		
	} 

	public static void main(String arg[]) 
	{ 
		int V = 5; 
		int source = 0; 

		// Adjacency list representation of the 
		// connected edges 
		List<List<Node> > adj = new ArrayList<List<Node> >(); 

		// Initialize list for every node 
		for (int i = 0; i < V; i++) { 
			List<Node> item = new ArrayList<Node>(); 
			adj.add(item); 
		} 

		// Inputs for the DPQ graph 
		adj.get(0).add(new Node(1, 9)); 
		adj.get(0).add(new Node(2, 6)); 
		adj.get(0).add(new Node(3, 5)); 
		adj.get(0).add(new Node(4, 3)); 

		adj.get(2).add(new Node(1, 2)); 
		adj.get(2).add(new Node(3, 4)); 

		// Calculate the single source shortest path 
		DPQ dpq = new DPQ(V); 
		dpq.dijkstra(adj, source); 

		// Print the shortest path to all the nodes 
		// from the source node 
		System.out.println("The shorted path from node :"); 
	
	} 
} 

//Class to represent a node in the graph 
class Node { 
	public int node; 
	public int cost; 

	public Node() 
	{ 
	} 

	public Node(int node, int cost) 
	{ 
		this.node = node; 
		this.cost = cost; 
	} 

	
} 
