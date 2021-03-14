package Graphs.primsAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Edge {
  int targetNode;
  int distanceFromNode;
  
  Edge(int targetNode, int distance) {
    this.targetNode = targetNode;
    this.distanceFromNode = distance;
  }
}

class Graph {
  List<List<Edge>> graph;
  boolean visited[];
  int nodes;

  Graph(int nodes) {
    graph = new ArrayList<>();
    visited = new boolean[nodes];
    this.nodes = nodes;

    for (int i = 0; i < nodes; i++) {
      graph.add(i, new ArrayList<>());
    }
  }

  public void addEdge(int sourceNode, int targetNode, int distance) {
    graph.get(sourceNode).add(new Edge(targetNode, distance));
    graph.get(targetNode).add(new Edge(sourceNode, distance));
  }
  
  public int mst() {
    int minCost = 0;
    
    for(int i = 0; i < nodes; i++) {
      if(!visited[i]) {
        minCost = minCost + minimumSpanningTreeUnweightedGraph(i);
      }
    }
    
    return minCost;
  }

  public int minimumSpanningTreeUnweightedGraph(int source) {
	
	  
	  int maxc =0;
	  
	List<Integer> order = new ArrayList<Integer>();  
	  PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
	  for(Edge x : graph.get(source))
	  {
		  
		  pq.offer(new int[]{x.targetNode,x.distanceFromNode});
		  
	  }
	  visited[source]=true;
	  order.add(source);
	  
	  
	  while(!pq.isEmpty())
	  {
		 int[] poll = pq.poll();
	     int node = poll[0];
	     int cost =  poll[1];
		
	     if(visited[node])	  
		 {
		    continue;
		 }
	     
		     visited[node]=true;
			 order.add(node);
			 maxc+=cost;
			 for(Edge x : graph.get(node))
			 {
				     if(!visited[x.targetNode])	  
				  pq.offer(new int[]{x.targetNode,x.distanceFromNode});

			 
		      }
		  
		  
		  
		  
	  }
	  
	  
	  
	  
	  
System.out.println(order);	  
	  
	  
	  
	  
	  
	  return maxc;

  
  }
}

public class MstPrims {

  public static void main(String[] args) {
    int nodes = 5;

    Graph a = new Graph(nodes);

    a.addEdge(0, 1, 6); 
    a.addEdge(0, 3, 4); 
    a.addEdge(1, 2, 10);
    a.addEdge(1, 3, 7);
    a.addEdge(1, 4, 7);
    a.addEdge(2, 3, 8);
    a.addEdge(2, 4, 5);
    a.addEdge(3, 4, 12);
    
    System.out.println(a.mst());
  }
}