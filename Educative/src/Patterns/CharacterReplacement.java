package Patterns;

import java.util.HashMap;

/* Problem Statement #
Given a string with lowercase letters only, if you are allowed to replace no more than
 ‘k’ letters with any letter, find the length of the longest substring having the same letters after replacement.

Example 1:

Input: String="", k=2
Output: 5
Explanation: Replace the two 'c' with 'b' to have a longest repeating substring "bbbbb".*/

 
class CharacterReplacement {
	
	  public static int findLength(String str, int k) {
	    // TODO: Write your code here
		  
		  char[] arr = str.toCharArray();
		  
		  int start =0;		  
		  
		  int max =Integer.MIN_VALUE;
		  HashMap<Character,Integer>  count = new HashMap();
		  for(int end =0;end<arr.length;end++)
		  {
			  count.put(arr[end],count.getOrDefault(arr[end], 0)+1);
			  
			 
		
			  
			  
			  
			  
		  }
		  
		  
		  
		  
	  
	    return max;
	    
	    
	      
	    
	  }
	


public static void main(String[] args) {
    System.out.println(CharacterReplacement.findLength("aabccbb", 2));
    System.out.println(CharacterReplacement.findLength("abbcb", 1));
    System.out.println(CharacterReplacement.findLength("abccde", 1));
  }
}