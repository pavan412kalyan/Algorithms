package dynamicProgramming.LongestCommonSubstring;
/*Given a number sequence, find the increasing subsequence with the highest sum. Write a method that returns the highest sum.

Example 1:

Input: {4,1,2,6,10,1,12}
Output: 32
Explanation: The increaseing sequence is {4,6,10,12}. 
Please note the difference, as the LIS is {1,2,6,10,12} which has a sum of '31'.
Example 2:

Input: {-4,10,3,7,15}
Output: 25
Explanation: The increaseing sequences are {10, 15} and {3,7,15}.*/
class LISS {

	  public int findLISLength(int[] nums) {
	      return findLISLengthRecursive(nums, 0, -1);
	  }

	  private int findLISLengthRecursive(int[] nums, int currentIndex, int previousIndex) {
	   
		  
		  //base case
		  if(currentIndex==nums.length)
		  {
			  return 0;
			  
		  }
		  
		
		  int sum1=Integer.MIN_VALUE;
		  if(previousIndex==-1 || nums[currentIndex] >= nums[previousIndex])
		  {
			  
			  sum1 =  nums[currentIndex] + findLISLengthRecursive(nums, currentIndex+1 ,currentIndex);
			  
		  }
		  
		   int  sum2 = findLISLengthRecursive(nums, currentIndex +1 , previousIndex);
		  
		  
		  
		  
		  
		  return Math.max(sum1,sum2);
		  
		  
		    
		  
	  }

	  public static void main(String[] args) {
		  LISS lis = new LISS();
		    int[] nums ={1, 101, 2, 3, 100, 4, 5}; 
	    System.out.println(lis.findLISLength(nums));
	    nums = new int[]{-4,10,3,7,15};
	    System.out.println(lis.findLISLength(nums));
	    nums = new int[]{-4,-10,-3,-70};
	    System.out.println(lis.findLISLength(nums));
	  }
	}