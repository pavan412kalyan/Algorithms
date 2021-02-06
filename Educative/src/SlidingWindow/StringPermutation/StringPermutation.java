package SlidingWindow.StringPermutation;
//Given a string and a pattern, find out if the string contains any permutation of the pattern.
import java.util.*;

class StringPermutation {
  public static boolean findPermutation(String str, String pattern) {
    
    
	  HashMap<Character,Integer> map = new HashMap<Character, Integer>();
	  
	  for(char ch : pattern.toCharArray())map.put(ch,map.getOrDefault(ch, 0)+1);
	  
	  
	  int start=0,match=0;
	  int n = str.length();
	  for(int end =0;end <n;end++)
	  {
		  
		  char ch=str.charAt(end);
		  if(map.containsKey(ch))
		  {
			  map.put(ch, map.get(ch)-1);
			  if(map.get(ch)==0)match++;
			  
		  }
		  
		  System.out.println(map.toString() +"--matches"+ match);
		  if(match==map.size())
			  return true;
		  
		  
		  if(end>=pattern.length()-1)
		  {
			  ch=str.charAt(start);
			  if(map.containsKey(ch))
			  {
				  if(map.get(ch)==0)match--;
				  map.put(ch, map.get(ch)+1);
				  
			  }
			  
			  start++;
			  
		  }
		  
		   
	  }
	  
	   

    return false;
  }

  public static void main(String[] args) {
//    System.out.println("Permutation exist: " + StringPermutation.findPermutation("oidbcaf", "abc"));
//    System.out.println("Permutation exist: " + StringPermutation.findPermutation("odicf", "dc"));
//    System.out.println("Permutation exist: " + StringPermutation.findPermutation("bcdxabcdy", "bcdyabcdx"));
   // System.out.println("Permutation exist: " + StringPermutation.findPermutation("aaacb", "abc"));
    System.out.println("Permutation exist: " + StringPermutation.findPermutation("aabcc", "abc"));

  }
}
