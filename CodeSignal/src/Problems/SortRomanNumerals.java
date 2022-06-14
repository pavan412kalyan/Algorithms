package Problems;

import java.util.*;



//sort names with numerals Hacker rank question

public class SortRomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		List<String> names = new ArrayList();
		names.add("A VI");
		//names.add("C II");
	//	names.add("C I");
	//	names.add("A I");

		
		String[][] arr = new String[names.size()][3];
		
		
		convert(arr,names);
		
		Arrays.sort(arr,(a,b)-> a[0].equals(b[0]) ?Integer.parseInt(a[1])-Integer.parseInt(b[1]) : a[0].compareTo(b[0]));
		 
		   for(String[] x : arr)
		System.out.println(Arrays.toString(x));
		
		
		
		
	}
	
  public static String[][]	convert(String[][] arr, List<String> names)
	{
		int k=0;
	    for(String w : names)
	    {   String[] x = w.split(" ");
	    	int i=k++;
	    	arr[i][0]=x[0];
	    	arr[i][1]= romanToInt(x[1])+"";
	    	arr[i][2]=x[1];
	    	
	    	
	    	
	    }
	   
		return arr;		
		
	}
  
  public static int romanToInt(String s) {
		if (s == null || s.length() == 0)
			return -1;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int len = s.length(), result = map.get(s.charAt(len - 1));
		for (int i = len - 2; i >= 0; i--) {
			if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
				result += map.get(s.charAt(i));
			else
				result -= map.get(s.charAt(i));
		}
		return result;
	}
	
	
}
