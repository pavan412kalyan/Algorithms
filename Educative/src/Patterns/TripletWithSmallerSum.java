package Patterns;

/* Given an array arr of unsorted numbers and a target sum, count all triplets in it such 
 * that arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices. Write a function to return the count of such triplets.

Example 1:

Input: [-1, 0, 2, 3], target=3 
Output: 2
Explanation: There are two triplets whose sum is less than the target: [-1, 0, 3], [-1, 0, 2]*/


import java.util.*;

class TripletWithSmallerSum {

  public static int searchTriplets(int[] arr, int target) {
    int count =0;
	  
	  
	  for(int i=0;i<arr.length-2;i++)
	  {
		  int l=i+1,r=arr.length-1;
		  
		  int tar = target - arr[i];
		  
		  while(l<r)
		  {
			  int cursum = arr[l] + arr[r];
			  if(cursum<tar)
			  {
				  count+=r-l;
				  l++;
				  
			  }
			  else 
			  {
				  r--;
				  
			  }

			  
			  
			  
			  
		  }
		  
		  
		  
		  
		  
	  }


    
    
    
    
    
    
    
    return count;
  }

  public static void main(String[] args) {
    System.out.println(TripletWithSmallerSum.searchTriplets(new int[] { -1, 0, 2, 3 }, 3));
    System.out.println(TripletWithSmallerSum.searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
  }
}