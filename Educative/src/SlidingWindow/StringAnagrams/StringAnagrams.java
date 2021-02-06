package SlidingWindow.StringAnagrams;

import java.util.*;
//Given a string and a pattern, find all anagrams of the pattern in the given string.


class StringAnagrams {
  public static List<Integer> findStringAnagrams(String str, String pattern) {
    
	  HashMap<Character,Integer> map = new HashMap<Character, Integer>();
	  List<Integer> resultIndices = new ArrayList<Integer>();
	  for(char ch : pattern.toCharArray()) map.put(ch,map.getOrDefault(ch, 0)+1);
	  
	  int start=0,match=0;
	  
	  for(int end=0;end<str.length();end++)
	  {
		  
		  char ch = str.charAt(end);
		
		  if(map.containsKey(ch))
		  {
			  
			  map.put(ch,map.get(ch)-1);
			  if(map.get(ch)==0) match++;
			  			  
		  }
		  
		  if(match==map.size()) {
			  resultIndices.add(start);
		  }
		  
		  
		  if(end >= pattern.length()-1)
		  {
			  ch = str.charAt(start);
			  
			  if(map.containsKey(ch)) {
				  
				  if(map.get(ch)==0)
				       match--;
				  map.put(ch,map.get(ch)+1);
				  
			  }
			  
			  start++;
			  
			  
		  }
		  
		  
	  }
	  
	  	  	  

    return resultIndices;
  }

  public static void main(String[] args) {
    System.out.println(StringAnagrams.findStringAnagrams("ppqp", "pq"));
    System.out.println(StringAnagrams.findStringAnagrams("abbcabc", "abc"));
  }
}