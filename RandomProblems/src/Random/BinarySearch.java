package Random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = {1,2,4,7,9,11,20,23};
//		
//		int key =5;
//		System.out.println(Arrays.binarySearch(arr,key));
//		
		
		int[] arr1 = {0,10,9,0,1};
		int[] arr2 = {1,1,1,1,1,1};
		
	
		System.out.println(max(arr1,arr2));
		
		
		
		HashMap<Integer, List<Integer>> map1 = new HashMap<>();
		
		HashMap<Integer, List<Integer>> map2 = new HashMap<>();
		
		
		
	}

	private static int max(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		Arrays.parallelSort(arr1);
		Arrays.parallelSort(arr2);
		
		
		int l=0,r=arr2.length-1;
		
		int tar =7;
		
		int max = 0;
		
		while(l<arr1.length && r>=0)
		{
			int a = arr1[l];
			int b = arr2[r];
			
			if(a+b == tar)
			{
				max = tar;
				break;
				
			}
			else if( a + b < tar)
			{
				if(a+b>max)
					max = a+b;
				
				l++;
			}
			else {
				r--;
			}
			
		}
		
		
		//System.out.println(max);
		
		return max;
		
	}
	
	
	

}
