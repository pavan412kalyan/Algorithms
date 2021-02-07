package Patterns;
import java.util.*;

class StringPermutation {
  public static boolean findPermutation(String str, String pattern) {

	  
	//  HashMap<Character,Integer> map = new HashMap();
	  
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
	  
	  //andbsand
	  
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
	  System.out.println(Arrays.toString(map1)); 
	  System.out.println(Arrays.toString(map2));
		  
           if(Arrays.toString(map1).equals(Arrays.toString(map2)))
		            return true;
  
		  

		  map2[s[start]-'a']--;
		  start++;

		  
		  
 
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  return false;
 
  
  
  
  
  
  }

	  public static void main(String[] args) {
	    System.out.println("Permutation exist: " + StringPermutation.findPermutation("oidbcaf", "abc"));
	   System.out.println("Permutation exist: " + StringPermutation.findPermutation("odicf", "dc"));
	 System.out.println("Permutation exist: " + StringPermutation.findPermutation("bcdxabcdy", "bcdyabcdx"));
	  System.out.println("Permutation exist: " + StringPermutation.findPermutation("aaacb", "abc"));
	  }
	
}
