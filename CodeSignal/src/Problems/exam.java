package Problems;

import java.util.*;

public class exam {
	
	static HashSet<Integer> visited;
	static List<Integer> ans;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	       HashMap<Integer,List<Integer>> edges = new HashMap();
	       visited = new HashSet();
	       ans = new ArrayList<Integer>();
	       
	     //  int[][] graph= new int[][] {{3,5},{1,4},{2,4},{1,5}};
		    int[][] graph= new int[][] {{4,7},{8,12},{13,12},{15,13},{7,8}};

	       
	       
	      
	       
	        for(int[] e : graph)
	        {
	            if(!edges.containsKey(e[0]))
	            {
	                List<Integer> l = new ArrayList();

	                l.add(e[1]);
	                
	                edges.put(e[0],l);

	                
	                
	            }
	            
	            else
	            {
	            	List<Integer> l = edges.get(e[0]);
	                l.add(e[1]);
	                edges.put(e[0],l);
	                        
	            }
	            
	            
	            
	            if(!edges.containsKey(e[1]))
	            {
	                List<Integer> l = new ArrayList();

	                l.add(e[0]);
	                
	                edges.put(e[1],l);

	                
	                
	            }
	            
	            else
	            {
	            	List<Integer> l = edges.get(e[1]);
	                l.add(e[0]);
	                edges.put(e[1],l);
	                        
	            }
	            
	            System.out.println(edges);
	            
	            
	            
	            
	        }
	        int start=0;
	        
	        
	        for(Map.Entry<Integer,List<Integer>> x : edges.entrySet())
	        {
	        	
	        	if(x.getValue().size()==1)
	        	{
	        		start =x.getKey();
	        	}
	        	
	        	
	        }
	        
	        //System.out.println(start);
	        
	        //System.out.println(edges);
	        
	        
	        dfs(edges, start);
	        
	        
	        System.out.println(ans);
	   
	        
		}
		
	
		
		
	



static void dfs(HashMap<Integer,List<Integer>> edges,int source)
{
	if(visited.contains(source))
	   return;
	
	ans.add(source);
	
	
	visited.add(source);
	
	for( int child : edges.get(source) )
	{
		 dfs(edges,child);
		
		
	}
	
	
	
	
}
	
	
	
	
	
	

}
