package TwoPointers;

import java.util.*;
/*Given an array with positive numbers and a target number, 
 * find all of its contiguous subarrays whose product is less than the target number.
 * 
 * Input: [2, 5, 3, 10], target=30 
Output: [2], [5], [2, 5], [3], [5, 3], [10]
Explanation: There are six contiguous subarrays whose product is less than the target.
 * 
 * 
 * */
class SubarrayProductLessThanK {

  public static List<List<Integer>> findSubarrays(int[] arr, int target) {
   
	  List<List<Integer>> ans = new ArrayList<List<Integer>>();
	  int product =1,start=0;
	  int n=arr.length;
	  for(int end=0;end<n;end++)
	  {
		  product*=arr[end];
		  
		  while(product>=target )
		  {
			  product/=arr[start];
			  start++;
		  }
		  
		  List<Integer> temp = new ArrayList<Integer>();
		  
		  for(int i=end;i>=start;i-- )
		  {
			  temp.add(0,arr[i]);
			  ans.add(new ArrayList<Integer>(temp));
			  
			  
		  }
		  
		  
		  
		  
	  }
	    
	  
	  return ans;
	  
	  
  }

  public static void main(String[] args) {
    System.out.println(SubarrayProductLessThanK.findSubarrays(new int[] { 2, 5, 3, 10 }, 30));
    System.out.println(SubarrayProductLessThanK.findSubarrays(new int[] { 8, 2, 6, 5 }, 50));
  }
}

