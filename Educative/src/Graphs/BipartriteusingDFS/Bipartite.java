package Graphs.BipartriteusingDFS;
/*Problem statement #
Implement a function that checks whether the given undirected graph is bipartite or not.

A bipartite graph is an undirected graph whose vertices can be divided into two independent s
ets—AA and BB— such that every edge (u, v)(u,v) either connects a vertex from AA to BB or a vertex from BB to AA.



Input #
The input is an undirected graph that checks whether the graph is bipartite or not.*/
class Bipartite {
	 public static Object isBipartite(Graph g, int source, boolean visited[], boolean color[]) {
   //  discovered[1] = true;
//		  color[1] = false;

		  
		  for(int u : g.getAdj()[source])
		  {
			  
			  if(visited[u]==false)
			  {
				
				  
				  visited[u]=true;
				  color[u]=!color[source];
				  
				         if (String.valueOf(isBipartite(g, u, visited, color)) == "false")
				             return false;       
				         
			  
			  }
			  else if(color[source]==color[u])
                       return false;
			  
  
		  }
		 
		 
 
	  return true;
	 }
	}

	class Main {
	 public static void main(String args[]) {

	  Graph g = new Graph(7);
	  g.addEdge(1, 2);
	  g.addEdge(2, 3);
	  g.addEdge(3, 4);
	  g.addEdge(4, 5);
	  g.addEdge(5, 6);
	  g.addEdge(6, 1);


	  Graph g2 = new Graph(7);
	  g2.addEdge(3, 2);
	  g2.addEdge(1, 4);
	  g2.addEdge(2, 1);
	  g2.addEdge(5, 3);
	  g2.addEdge(6, 2);
	  g2.addEdge(3, 1);

	  boolean[] discovered = new boolean[8];
	  boolean[] color = new boolean[8];
	  discovered[1] = true;
	  color[1] = false;


	  //Example 1
	  Object x = Bipartite.isBipartite(g, 1, discovered, color);
	  System.out.println("Graph1 is bipartite: " + x);
	 

	  //Example 2
	  x = Bipartite.isBipartite(g2, 1, discovered, color);
	  System.out.println("Graph2 is bipartite: " + x);

	 }
	}