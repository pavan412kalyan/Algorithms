package dynamicProgramming.fibonacci;
/*Problem Statement #
Given a number ‘n’, implement a method to count how many possible ways there are to express ‘n’ as the sum of 1, 3, or 4.

Example 1:

n : 4
Number of ways = 4
Explanation: Following are the four ways we can express 'n' : {1,1,1,1}, {1,3}, {3,1}, {4}*/
class ExpressNumber {

	  public int CountWays(int n) {
	   
		  if(n==1)
		  {
			  return 1;
		  } 
		  if(n==2)
		  {
			  return 1;
			  
		  }
		  
		  if(n==3)
		  {
			  return 2;
		  }
		  if(n==0)
		  {
			  return 1;
		  }
		  if(n<0)
		   return 0;
		  
		  
		  
		  //1
		  int count1 = CountWays(n-1);
		  //3
		  int count2 = CountWays(n-3);
		  //4
          int count4 = CountWays(n-4);
          
          return count1 + count2 + count4;
		  
		  
	  }

	  public static void main(String[] args) {
	    ExpressNumber en = new ExpressNumber();
	    System.out.println(en.CountWays(4));
	    System.out.println(en.CountWays(5));
	    System.out.println(en.CountWays(6));
	  }
	}