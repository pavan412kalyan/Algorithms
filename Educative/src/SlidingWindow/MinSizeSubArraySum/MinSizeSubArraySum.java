package SlidingWindow.MinSizeSubArraySum;

//Given an array of positive numbers and a positive number ‘S,’ 
//find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.


class MinSizeSubArraySum {
	  public static int findMinSubArray(int S, int[] arr) {
	    
		  int start =0;
		  int end =0;
		  int sum=0;
		  int min = 1000000;
		  while(end<arr.length)
		  {
			  sum+=arr[end];	  
			  
			  while(sum>=S)
			  {
				  sum-=arr[start];			
				  min= Math.min(min, end-start+1);

				  start++;
			  }	  		  
			  
			  end++;
		  }
		  
		  return min;
		  
	    }

	    
	

	  public static void main(String[] args) {
	    int result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
	    System.out.println("Smallest subarray length: " + result);
	    result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
	    System.out.println("Smallest subarray length: " + result);
	    result = MinSizeSubArraySum.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
	    System.out.println("Smallest subarray length: " + result);
	  }
	}
