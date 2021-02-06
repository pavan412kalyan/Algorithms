package SlidingWindow.CharacterReplacement;
import java.util.*;
//Given a string with lowercase letters only, if you are allowed to replace no more than ‘k’ 
//letters with any letter, find the length of the longest substring having the same letters after replacement.

/*
 Input: String="aabccbb", k=2
Output: 5
Explanation: Replace the two 'c' with 'b' to have a longest repeating substring "bbbbb".*/



class CharacterReplacement {
  public static int findLength(String str, int k) {
   
	  int ans =-1;
	  HashMap<Character,Integer> map = new HashMap();  	 
	  int max_freq_count=-1,start=0;
	  for(int end=0; end<str.length();end++)
	  {
		  char ch = str.charAt(end);
		  map.put(ch,map.getOrDefault(ch, 0)+1);
		  max_freq_count =Math.max(max_freq_count, map.get(ch));
		  
		  while(end -start+ 1 - max_freq_count > k )
		  {   ch= str.charAt(start);
			  map.put(ch,map.get(ch)-1);
			  start++;
		  }
		  
		  ans=Math.max(ans,end-start+1);
		  
		  
	  }
	  
	  
	  return ans;
	  
	  
	 
  }

  public static void main(String[] args) {
    System.out.println(CharacterReplacement.findLength("aabccbb", 2));
    System.out.println(CharacterReplacement.findLength("abbcb", 1));
    System.out.println(CharacterReplacement.findLength("abccde", 1));
  }
}