package SlidingWindow.NoRepeatSubstring;

import java.util.*;

class NoRepeatSubstring {
  public static int findLength(String str) {
    
	  HashMap<Character,Integer> map = new HashMap<Character,Integer>(); // map to save the index of that character
	  int start =0,max=-1;
	  
	  for(int end=0; end <str.length();end++)
	  {
		 char ch = str.charAt(end);
		 
		 if(map.containsKey(ch))
		 {
			 
			 
			 start = Math.max( map.get(ch)+1, start); // you need to take that is most right side pointer , example  abxb a
			 
			 
		 }
		 
		 map.put(ch,end);
		 
		 
		 max= Math.max(max, end-start+1);
		 
		  
		  
	  }
	  
	  
	  
	  
	  return max;
  }

  public static void main(String[] args) {
    System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("aabccbb"));
    System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abbbb"));
    System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abccde"));
  }
}