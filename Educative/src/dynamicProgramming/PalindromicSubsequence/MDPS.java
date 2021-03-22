package dynamicProgramming.PalindromicSubsequence;

/*Problem Statement #
Given a string, find the minimum number of characters that we can remove to make it a palindrome.

Example 1:

Input: "abdbca"
Output: 1
Explanation: By removing "c", we get a palindrome "abdba".
Example 2:

Input: = "cddpd"
Output: 2
Explanation: Deleting "cp", we get a palindrome "ddd".*/

//To find min dels for string to find palindromes just longest palind subseq
class MDSP {

	  public int findMinimumDeletions(String st) {
	   
	    return st.length() - findLPSLength(st);
	  }

	  public int findLPSLength(String st) {
		  
		  
		return  lps(st,0,st.length()-1);
	  
	  }

	  private int lps(String st, int start, int end) {
		// TODO Auto-generated method stub
		  
		  if(start > end)
		  {
			  return 0;
			  
		  }
		  
		  if(start==end)
		  {
			
			  return 1;
			  
		  }
		  
		  
		  if(st.charAt(start)==st.charAt(end))
		  {
			  
			  return 2 +  lps(st, start+1, end-1);
			  
		  }
		  
		  //no match
		  
		  int count1 =  lps(st, start+1, end);
		  int count2 = lps(st,start,end-1);
		  
		  
		  
		  
		  
		return 0;
	}

	public static void main(String[] args) {
	    MDSP mdsp = new MDSP();
	    System.out.println(mdsp.findMinimumDeletions("abdbca"));
	    System.out.println(mdsp.findMinimumDeletions("cddpd"));
	    System.out.println(mdsp.findMinimumDeletions("pqr"));
	  }
	}