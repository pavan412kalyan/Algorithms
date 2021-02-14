
package Graphs.TopologicalSort.TSByBFS;

import java.util.*;
 
class TopologicalSort {
  public static List<Integer> sort(int vertices, int[][] edges) {
    List<Integer> sortedOrder = new ArrayList<>();
    // TODO: Write your code here
     
    HashMap<Integer,Integer> inDegree  = new HashMap<Integer, Integer>();
    HashMap<Integer,ArrayList<Integer>> edg = new HashMap<Integer, ArrayList<Integer>>();
    Queue<Integer> queue = new  LinkedList<Integer>();
    
    
    for(int i=0;i<vertices;i++)
    {
    	inDegree.put(i,0);
    	edg.put(i,new ArrayList<Integer>());
     	
    	
    }
  
    
    for(int i=0;i<edges.length;i++)
    {
    	int parent = edges[i][0];
    	int child = edges[i][1];
    	inDegree.put(child,inDegree.get(child)+1);
    	edg.get(parent).add(child);
        
    }
    
         for(int i=0;i<vertices;i++)    
         {
        	 if(inDegree.get(i)==0) queue.offer(i);
        	 	 
         }
    
    
         while(!queue.isEmpty())
         {
        	 
        	 int poll = queue.poll();
        	 
        	sortedOrder.add(poll);
        	
        	List<Integer> childOfpolled = edg.get(poll);
        	 for(int c : childOfpolled )
        	    {
        		
        		 inDegree.put(c,inDegree.get(c)-1);
        	      if(inDegree.get(c)==0)
        		      queue.offer(c);
        	    }
        	 
        	 
        	 
        	 
         }
    
    
    
    
    
    
    
    return sortedOrder;
  }

  public static void main(String[] args) {
    List<Integer> result = TopologicalSort.sort(4,
        new int[][] { new int[] { 3, 2 }, new int[] { 3, 0 }, new int[] { 2, 0 }, new int[] { 2, 1 } });
    System.out.println(result);

    result = TopologicalSort.sort(5, new int[][] { new int[] { 4, 2 }, new int[] { 4, 3 }, new int[] { 2, 0 },
        new int[] { 2, 1 }, new int[] { 3, 1 } });
    System.out.println(result);

    result = TopologicalSort.sort(7, new int[][] { new int[] { 6, 4 }, new int[] { 6, 2 }, new int[] { 5, 3 },
        new int[] { 5, 4 }, new int[] { 3, 0 }, new int[] { 3, 1 }, new int[] { 3, 2 }, new int[] { 4, 1 } });
    System.out.println(result);
  }
}