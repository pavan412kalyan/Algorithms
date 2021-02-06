package SlidingWindow.MaxSumSubArrayOfSizeK;


//Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
class MaxSumSubArrayOfSizeK {
	  public static int findMaxSumSubArray(int k, int[] arr) {
	    
		  int start=0;
		  int sum=0,max=Integer.MIN_VALUE;
		  for(int end =0;end<arr.length;end++)
		  {
			  sum+=arr[end];
			  if(end >=k-1)
			  {
				  max = Math.max(max,sum);
				  sum-=arr[start];start++; 
				  
				  
			  }
			  
			  		  
			  
		  }		  
		  return max;
		  
	    
	  }
	  
	  public static void main(String[] args) {
	    System.out.println("Maximum sum of a subarray of size K: "
	        + MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
	    System.out.println("Maximum sum of a subarray of size K: "
	        + MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
	  }
	}