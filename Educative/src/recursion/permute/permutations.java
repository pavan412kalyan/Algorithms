package recursion.permute;

import java.util.*;

public class permutations {

	static int[] visited ;;
	private static void permute(int[] arr, ArrayList<Integer> res) {
		// TODO Auto-generated method stub
     // System.out.println(Arrays.toString(visited));
		if(res.size()==arr.length)
		{
			System.out.println(res);
			return;
			
		}
		
		
		
		  //for each possible choice
		 for(int i=0;i<arr.length;i++)
		 {
			 
			   if(visited[i]==1) continue;
			 
			 
			 //choose
			 res.add(arr[i]);
			   //remove the ith element for next call 
			 visited[i]=1;
			 
			 //explore
			 permute(arr, res);
			 		 
			 //unchoose
			 res.remove(res.size()-1);
			 visited[i]=0;
			 
		 }
		
		
		
		
	}	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]  arr = new int[] {1,2,3};
		visited = new int[arr.length];
		permute(arr,new ArrayList<Integer>());
		

	}

	

}
