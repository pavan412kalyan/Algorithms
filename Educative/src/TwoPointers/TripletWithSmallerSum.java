package TwoPointers;


/*GGiven an array arr of unsorted numbers and a target sum, count all triplets in it such that arr[i] + arr[j] + arr[k] < target
 *  where i, j, and k are three different indices. Write a function to return the count of such triplets.*/

import java.util.*;

class TripletWithSmallerSum {

  public static int searchTriplets(int[] arr, int target) {
    
	  Arrays.parallelSort(arr);		 int ans=-1;
         ans=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 int l= i+1,r=arr.length-1;
			 int tar = target- arr[i];
			 while(l<r)
			 {
				 if(arr[l]+arr[r]<tar)
				 {
					 ans+=r-l;
					 l++;
					 
				 }			
				 else r--;
				 
			 }		 
		 }
		  
		  
		  
		  
		  return ans;
  }

  public static void main(String[] args) {
    System.out.println(TripletWithSmallerSum.searchTriplets(new int[] { -1, 0, 2, 3 }, 3));
    System.out.println(TripletWithSmallerSum.searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
  }
}
