package Graphs.TopologicalSort.AllPossibleTop;



import java.util.*;
 
class TopologicalSort {
  public static void sort(int vertices, int[][] edges) {
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
    
    System.out.println(inDegree.toString());
    
         for(int i=0;i<vertices;i++)    
         {
        	 if(inDegree.get(i)==0) queue.offer(i);
        	 	 
         }
    
      
      print(inDegree,edg,queue, new int[vertices],vertices, new ArrayList<Integer>() );
    
    
  
  }
  
  
 
  private static void print(HashMap<Integer, Integer> inDegree, HashMap<Integer, ArrayList<Integer>> edg,
		Queue<Integer> queue, int[] visited, int vertices, ArrayList<Integer> sorted)

	  {
	        //System.out.println("--");
		  
		  for(int i=0;i<vertices;i++)
		  {
			  
			  //choose a vertices to travel that is unvvisted and indegree 0
			  
			  if(inDegree.get(i)==0 && visited[i]==0)
			  {
				  
				  //choose and visit
				  visited[i]=1;
				  sorted.add(i);
				  for(int child : edg.get(i))
				  inDegree.put(child,inDegree.get(child)-1);
				  
				  
				  //explore selected vertices
				  
				  print(inDegree,edg,queue,visited,vertices,sorted);
				  
				  
				      //unvisit
			       	  visited[i]=0;
				       sorted.remove(sorted.size()-1);
				         for(int child : edg.get(i))
					  inDegree.put(child,inDegree.get(child)+1);
					 		  		  
				  
			  }
			
			//	 System.out.println(sorted);
  
			
			  
		  }		  
		     if(sorted.size()==vertices) 
			 {
				 System.out.println(sorted);
				 
			 }
		  
		  
		  
	}












public static void main(String[] args) {
 //  TopologicalSort.sort(4,
//        new int[][] { new int[] { 3, 2 }, new int[] { 3, 0 }, new int[] { 2, 0 }, new int[] { 2, 1 } });
//    System.out.println(result+"--");
//
//    result = TopologicalSort.sort(5, new int[][] { new int[] { 4, 2 }, new int[] { 4, 3 }, new int[] { 2, 0 },
//        new int[] { 2, 1 }, new int[] { 3, 1 } });
//    System.out.println(result);

	TopologicalSort.sort(6, new int[][] { new int[] { 2, 5 }, new int[] { 0, 5 }, new int[] { 0, 4 },
        new int[] { 1, 4 }, new int[] { 3, 2 }, new int[] { 1, 3 } });
    System.out.println();
  }
}