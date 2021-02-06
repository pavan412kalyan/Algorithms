package TwoPointers.TripletSumCloseToTarget;

import java.util.*;

class TripletSumCloseToTarget {

  public static int searchTriplet(int[] arr, int targetSum) {
    int minDif=99999;
    
    Arrays.parallelSort(arr);		 int ans=-1;

	 for(int i=0;i<arr.length;i++)
	 {
		 int l= i+1,r=arr.length-1;
		 int tar = targetSum- arr[i];
		 while(l<r)
		 {
			 if(arr[l]+arr[r]==tar)
			 {
				 return 0;
				 
			 }
			 
			 else if(arr[l]+arr[r]<tar)
			 {
				 int s =arr[i]+arr[l]+arr[r];
				 int diff = Math.abs(s-targetSum);
				 
				 if(minDif>diff) {minDif=diff;ans=s;};
				 
				l++;  
			  	 
			 }
			 else {
				 
				 int s =arr[i]+arr[l]+arr[r];
				 int diff = Math.abs(s-targetSum);
				 
				 if(minDif>diff) {minDif=diff;ans=s;};
				 		 
				r--; 
				 
			 }
			 
			 			 
			 
		 }
		 
		 
		 
		 
		 
		 
	 }
	  
	  
	  
	  
	  return ans;
  }

  public static void main(String[] args) {
    System.out.println(TripletSumCloseToTarget.searchTriplet(new int[] { -2, 0, 1, 2 }, 2));
    System.out.println(TripletSumCloseToTarget.searchTriplet(new int[] { -3, -1, 1, 2 }, 1));
    System.out.println(TripletSumCloseToTarget.searchTriplet(new int[] { 1, 0, 1, 1 }, 100));
  }
}