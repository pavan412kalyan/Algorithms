package dynamicProgramming.fibonacci;
/*Problem Statement #
Given an array of positive numbers, where each element represents the max number of 
jumps that can be made forward from that element, write a program to find the minimum number of jumps needed to reach the end of the array (starting from the first element). If an element is 0, then we cannot move through that element.

Example 1:

Input = {2,1,1,1,4}
Output = 3
Explanation: Starting from index '0', we can reach the last index through: 0->2->3->4*/
class ArrayJump {

	  public int countMinJumps(int[] jumps) {
	    return this.countMinJumpsRecursive(jumps, 0);
	  }

	  private int countMinJumpsRecursive(int[] jumps, int currentIndex) {
	   
		  
		  if(currentIndex==jumps.length-1)
		  {
			  return 0;
			  
		  }
		  
		  if(jumps[currentIndex]==0 )
		  {
			  return Integer.MAX_VALUE;
			  
		  }
		  
		  
		  int count=Integer.MAX_VALUE;
		  for(int i=currentIndex + 1;i<=currentIndex+jumps[currentIndex] && i<jumps.length;i++)
		  {
			  
			  
			  int res = countMinJumpsRecursive(jumps,i);
			// System.out.println("res"+res);
			  if(res!=Integer.MAX_VALUE)
			  {
				   count= Math.min(1 + res, count);
				  
			  }
			  
			  			  
			  
		  }
		  
		  
		  return count;
		  
	  }

	  public static void main(String[] args) {
	    ArrayJump aj = new ArrayJump();
	    int[] jumps = {2, 1, 1, 1, 4};
	    System.out.println(aj.countMinJumps(jumps));
	    jumps = new int[]{1, 1, 3, 6, 9, 3, 0, 1, 3};
	    System.out.println(aj.countMinJumps(jumps));
	  }
	}