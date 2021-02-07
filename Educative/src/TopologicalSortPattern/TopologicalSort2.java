package TopologicalSortPattern;
import java.util.*;



class TopologicalSort2 {
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
    //System.out.println(edgesMap.toString());

    
    //get all vertices from  0 to vertices - 1 with 0 inDegree
  
    Stack<Integer> stack = new Stack<Integer>();//sorted order

    
    Queue<Integer> queue = new LinkedList<>();
    for(int i=0 ;i<vertices;i++)
    {
    	if(inDegree.get(i)==0)
    	 { queue.offer(i);    	 

    	 }
    	
    }
    
    
    while(!queue.isEmpty())
    {
    	int parent = queue.poll();
    	
		 sortedOrder.add(parent) ;

    	
    	
    	
    	for(int child : edgesMap.get(parent))
    	{
    		if(inDegree.get(child)-1==0)
    		{
    			queue.offer(child);
    		}
    		else
    		inDegree.put(child,inDegree.get(child)-1);
    		
    
    		
    	}
    	
    		
    }
    
    
    
    
   
    
    return sortedOrder;
  }

  public static void main(String[] args) {
    List<Integer> result = TopologicalSort2.sort(4,
        new int[][] { new int[] { 3, 2 }, new int[] { 3, 0 }, new int[] { 2, 0 }, new int[] { 2, 1 } });
    System.out.println(result);

    result = TopologicalSort2.sort(5, new int[][] { new int[] { 4, 2 }, new int[] { 4, 3 }, new int[] { 2, 0 },
        new int[] { 2, 1 }, new int[] { 3, 1 } });
    System.out.println(result);

    result = TopologicalSort2.sort(7, new int[][] { new int[] { 6, 4 }, new int[] { 6, 2 }, new int[] { 5, 3 },
        new int[] { 5, 4 }, new int[] { 3, 0 }, new int[] { 3, 1 }, new int[] { 3, 2 }, new int[] { 4, 1 } });
    System.out.println(result);
  }
}
