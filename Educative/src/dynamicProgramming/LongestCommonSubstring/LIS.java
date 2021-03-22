package dynamicProgramming.LongestCommonSubstring;
/*Problem Statement #
Given a number sequence, find the length of its Longest Increasing Subsequence (LIS). 
In an increasing subsequence, all the elements are in increasing order (from lowest to highest).

Example 1:

Input: {4,2,3,6,10,1,12}
Output: 5
Explanation: The LIS is {2,3,6,10,12}.
Example 1:

Input: {-4,10,3,7,15}
Output: 4
Explanation: The LIS is {-4,3,7,15}.*/
class LIS {

	  public int findLISLength(int[] nums) {
	      return findLISLengthRecursive(nums, 0, -1);
	  }

	  private int findLISLengthRecursive(int[] nums, int currentIndex, int previousIndex) {
	   
		  
		  //base case
		  if(currentIndex==nums.length)
		  {
			  return 0;
			  
		  }
		  
		
		  int count1=0;
		  if(previousIndex==-1 || nums[currentIndex] >= nums[previousIndex])
		  {
			  
			  count1 = 1 + findLISLengthRecursive(nums, currentIndex+1 ,currentIndex);
			  
		  }
		  
		   int  count2 = findLISLengthRecursive(nums, currentIndex +1 , previousIndex);
		  
		  
		  
		  
		  
		  return Math.max(count1,count2);
		  
		  
		    
		  
	  }

	  public static void main(String[] args) {
	    LIS lis = new LIS();
	    int[] nums = {4,2,3,6,10,1,12};
	    System.out.println(lis.findLISLength(nums));
	    nums = new int[]{-4,10,3,7,15};
	    System.out.println(lis.findLISLength(nums));
	  }
	}