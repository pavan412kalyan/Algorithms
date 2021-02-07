package TopologicalSortPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort1 {

	 public static List<Integer> sort(int vertices, int[][] edges) {
		  System.out.println("+++++++++");
	    List<Integer> sortedOrder = new ArrayList<>();
	    
	    HashMap<Integer,List<Integer>> edgesMap = new HashMap();
	    
	    HashMap<Integer,Integer> inDegree = new HashMap();

	    //vertices -
	    
	    for(int i=0;i<vertices;i++)
	    {  inDegree.put(i,0);
			List<Integer> l =new ArrayList<Integer>();
			edgesMap.put(i,l);


	    }
	    
	    
	    for(int[] e : edges )
	    {
	    	  	
	    		List<Integer> l = edgesMap.get(e[0]);
	    		l.add(e[1]);
	    		edgesMap.put(e[0],l);  	
	    	inDegree.put(e[1],inDegree.get(e[1])+1);
	    
	    }
	   // System.out.println(edgesMap.toString());
 
	   int[] vis = new int[vertices]; 
	  for(int i=0;i<vertices;i++)
	  { 
		  if(vis[i]==0)
		  dfs(edgesMap,i,sortedOrder,vis);
	  
	  
	  }
	  
	    
	   
	    
	    return sortedOrder;
	  }
	 
	 
	 
	 static void dfs(HashMap<Integer,List<Integer>> edges,int src, List<Integer> sortedOrder,int[] vis)
	 {
		 //System.out.println(Arrays.toString(vis));
		 
		vis[src]=1;
		
		 for(int child : edges.get(src))
		 {
			 if(vis[child]==0)
			 dfs(edges,child,sortedOrder,vis);
			 
			 
		 }
		 
		 sortedOrder.add(0,src);
		 
		
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	  public static void main(String[] args) {
	    List<Integer> result = TopologicalSort1.sort(3, new int[][] { new int[] { 0, 1 }, new int[] { 1, 2 } });
	    System.out.println(result);

	    result = TopologicalSort1.sort(5, new int[][] { new int[] { 4, 2 }, new int[] { 4, 3 }, new int[] { 2, 0 },
	        new int[] { 2, 1 }, new int[] { 3, 1 } });
	    System.out.println(result);

	    result = TopologicalSort1.sort(7, new int[][] { new int[] { 6, 4 }, new int[] { 6, 2 }, new int[] { 5, 3 },
	        new int[] { 5, 4 }, new int[] { 3, 0 }, new int[] { 3, 1 }, new int[] { 3, 2 }, new int[] { 4, 1 } });
	    System.out.println(result);
	  }
	}