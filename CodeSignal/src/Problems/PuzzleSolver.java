package Problems;
import java.util.*;
public class PuzzleSolver {

	 static int rows;
	 static int cols;
	 static Set<String> visited = new HashSet<>();
	 static int[] dirs = new int[]{-1,1,3,-3};
	
	
	static void problem(List<List<Integer>>  matrix)
	{
		Queue<String> queue = new LinkedList<>();
		
		rows = matrix.size();
		cols = matrix.get(0).size();
		StringBuilder cur = new StringBuilder("");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				cur.append(matrix.get(i).get(j));		
					
			}
			
		}
		
		System.out.println(cur);
		queue.offer(cur.toString());
		visited.add(cur.toString());
		
		int ans  = bfs(queue);
		
		
      System.out.println(ans);
		
	}
	
	
	private static int bfs(Queue<String> queue) {
		// TODO Auto-generated method stub
		
		int count=0;
		

		while(!queue.isEmpty())
		{
			int size = queue.size();
			
			for(int i=0;i<size;i++)
			{
				String poll = queue.poll();
				System.out.println(poll);
				if(poll.equals("123456780"))
				{
					
					return count;
					
				}
				
			int indexOfZero = poll.indexOf("0");
		//	 System.out.println(indexOfZero);
			       
					for(int d : dirs)
					{
						
					       	int indexOfNeig = indexOfZero + d;
	   if( indexOfNeig < 0 || indexOfNeig > 8 || (d==-1 &&  indexOfZero == 6) 
			|| (d==-1 &&  indexOfZero == 3) || (d==1 &&  indexOfZero == 2)
			|| (d==1 && indexOfZero==5 ))
						           continue;
						
						 
						 String newStr = swap(poll,indexOfNeig,indexOfZero);
					    	
						  if(!visited.contains(newStr))
						  {
							  visited.add(newStr);
							  queue.offer(newStr);					  
						  }
						 
					
					}
				
			}
			
			count++;

			
	    }
		
		
		return -1;
		
		
		
	}


	private static String swap(String poll, int indexOfNeig, int indexOfZero) {
		// TODO Auto-generated method stub
       
	//System.out.println(indexOfNeig+"="+indexOfZero);
		StringBuilder s = new StringBuilder(poll);
		s.setCharAt(indexOfNeig,poll.charAt(indexOfZero));
		s.setCharAt(indexOfZero,poll.charAt(indexOfNeig));

		//System.out.println(s.toString()); 
       return s.toString();
	
	}


	public static void main(String[] args) {

		
	  List<List<Integer>> matrix 	= new ArrayList<>();
	  
//	  matrix.add(Arrays.asList(0,1,3));
//	  matrix.add(Arrays.asList(4,2,5));
//	  matrix.add(Arrays.asList(7,8,6));
	  
	  
	  matrix.add(Arrays.asList(1,2,3));
	  matrix.add(Arrays.asList(4,5,6));
	  matrix.add(Arrays.asList(7,0,8));

	 	System.out.println(matrix);
	  problem(matrix);
		
		
	}

}
