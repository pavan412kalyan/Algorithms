package palindromicSubsequence;

import java.util.*;
//Unique Palindromic substring
class PalindromeSubStringsWithOutDp{
      static HashSet<String> set = new HashSet();

	  public static int findPalindromesInSubString(String s, int l, int r) {
	    int c=0;
	    while(l>=0 && r < s.length())
	    {
	    	if(s.charAt(l)!=s.charAt(r))
	    	{
	    		break;
	    		
	    	}
	    	System.out.println(s.substring(l,r+1));
	    	set.add(s.substring(l,r+1));
	    	l--;r++;
	    	c++;  	
	    	
	    	
	    }
	    	    
		  return c;
		  
		  
		  
		  
		  
	  }

	  public static int findAllPalindromeSubstrings(String input) {
	    
		  int count =0;
		  for(int i=0;i<input.length();i++)
		  {
			  
			  //odd length
			 count+= findPalindromesInSubString(input,i,i);
			  //even length
			 count+=  findPalindromesInSubString(input,i,i+1);	  
		  }
		  return count;
		  
	  }

	  public static void main(String[] args) {
	    String str = "aabaa";
	    int count = findAllPalindromeSubstrings(str);
	    System.out.println("Total palindrome substrings: " + count);
	    
	    System.out.println("size=="+set.size());
	  }
	  
	  
	  
	}  