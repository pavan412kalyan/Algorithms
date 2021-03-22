package dynamicProgramming.PalindromicSubsequence;

/*Problem Statement #
Given a string, find the length of its Longest Palindromic Substring (LPS). In a palindromic string, elements read the same backward and forward.

Example 1:

Input: "abdbca"
Output: 3
Explanation: LPS is "bdb".
Example 2:

Input: = "cddpd"
Output: 3
Explanation: LPS is "dpd".*/

class LPS1 {

	  public int findLPSLength(String st) {
	    return findLPSLengthRecursive(st, 0, st.length() - 1);
	  }

	  private int findLPSLengthRecursive(String st, int startIndex, int endIndex) {
		
		  
		  
		  
		  if(startIndex>endIndex)
		  {
			  return 0;
		  }
		  
		  if(startIndex==endIndex)
		  {
			  
			  return 1;
			  
			  
		  }
		  
		  
		  
		  if(st.charAt(startIndex)==st.charAt(endIndex))
		  {
			  
			  int remainLength = endIndex-startIndex + 1 -2; // since it is substring , if start and end are equal , then LPS should be of length remai

			  if(remainLength == findLPSLengthRecursive(st, startIndex+1, endIndex-1))
			  {
				  
				 return remainLength + 2;
				  
			  }
			      
		  }
		  
		  
		  int count1 = findLPSLengthRecursive(st, startIndex+1, endIndex);
		  int count2 = findLPSLengthRecursive(st, startIndex, endIndex-1);

		  	  
		  return Math.max(count1,count2);
	   
		
	  }

	  public static void main(String[] args) {
	    LPS1 lps = new LPS1();
	    System.out.println(lps.findLPSLength("abdbca"));
	    System.out.println(lps.findLPSLength("cddpd"));
	    System.out.println(lps.findLPSLength("pqr"));
	  }
	}