package recursion.diceSum;

import java.util.ArrayList;

public class DiceSum {

	
	static int calls=0;
	private static void diceSumHelper(int d, ArrayList<Integer> res, int sum) {
		// TODO Auto-generated method stub
		calls++;
	
		if(!(sum>=d*1 && sum<=d*6))
		       return ;
		
		
		//base case 
		if(d==0)
		{
			if(sum==0)
			System.out.println(res);
			
		}
		
		else {
			
			// all possible vaue for 1 die
			for(int i=1;i<=6;i++)
			{
				//choose i
				res.add(i);
				
				//explore
				diceSumHelper(d-1, res, sum-i);
				
				//unchoose i
				res.remove(res.size()-1);
			
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
		
	
	private static void dicesum(int d, int desiredSum) {
		// TODO Auto-generated method stub
		
		diceSumHelper(d,new ArrayList<Integer>(),desiredSum);
		
		
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dice =3;
		int desiredSum=7;
				
		dicesum(3,desiredSum);
		
		System.out.println(calls);
	}



}
