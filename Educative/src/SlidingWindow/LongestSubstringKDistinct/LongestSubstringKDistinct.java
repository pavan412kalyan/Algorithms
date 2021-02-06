package SlidingWindow.LongestSubstringKDistinct;
//Given a string, find the length of the longest substring in it with no more than K distinct characters.
import java.util.*;

class LongestSubstringKDistinct {
  public static int findLength(String str, int k) {
    
	  int start =0,max=-1;
	  HashMap<Character,Integer> map = new HashMap<Character, Integer>();
	  for(int end  =0; end<str.length();end++)
	  {
		  char ch = str.charAt(end);
		  map.put(ch, map.getOrDefault(ch,0)+1);
		
		   while(map.size()>k)
		   {       ch = str.charAt(start); 
				  map.put(ch, map.get(ch)-1);
				  if(map.get(ch)==0)map.remove(ch);
                       start++;
			   		   
		   }	  
		   
		   max = Math.max(max,end-start+1);

		  
	  }
	   
	  
	  
      return max;


  }

  public static void main(String[] args) 
  {
    System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2));
    System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 1));
    System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("cbbebi", 3));
  }
}