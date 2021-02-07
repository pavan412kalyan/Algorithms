package TopologicalSortPattern;


import java.util.*;

class AllTaskSchedulingOrders {
  public static void printOrders(int vertices, int[][] edges) {
    // TODO: Write your code here
	  
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
	    System.out.println(edgesMap.toString());
	    System.out.println("iND"+inDegree.toString());


	    
	    //get all vertices from  0 to vertices - 1 with 0 inDegree
	  
	 //   Stack<Integer> stack = new Stack<Integer>();//sorted order

	  
	    
        int[] visited = new int[vertices];

        print(edgesMap,new ArrayList<Integer>(),visited,inDegree);

	  
	  
	  
	  
	  
	  
  
	  
  }
  

	 static void print(HashMap<Integer,List<Integer>> edges,List<Integer> sortedOrder,int[] visited,HashMap<Integer,Integer> inDegree)
	 {

		 

		 
		 for(int i=0;i<visited.length;i++)
		 {
			 
			 if(visited[i]==0 && inDegree.get(i)==0)
			 {
				 
				 
				 //select and visit
				    visited[i]=1;
				    sortedOrder.add(i);
				  for(int child : edges.get(i))
				{
					  inDegree.put(child,inDegree.get(child)-1);
				
				
				}
				  
				  //backtrack
				  print(edges,sortedOrder,visited,inDegree); 
				  
				  
				  
				  // Unvisit

				     visited[i]=0;
				    sortedOrder.remove(sortedOrder.size()-1);
				    
				    for(int child : edges.get(i))
					{
						  inDegree.put(child,inDegree.get(child)+1);
					
					
					}
				 
				 
			 }
			 
			 
			 			 
			 
		 }
		 
		 
		 if(sortedOrder.size()==visited.length)
		 {
			 System.out.println(sortedOrder);
		 }
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
  
  
  
  
  
  
  
  
  
  
  

  public static void main(String[] args) {
    AllTaskSchedulingOrders.printOrders(3, new int[][] { new int[] { 0, 1 }, new int[] { 1, 2 } });
    System.out.println();

    AllTaskSchedulingOrders.printOrders(4,
        new int[][] { new int[] { 3, 2 }, new int[] { 3, 0 }, new int[] { 2, 0 }, new int[] { 2, 1 } });
    System.out.println();

    AllTaskSchedulingOrders.printOrders(7, new int[][] { new int[] { 6, 4 }, new int[] { 6, 2 }, new int[] { 5, 3 },
        new int[] { 5, 4 }, new int[] { 3, 0 }, new int[] { 3, 1 }, new int[] { 3, 2 }, new int[] { 4, 1 } });
    System.out.println();
  }
}