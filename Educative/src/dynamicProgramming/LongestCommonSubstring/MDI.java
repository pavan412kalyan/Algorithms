package dynamicProgramming.LongestCommonSubstring;
/*Problem Statement #
Given strings s1 and s2, we need to transform s1 into s2 by deleting and inserting characters. Write a function to calculate the count of the minimum number of deletion and insertion operations.

Example 1:

Input: s1 = "abc"
       s2 = "fbc"
Output: 1 deletion and 1 insertion.
Explanation: We need to delete {'a'} and insert {'f'} to s1 to transform it into s2.
Example 2:

Input: s1 = "abdca"
       s2 = "cbda"
Output: 2 deletions and 1 insertion.
Explanation: We need to delete {'a', 'c'} and insert {'c'} to s1 to transform it into s2*/
class MDI {

	  public void findMDI(String s1, String s2) {
	    int c1 = findLCSLength(s1, s2,0,0);
	    System.out.println("Minimum deletions needed: " + (s1.length() - c1));
	    System.out.println("Minimum insertions needed: " + (s2.length() - c1));
	  }
	  
	  private int findLCSLength(String s1, String s2, int i1, int i2) {
	  
		  if(s1.length()==i1 || s2.length()==i2)
		  {
			  
			  return 0;
			  
		  }
		  
		  
		  if(s1.charAt(i1)==s2.charAt(i2))
		  {
			  
			  return 1 +findLCSLength(s1, s2, i1+1, i2+1);
			  
		  }	  
		  
		  
		  int count1 =  findLCSLength(s1, s2, i1+1, i2);
		  int count2 =  findLCSLength(s1, s2, i1, i2+1);

		  
		  return Math.max(count1,count2);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  }

	  public static void main(String[] args) {
	    MDI mdi = new MDI();
	    mdi.findMDI("abc", "fbc");
	    mdi.findMDI("abdca", "cbda");
	    mdi.findMDI("passport", "ppsspt");
	  }
	}