package dynamicProgramming.knapsack01;
/*Problem Statement #
Given a set of positive numbers, determine if there exists a subset whose sum is equal to a given number ‘S’.

Example 1: #
Input: {1, 2, 3, 7}, S=6
Output: True
The given set has a subset whose sum is '6': {1, 2, 3}*/
public class SubsetSum {



		  public boolean canPartition(int[] num, int sum) {
		   
			  return canPartitionRecursive(num, sum, 0);
  
			  
		  }
		  
		  
		  
		  private boolean canPartitionRecursive(int[] num, int sum, int currentIndex) {
			
			  
			  if(sum==0)
			  {
				  return true;
			  }
			  
			  if(currentIndex>=num.length)
			  {
				  return false;
				  
			  }
			  
			   
			  if(num[currentIndex]<=sum)
			  if(canPartitionRecursive(num,sum-num[currentIndex],currentIndex+1))
			     return  canPartitionRecursive(num,sum-num[currentIndex],currentIndex+1);
			  
			  
			  
			  
			  
			  
			  
			  return canPartitionRecursive(num,sum,currentIndex+1);
		  
		  
		  
		  
		  
		  
		  }
		  

		  public static void main(String[] args) {
		    SubsetSum ss = new SubsetSum();
		    int[] num = { 1, 2, 3, 7 };
		    System.out.println(ss.canPartition(num, 6));
		    num = new int[] { 1, 2, 7, 1, 5 };
		    System.out.println(ss.canPartition(num, 10));
		    num = new int[] { 1, 3, 4, 8 };
		    System.out.println(ss.canPartition(num, 6));
		  }
		

}
