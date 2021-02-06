package TwoPointers.RemoveDuplicates;

import java.util.*;

class RemoveDuplicates {

	  public static int remove(int[] nums) {
	    
		  int l=0,r=1;
		  
		  
		  while(r<nums.length)
		  {  				    System.out.println("-+-");

			  if(nums[l]!=nums[r])
			  {
				  l++;
				  nums[l]=nums[r];
				    System.out.println("--");
 
				  
			  }
			  r++;
			  
			  System.out.println("-+-");
			  
		  }
		  

		  
		  
		  return 0;
	  }

	  public static void main(String[] args) {
	    int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
	    System.out.println(Arrays.toString(arr));
	    System.out.println(RemoveDuplicates.remove(arr));
	    System.out.println(Arrays.toString(arr));


	    arr = new int[] { 2, 2, 2, 11 };
	    System.out.println(RemoveDuplicates.remove(arr));
	  }
	}
