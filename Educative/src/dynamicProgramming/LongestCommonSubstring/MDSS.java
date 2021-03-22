package dynamicProgramming.LongestCommonSubstring;
/*Problem Statement #
Given a number sequence, find the minimum number of elements that should be deleted to make the remaining sequence sorted.

Example 1:

Input: {4,2,3,6,10,1,12}
Output: 2
Explanation: We need to delete {4,1} to make the remaing sequence sorted {2,3,6,10,12}.
Example 2:

Input: {-4,10,3,7,15}
Output: 1
Explanation: We need to delete {10} to make the remaing sequence sorted {-4,3,7,15}.*/
class MDSS {

	
	
	//Find LIS, that is the maximum subseq possible, total length - LIS length is the deletions
	
	  public int findMinimumDeletions(int[] nums){
	   
		  
		  return nums.length - findLISLengthRecursive(nums,0,-1);
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
	    MDSS mdss = new MDSS();
	    int[] nums = {4,2,3,6,10,1,12};
	    System.out.println(mdss.findMinimumDeletions(nums));
	    nums = new int[]{-4,10,3,7,15};
	    System.out.println(mdss.findMinimumDeletions(nums));
	    nums = new int[]{3,2,1,0};
	    System.out.println(mdss.findMinimumDeletions(nums));
	  }
	}