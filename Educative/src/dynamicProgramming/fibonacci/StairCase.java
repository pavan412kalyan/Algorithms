package dynamicProgramming.fibonacci;
/*Problem Statement #
Given a stair with ‘n’ steps, implement a method to count how many possible ways 
are there to reach the top of the staircase, given that, at every step you can either take 1 step, 2 steps, or 3 steps.

Example 1:

Number of stairs (n) : 3
Number of ways = 4
Explanation: Following are the four ways we can climb : {1,1,1}, {1,2}, {2,1}, {3}*/
class StairCase {

	  public int CountWays(int n) {
	    
		  
		  if(n==0)
		  {
			  return 1;
			  
		  }
		  
		  
		  if(n<0)
		  {
			  return 0;
			  
		  }
		  
		  if(n==1 || n==2 )
		  {
			  return n;
			  
		  }
		  
		  
		  
		
		  //1st 
		  int count1 = CountWays( n-1); 
		  
		  
		  int count2 = CountWays( n-2); 

		  
	      int count3 = CountWays( n-3);
	      
	      
	      return count1 + count2 + count3;

	  }

	  public static void main(String[] args) {
		  StairCase sc = new StairCase();
	    System.out.println(sc.CountWays(3));
	    System.out.println(sc.CountWays(4));
	    System.out.println(sc.CountWays(5));
	  }
	}