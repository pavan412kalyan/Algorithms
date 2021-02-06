package TwoPointers;

class DutchFlag {

	  public static void sort(int[] arr) {
	   
		  int l=0,r=arr.length-1;
		  
//		  while(l<arr.length && arr[l]==0)l++;
//		  
//		  while(r>0 && arr[r]==2)r--;

		  
		  int i=0;
		  while(i<=r)
		  {	  
			  if(arr[i]==0 && l<arr.length)
			  {
				  swap(arr,i,l);
				  l++;
				  i++;;
			  }
			  else if(arr[i]==2 && r>0) {
				  
				  swap(arr,i,r);
				    r--;
				  
			  }
			  else 
			  {
				  i++;
			   }
			  
		  
		  }
		  
		  
		  
		  
		  
	  }

	  private static void swap(int[] arr, int x, int  y) {
		// TODO Auto-generated method stub
		  int t = arr[x];
		  arr[x]=arr[y];
		  arr[y]=t;
		  
		
	}

	public static void main(String[] args) {
	    int[] arr = new int[] { 1, 0, 2, 1, 0 };
	    DutchFlag.sort(arr);
	    for (int num : arr)
	      System.out.print(num + " ");
	    System.out.println();

	    arr = new int[] { 2, 2, 0, 1, 2, 0 };
	    DutchFlag.sort(arr);
	    for (int num : arr)
	      System.out.print(num + " ");
	  }
	}