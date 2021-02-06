package SlidingWindow.MaxFruitCountOf2Types;

import java.util.*;

class MaxFruitCountOf2Types {
  public static int findLength(char[] arr) {
   
	  int start=0,max=-1;
	  HashMap<Character,Integer> map = new HashMap<Character, Integer>();
	  for(int end =0; end <arr.length;end++)
	  {
		  char ch = arr[end];
		  map.put(ch, map.getOrDefault(ch,0)+1);
		  
		  while(map.size()>2)
		  {
			  ch=arr[start];
			  map.put(ch,map.get(ch)-1);
			  if(map.get(ch)==0)map.remove(ch);
			  start++;
		  }
		  max= Math.max(max, end-start+1);
		  
	  }
	  	  
	  return max;
  }

  public static void main(String[] args) {
    System.out.println("Maximum number of fruits: " + 
                          MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'A', 'C' }));
    System.out.println("Maximum number of fruits: " + 
                          MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'B', 'B', 'C' }));
  }
}