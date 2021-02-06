package TwoPointers;

import java.util.*;

class TripletSumToZero {

  public static List<List<Integer>> searchTriplets(int[] arr) {
    Arrays.sort(arr);
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    for(int i=0;i<arr.length;i++)
    {
    	if(i>0 && arr[i]==arr[i-1])
    	       continue;
    	twosum(arr,i+1,arr.length,-arr[i],ans);
        
    }
    
    
    return ans;
    
    
  }

  private static void twosum(int[] arr, int i, int length,int target,List<List<Integer>> ans) {
	
	  int l = i,r=length-1;
	  
	  while(l<r)
	  {
		  if(arr[l]+arr[r]==target)
		  {
			  ans.add(Arrays.asList(-target,arr[l],arr[r]));
			  l++;r--;
			 while(l<r && arr[l]==arr[l-1])l++;
			 while(l<r && arr[r]==arr[r+1])r--;

			 
			  
			  
		  }
		  else if(arr[l]+arr[r]>target)r--;
		 
		  else l++;
		  
		  
		  
	  }
	  
	  
	  
	  
	
}
  
  
  
  
  
  
  
  
  
  

public static void main(String[] args) {
    System.out.println(TripletSumToZero.searchTriplets(new int[] { -3, 0, 1, 2, -1, 1, -2 }));
    System.out.println(TripletSumToZero.searchTriplets(new int[] { -5, 2, -1, -2, 3 }));
  }
}