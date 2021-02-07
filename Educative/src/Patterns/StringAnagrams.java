/* Write a function to return a list of starting indices of the anagrams of the pattern in the given string.

Example 1:

Input: String="ppqp", Pattern="pq"
Output: [1, 2]
Explanation: The two anagrams of the pattern in the given string are "pq" and "qp".*/




package Patterns;
import java.util.*;

class StringAnagrams {
  public static List<Integer> findStringAnagrams(String str, String pattern) {
    List<Integer> resultIndices = new ArrayList<Integer>();
    // TODO: Write your code here
    

	  int[] map1 = new int[26];
	  
	  for(char c : pattern.toCharArray())
	  {
		//  map.put(c,map.getOrDefault(c, 0)+1 );		
		  map1[c-'a']++;
		  
	  }
	  
	
	  
	  
	  char[] s = str.toCharArray();
	  
	  int start =0;
	 
	 // HashMap<Character,Integer> map2 = new HashMap();
	  int[] map2 = new int[26];
	  
	  
	  
	  int n = pattern.length();
	  for(int end=0;end<str.length();end++)
	  {
		//  System.out.println(s[end]);
		  
		  if(end<pattern.length()-1)
		  {
			 // map2.put(s[end],map.getOrDefault(s[end], 0)+1 );
			  map2[s[end]-'a']++;


		      continue;
		  }
		  
		  map2[s[end]-'a']++;
//		  System.out.println(Arrays.toString(map1)); 
//		  System.out.println(Arrays.toString(map2));
		  
         if(Arrays.toString(map1).equals(Arrays.toString(map2)))
        	 resultIndices.add(start);

		  

		  map2[s[start]-'a']--;
		  start++;

		 
	  }
	  	  
    return resultIndices;
	  }
  
  public static void main(String[] args) {
	    System.out.println(StringAnagrams.findStringAnagrams("ppqp", "pq"));
	    System.out.println(StringAnagrams.findStringAnagrams("abbcabc", "abc"));
	  }
	}