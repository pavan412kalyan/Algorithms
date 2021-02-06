package TwoPointers.QuadrupleSumToTarget;

import java.util.*;
/*Given an array of unsorted numbers and a target number, find all unique quadruplets in it, whose sum is equal to the target number.
 * Input: [4, 1, 2, -1, 1, -3], target=1
Output: [-3, -1, 1, 4], [-3, 1, 1, 2]
Explanation: Both the quadruplets add up to the target.
 * 
 * 
 * */
class QuadrupleSumToTarget {

  public static List<List<Integer>> searchQuadruplets(int[] arr, int target) {
    Arrays.parallelSort(arr);
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    
    System.out.println(Arrays.toString(arr));
	for(int end=0; end<arr.length;end++)  
	{
		
		if(end >0 && arr[end]==arr[end-1])
		     continue;     
		System.out.println("..."+arr[end]);
		
		int tar = target -arr[end];
		threeSum(arr,tar,end,end+1,arr.length-1,ans);
		
	
	}
	
	return ans;
	  
  }
  
  

private static void threeSum(int[] arr, int tar, int i, int l, int r, List<List<Integer>> ans) {
	// TODO Auto-generated method stub
	
	for(int k=l;k<r;k++)
	{
		int L =k+1,R=r;
		int t = tar - arr[k];
		
		if(k>l && arr[k]==arr[k-1]) continue;
		
		while(L<R)
		{
			
			if(arr[L]+arr[R]==t)
			{
				ans.add(new ArrayList<Integer>(Arrays.asList(arr[i],arr[k],arr[L],arr[R])));
				L++;
				R--;
				while(L<arr.length && arr[L]==arr[L-1])L++;
				
				while(R>=0 && arr[R]==arr[R+1])R--;

				
				
				
			}
			else if(arr[L]+arr[R]<t)L++;
			else R--;
			
			
		}
		
	
	}
	
}




public static void main(String[] args) {
//    System.out.println(QuadrupleSumToTarget.searchQuadruplets(new int[] { 4,4, 1, 2, -1, 1, -3 }, 1));
//    System.out.println(QuadrupleSumToTarget.searchQuadruplets(new int[] { 2, 0, -1, 1, -2, 2 }, 2));
    System.out.println(QuadrupleSumToTarget.searchQuadruplets(new int[] { 1,0,-1,0,-2,2,2,-4}, 0));

    
  }
}