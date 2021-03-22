package dynamicProgramming.PalindromicSubsequence;

/*Problem Statement #
Given a string, we want to cut it into pieces such that each piece is a palindrome. Write a function to return the minimum number of cuts needed.

Example 1:

Input: "abdbca"
Output: 3
Explanation: Palindrome pieces are "a", "bdb", "c", "a".
Example 2:

Input: = "cddpd"
Output: 2
Explanation: Palindrome pieces are "c", "d", "dpd".*/

class MPP {

	  public int findMPPCuts(String st) {
	    return this.findMPPCutsRecursive(st, 0, st.length()-1);
	  }

	  private int findMPPCutsRecursive(String st, int startIndex, int endIndex) {
	   
		  
		  if(isPal(st,startIndex,endIndex))
		  {
			  return 0;
			  
		  }
		  
		  
		  
		  
		  int minCuts = endIndex-startIndex; //max possible
		  
		  
		  for(int i=startIndex;i<=endIndex;i++)
		  {
			  
			  if(isPal(st,startIndex,i))
			  {
				  
				  
				  minCuts = Math.min(minCuts, 1 + findMPPCutsRecursive(st, i+1, endIndex));
				  
				  
			  }		  
			  
			
			  
			  
		  }
		  
		  return minCuts;
		  
		  
		  
	  }
	  
	  boolean isPal(String st,int l, int r)
	  {
		  
		  while(l<r)
		  {
			  
			if(st.charAt(l++)!=st.charAt(r--))  
			   return false;
		  }	  
		  
		  
		  return true;
		  
		  
	  }

	  public static void main(String[] args) {
	    MPP mpp = new MPP();
	    System.out.println(mpp.findMPPCuts("abdbca"));
	    System.out.println(mpp.findMPPCuts("cdpdd"));
	    System.out.println(mpp.findMPPCuts("pqr"));
	    System.out.println(mpp.findMPPCuts("pp"));
	   }
	}
