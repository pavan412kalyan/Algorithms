package dynamicProgramming.PalindromicSubsequence;
/*Given a string, find the total number of palindromic substrings in it. Please note we need to find the total number of substrings and not subsequences.

Example 1:

Input: "abdbca"
Output: 7
Explanation: Here are the palindromic substrings, "a", "b", "d", "b", "c", "a", "bdb".
Example 2:

Input: = "cddpd"
Output: 7
Explanation: Here are the palindromic substrings, "c", "d", "d", "p", "d", "dd", "dpd".*/
class CPS {

	  public int findCPS(String st) {
	  
		  
		  
		    return findLPSLengthRecursive(st, 0, st.length() - 1);
 
		  
		  
	  }
	  private int findLPSLengthRecursive(String st, int startIndex, int endIndex) {
		return endIndex;
		    
		 
		    
		  
		  
	  }
	  public static void main(String[] args) {
	    CPS cps = new CPS();
	    System.out.println(cps.findCPS("abdbca"));
	    System.out.println(cps.findCPS("cdpdd"));
	    System.out.println(cps.findCPS("pqr"));
	  }
	}