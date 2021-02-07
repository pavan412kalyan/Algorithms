package MixProblems;

import java.util.HashMap;
import java.util.HashSet;

public class Longestsubwithkdis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x=LKS("kkkakbbbklm",2);
		System.out.println(x);

	}
	
	
	
	private static int LKS(String s, int k) {
		// TODO Auto-generated method stub
		int start=0;
		HashMap<Character,Integer> hash = new HashMap<>();
		
		int max=Integer.MIN_VALUE;
		for(int end=0;end<s.length();end++)
		
		{
			if(hash.containsKey(s.charAt(end)))
				hash.put(s.charAt(end),hash.get(s.charAt(end))+1);
				else
					hash.put(s.charAt(end),1);

				
			
			
				while(hash.size()>k)
				{
					//System.out.println(start);
                           
						hash.replace(s.charAt(start), hash.get(s.charAt(start))-1);				
                           
                
					  if(hash.get(s.charAt(start))==0)
					   {
						hash.remove(s.charAt(start));
						//break;
					   }
											
					start++;
					
				}
				
				

			
			max=Math.max(max,end-start+1);
				
			
			
		}
		
		
		
		
		
		return max;
		
	}



	
	
	
	
	
	

}
