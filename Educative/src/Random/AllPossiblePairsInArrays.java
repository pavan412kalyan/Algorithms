package Random;

import java.util.Arrays;
import java.util.*;

public class AllPossiblePairsInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] A = new int[] {2,3,5,9};
		int[] B = new int[] {3,4,5,3};
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		
		for(int i=0;i<A.length;i++)
		{    A[i]=A[i]*A[i];
		    B[i]=B[i]*B[i];
		}
		
	  int L =25,R=50,Lindex,Rindex;	
	  int x,y;
		
		for(int i=0;i<A.length;i++)
		{
			if( A[i]>R ||B[i]>R )
		            continue;
			
			Lindex = Arrays.binarySearch(B,L-A[i]);  //all  elements greater than Lindex
			Rindex = Arrays.binarySearch(B,R-A[i]);  //all elements less than Rindex
			
			
		if(Math.abs(Lindex)> Math.abs(Rindex))
			    	continue;
		x=Lindex;
		y=Rindex;
		if(Lindex<0)
		 x=-Lindex+1;
		
		if(Rindex<0)
		 y=-Rindex-1;

		if(x>y)
		continue;	


			System.out.println(i+"="+Lindex+"<->"+Rindex);
			System.out.println( y-x+1);

			
			
		}
		

	}

}
