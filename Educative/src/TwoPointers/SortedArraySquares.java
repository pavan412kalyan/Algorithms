package TwoPointers;

class SortedArraySquares {

	  public static int[] makeSquares(int[] arr) {
	    
		  int[] ans = new int[arr.length];
		  
		  int l=0,r=arr.length-1;
		  int k=r;
		  while(l<=r)
		  {
			  int ls = arr[l]*arr[l];
			  int rs = arr[r]*arr[r];
			  
			  if(ls<rs)
			  {
				  ans[k--]=rs;r--;
				  
				  
			  }
			  else {ans[k--]=ls;l++;}
			  
			  
			  
		  }
		  
		  
		  
		  
		  return ans;
		  
		  
	  }

	  public static void main(String[] args) {

	    int[] result = SortedArraySquares.makeSquares(new int[] { -2, -1, 0, 3, 3 });
	    for (int num : result)
	      System.out.print(num + " ");
	    System.out.println();

	    result = SortedArraySquares.makeSquares(new int[] { -7,-3,2,3,11});
	    for (int num : result)
	      System.out.print(num + " ");
	    System.out.println();
	  }
	}