package dynamicProgramming.knapsack01;
/*Problem Statement #
Given a set of positive numbers (non zero) and a target sum ‘S’. Each number should be assigned either a ‘+’ or ‘-’ sign. 
We need to find out total ways to assign symbols to make the sum of numbers equal to target ‘S’.
https://www.educative.io/courses/grokking-dynamic-programming-patterns-for-coding-interviews/7nAOY4oy64A
Example 1: #
Input: {1, 1, 2, 3}, S=1
Output: 3
Explanation: The given set has '3' ways to make a sum of '1': {+1-1-2+3} & {-1+1-2+3} & {+1+1+2-3}*/
class countSubsetSum {

	  public int countSubsets(int[] num, int sum) {
	    return this.countSubsetsRecursive(num, sum, 0);
	  }

	  private int countSubsetsRecursive(int[] num, int sum, int currentIndex) {
	   
		 
		   if(sum==0)
		   {
			   return 1;
		   }
		   
		   if(currentIndex>=num.length)
		   {
			   
			   return 0;
			   
			   
		   }
		  
		   
		   //include
		   int res1=0 ;
		   if(sum>=num[currentIndex])
		   res1 = countSubsetsRecursive(num,sum-num[currentIndex],currentIndex+1);
		   
		   //donot include
		   int res2 =countSubsetsRecursive(num,sum,currentIndex+1);

		  return res1 + res2;
		  
		  
		  
	  }

	  public static void main(String[] args) {
		  countSubsetSum ss = new countSubsetSum();
	    int[] num = {1, 1, 2, 3};
	    System.out.println(ss.countSubsets(num, 4));
	    num = new int[]{1, 2, 7, 1, 5};
	    System.out.println(ss.countSubsets(num, 9));
	  }
	}
