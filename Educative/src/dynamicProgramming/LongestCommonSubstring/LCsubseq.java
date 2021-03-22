package dynamicProgramming.LongestCommonSubstring;
/*Problem Statement #
Given two strings ‘s1’ and ‘s2’, find the length of the longest subsequence which is common in both the strings.

A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

Example 1:

Input: s1 = "abdca"
       s2 = "cbda"
Output: 3
Explanation: The longest common subsequence is "bda".*/
class LCsubseq {

	  public int findLCSLength(String s1, String s2) {
	      return findLCSLengthRecursive(s1, s2, 0, 0);
	  }

	  private int findLCSLengthRecursive(String s1, String s2, int i1, int i2) {
		
		  if(s1.length()==i1 || s2.length()==i2)
		  {
			  
			  return 0;
			  
		  }
		  
		  
		  if(s1.charAt(i1)==s2.charAt(i2))
		  {
			  
			  return 1 +findLCSLengthRecursive(s1, s2, i1+1, i2+1);
			  
		  }	  
		  
		  
		  int count1 =  findLCSLengthRecursive(s1, s2, i1+1, i2);
		  int count2 =  findLCSLengthRecursive(s1, s2, i1, i2+1);

		  
		  return Math.max(count1,count2);
		  
		  
		  
	    
	  }

	  public static void main(String[] args) {
	    LCsubseq lcs = new LCsubseq();
	    System.out.println(lcs.findLCSLength("abdca", "cbda"));
	    System.out.println(lcs.findLCSLength("passport", "ppsspt"));
	  }
	}