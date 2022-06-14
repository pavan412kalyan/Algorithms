package Random;

import java.util.*;
import java.util.Stack;

/*-------------------------------------------------------------
------------------------------------------*/

public class MaxDiffernceWithLargestRight {

	public static void main(String[] args) {
		
	int[] arr = new int[] {2,3,10,6,4,8,1};
	int max =-100000;
	Stack<Integer> stack = new Stack();
	int b=0;
	  for(int x : arr)
	  {
		     if(stack.size()==0) {stack.push(x); b=x;}
		  
		     else  if(stack.size()>0 && x > stack.peek())
		     {
		    	   stack.push(x);

		    	max=Math.max(max, x-b); 
		    	 
		     }
		     
		     else {
		    	 
		    	 while(stack.size()>0 && x<stack.peek())
		    	 {
		    		 stack.pop();
		    		 
		    
		    	 }
		    	
		    	 if(stack.size()==0)
		    		   b=x; 
		    	 
		    	     stack.push(x);
			    	max=Math.max(max, x-b); 

		     }
		  
		  
		  
		  
		  
	  }
	  
	  System.out.println("---"+max);
	
	
	
	
	
	
	}

} // end of class -=---------------------------------------
