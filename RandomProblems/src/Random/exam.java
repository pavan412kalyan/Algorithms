package Random;

import java.util.ArrayList;
import java.util.Arrays;

public class exam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]  arr = new int[] {2,5,-3};
		
		  for(int i =0;i<arr.length;i++)
		  {
			  if(arr[i]<0)
			  arr[i] =-arr[i];
			  
		  }
		  
		  Arrays.sort(arr);
		  System.out.println(Arrays.toString(arr));
		  int ans = 0;
		  for(int i=0;i<arr.length;i++) {	
			 int index = search(arr[i]/2,arr);
			 System.out.println(index);
			 if(i==index)
				 ans+=1;
				else
			 ans+= i-index;
		  }

		  
System.out.println(ans+"-");
	}
	
	
	   public static int search(int value, int[] a) {
		   System.out.println("---");

	        if(value < a[0]) {
	            return 0;
	        }
	        if(value > a[a.length-1]) {
	            return a.length-1;
	        }

	        int lo = 0;
	        int hi = a.length - 1;

	        while (lo <= hi) {
	            int mid = (hi + lo) / 2;

	            if (value < a[mid]) {
	                hi = mid - 1;
	            } else if (value > a[mid]) {
	                lo = mid + 1;
	            } else {
	                return a[mid];
	            }
	        }
	        // lo == hi + 1
	        return (a[lo] - value) < (value - a[hi]) ? lo : hi;
	    }
	
	
}
