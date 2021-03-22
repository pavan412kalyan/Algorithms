package dynamicProgramming.PalindromicSubsequence;
/*Problem Statement #
Given a sequence, find the length of its Longest Palindromic Subsequence (LPS). In a palindromic subsequence, elements read the same backward and forward.

A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

Example 1:

Input: "abdbca"
Output: 5
Explanation: LPS is "abdba".*/
class LPS {

	  public int findLPSLength(String st) {
	    return findLPSLengthRecursive(st, 0, st.length()-1);
	  }

	  private int findLPSLengthRecursive(String st, int startIndex, int endIndex) {
	    
		  if(startIndex>endIndex)
		  {
			  return 0;
			  
		  }
		  
		 // System.out.println(st.substring(startIndex,endIndex));
		  
		  if(startIndex==endIndex)
		  {
			  return 1;
		  }
		  
		  //if match
		  if(st.charAt(startIndex)==st.charAt(endIndex))
		  {
			  return 2 + findLPSLengthRecursive(st, startIndex+1, endIndex-1);
			  
		  }
		  
		  //if no match		  
		  int len1 = findLPSLengthRecursive(st,startIndex+1,endIndex);
		  
		  int len2 = findLPSLengthRecursive(st, startIndex, endIndex-1);
		  
		  
		  return Math.max(len1, len2);
		  
		    
		  
		  
	  }

	  public static void main(String[] args) {
	    LPS lps = new LPS();
	    System.out.println(lps.findLPSLength("abdbca"));
	    System.out.println(lps.findLPSLength("cddpd"));
	    System.out.println(lps.findLPSLength("pqr"));
	  }
	}