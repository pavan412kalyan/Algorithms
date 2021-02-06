package TwoPointers.PairWithTargetSum;

import java.util.*;

class PairWithTargetSum {

	  public static int[] search(int[] arr, int targetSum) {
	    
		  Arrays.sort(arr);
		  
		  int l=0,r=arr.length-1;
		  
		  while(l<r)
		  {
			  if(arr[l]+arr[r]==targetSum)
			  {
				  return new int[] {l,r};

			  }
			  else if(arr[l]+arr[r]<targetSum)
			  {
				  l++;
			  }
			  else {
				  r--;
			  }
			  
			  
		  }
		  
		  return new int[] {-1,-1};
 
		  
		  
		  
		  
	  }

	  public static void main(String[] args) {
	    int[] result = PairWithTargetSum.search(new int[] { 1, 2, 3, 4, 6 }, 6);
	    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
	    result = PairWithTargetSum.search(new int[] { 2, 5, 9, 11 }, 11);
	    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
	  }
	}