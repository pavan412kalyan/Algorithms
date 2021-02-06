package TwoPointers.ShortestWindowSort;
/*Given an array, find the length of the smallest subarray in it which when sorted will sort the whole array.

Example 1:

Input: [1, 2, 5, 3, 7, 10, 9, 12]
Output: 5
Explanation: We need to sort only the subarray [5, 3, 7, 10, 9] to make the whole array sorted*/
class ShortestWindowSort {

	  public static int sort(int[] arr) {
		  
		  
		  
		  return 0;
	    
	  }

	  public static void main(String[] args) {
	    System.out.println(ShortestWindowSort.sort(new int[] { 1, 2, 5, 3, 7, 10, 9, 12 }));
	    System.out.println(ShortestWindowSort.sort(new int[] { 1, 3, 2, 0, -1, 7, 10 }));
	    System.out.println(ShortestWindowSort.sort(new int[] { 1, 2, 3 }));
	    System.out.println(ShortestWindowSort.sort(new int[] { 3, 2, 1 }));
	  }
	}