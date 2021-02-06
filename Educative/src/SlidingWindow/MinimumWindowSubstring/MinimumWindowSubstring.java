package SlidingWindow.MinimumWindowSubstring;

import java.util.*;
//Given a string and a pattern, find the smallest substring in the given string which has all the characters of the given pattern.
class MinimumWindowSubstring {
  public static String findSubstring(String str, String pattern) {
   
	  HashMap<Character,Integer> map = new HashMap<Character, Integer>();
	  List<Integer> resultIndices = new ArrayList<Integer>();
	  for(char ch : pattern.toCharArray()) map.put(ch,map.getOrDefault(ch, 0)+1);
	  
	  int start=0,match=0,L=-1,R=-1,min=999999;
	  
	  for(int end=0;end<str.length();end++)
	  {
		  
		  char ch = str.charAt(end);
		
		  if(map.containsKey(ch))
		  {
			  
			  map.put(ch,map.get(ch)-1);
			  if(map.get(ch)==0) match++;
			  			  
		  }
		  
//		  if(match==map.size()) {
//			  resultIndices.add(start);
//		  }
//		  
		  
		  while(match==map.size())
		  {
			 // System.out.println(match);
			  ch = str.charAt(start);
			  
			  if(map.containsKey(ch)) {
				  
				  if(map.get(ch)==0)
				       match--;
				  map.put(ch,map.get(ch)+1);
				  
			  }
			  
			  if(end-start+1 <min)
			  {L=start;R=end;
			    min=end-start+1;
			  }
			  start++;
			  
			  
		  }
		  
		  
	  }
	  
	  	  	 
	  
	 return L==-1 || R==-1 ?"":str.substring(L,R+1);
  }

  public static void main(String[] args) {
    System.out.println(MinimumWindowSubstring.findSubstring("aabdec", "abc"));
    System.out.println(MinimumWindowSubstring.findSubstring("abdabca", "abc"));
    System.out.println(MinimumWindowSubstring.findSubstring("adcad", "abc"));
    System.out.println(MinimumWindowSubstring.findSubstring("adxycfdfdsad", "ac"));

  }
}