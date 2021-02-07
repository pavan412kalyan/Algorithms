package MixProblems;

import java.util.LinkedList;
import java.util.Queue;

public class Graphs {
 int v;
  LinkedList<Integer>[] adj;
  int[] visited;
  int[] edgeTo;
  int[] visited1;
public Graphs(int v) {
	super();
	this.v = v;
	visited= new int[v];
	edgeTo= new int[v];
	visited1= new int[v];


	adj = new LinkedList[v];
	for(int i=0;i<v;i++)
	{
		adj[i] =new LinkedList<Integer>();
	}
	
}

  void addEdge(int a, int b)
  {
	  adj[a].add(b);
	  adj[b].add(a);
	  
  }
  
  void dfs(int v)
  {
	 visited[v]=1;
	 System.out.println(v);


for(int a : adj[v])
  {
    if(visited[a]==0)  
		 dfs(a);  
  }
	  
  }
  
  void bfs(int v)
  {
   Queue<Integer> q = new LinkedList<Integer>(); 
     q.offer(v);
  visited1[v]=1;
	while(!q.isEmpty())
	{
		int p=q.poll();
		//visited1[p]=1;

		System.out.println(p);
		for(int a : adj[p])
		  {
			if(visited1[a]==0)
		       {
				q.offer(a);
		        visited1[a]=1;

		       }
		  }
	}
		
		
	}
	  
	   
  

  
  int dfsQ()
  {  int c=0;
	  for(int i=0;i<=6;i++)
	   {   if(visited[i]==0)
		     { 
		       c++;
		       dfs(i);
		      
		     }
	   }
	return c;
	   
	  
  }

  public static void main(String args[]) 
  { 
  
   Graphs g = new Graphs(4);
   g.addEdge(0, 1); 
   g.addEdge(0, 2); 
   g.addEdge(1, 2); 
   g.addEdge(2, 3); 
   g.addEdge(3, 3); 

  
   //System.out.println(g.dfsQ());
   g.bfs(2);
   System.out.println("==");

   g.dfs(2);
  
  }
   
  
  }
	
	

