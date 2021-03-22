package dynamicProgramming.LongestCommonSubstring;
/*Problem Statement #
Given two strings ‘s1’ and ‘s2’, find the length of the longest substring which is common in both the strings.

Example 1:

Input: s1 = "abdca"
       s2 = "cbda"
Output: 2
Explanation: The longest common substring is "bd".*/
class LCSubstr {

	  public int findLCSLength(String s1, String s2) {
	      return findLCSLengthRecursive(s1, s2, 0, 0, 0);
	  }

	  private int findLCSLengthRecursive(String s1, String s2, int i1, int i2, int count) {
	   
		  
		  if(i1==s1.length() || i2==s2.length())
		  {
			  
			  return count;
			  
		  }
		  
		  
		  if(s1.charAt(i1)==s2.charAt(i2))
		  {
			  
			  count= findLCSLengthRecursive(s1, s2, i1+1, i2+1, count + 1);
			  
			  
		  }
		  
		  
		int  count2= findLCSLengthRecursive(s1, s2, i1+1, i2, 0 );
		int  count3= findLCSLengthRecursive(s1, s2, i1, i2+1, 0 );

      
		return Math.max(count, Math.max(count2,count3));
		  
		   
		  
		  
	  }

	  public static void main(String[] args) {
	    LCSubstr lCSubstr = new LCSubstr();
	    System.out.println(lCSubstr.findLCSLength("abdca", "cbda"));
	    System.out.println(lCSubstr.findLCSLength("passport", "ppsspt"));
	  }
	}