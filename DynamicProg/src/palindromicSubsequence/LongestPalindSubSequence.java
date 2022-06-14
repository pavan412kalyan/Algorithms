package palindromicSubsequence;

import java.util.*;

/*A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

Example 1:

Input: "abdbca"
Output: 5
Explanation: LPS is "abdba".*/

class LongestPalindSubSequence {

    int[][] memo;
	  public int findLPSLength(String s) {
		  
		  
		  memo = new int[s.length()][s.length()];
	        for(int[] x :memo)
	        {
	            Arrays.fill(x,-1);
	            
	        }
	    return LPSDP(s, 0, s.length()-1);
	  }

	  private int findLPSLengthRecursive(String st, int startIndex, int endIndex) {
	   
		  
		  // if 1st letter is equal to last then 2  + remaining sequence
		  // else  check other two choices decrement last st letter or increment 1st letter
		  
		  System.out.println(st.substring(startIndex, endIndex+1));
		  
		  if(startIndex==endIndex)
		       return 1;
		  if(startIndex>endIndex)
		        return 0;
		  
		  if(st.charAt(startIndex)==st.charAt(endIndex))
		  {
			  
			  return 2 + findLPSLengthRecursive(st,startIndex+1, endIndex-1);
			  
		  }
		  
		  int choice1 = findLPSLengthRecursive(st,startIndex+1,endIndex);//without start
		  
		  int choice2 =findLPSLengthRecursive(st,startIndex,endIndex-1); //wihtout end  
		  return Math.max(choice1, choice2);
		 
		  
		  
		  
	  }
	  
	  int LPSDP(String st, int start, int end)
	    {
	        if(start==end)
	           return 1;
	        
	        if(start>end)
	          return 0;
	        
	      
	        if(memo[start][end]!=-1)
	        {
	           return memo[start][end];
	            
	        }
	        
	        if(st.charAt(start)==st.charAt(end))
	        {
	            int rem = LPSDP(st,start+1,end-1);
	            memo[start][end]=2+rem;
	            return 2 +rem;
	    
	        }
	       
	        int choice1 = LPSDP(st,start+1,end);
	        int choice2 = LPSDP(st,start,end-1);
	        
	          memo[start][end]=Math.max(choice1,choice2);
	        return memo[start][end];      
	        
	        
	        
	    }

	  public static void main(String[] args) {
	    LongestPalindSubSequence longestPalindSubSequence = new LongestPalindSubSequence();
	    System.out.println(longestPalindSubSequence.findLPSLength("abdbca"));
	    //System.out.println(lps.findLPSLength("cddpd"));
	   // System.out.println(lps.findLPSLength("pqr"));
	  }
	}