package dynamicProgramming.knapsack01;
/*Given a set of positive numbers (non zero) and a target sum ‘S’. Each number should be assigned either a ‘+’ or ‘-’ sign. We need to find out total ways to assign symbols to make the sum of numbers equal to target ‘S’.

Example 1: #
Input: {1, 1, 2, 3}, S=1
Output: 3
Explanation: The given set has '3' ways to make a sum of '1': {+1-1-2+3} & {-1+1-2+3} & {+1+1+2-3}*/
public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 TargetSum ts = new TargetSum();
		    int[] num = {1, 1, 2, 3};
		    System.out.println(ts.findTargetSubsets(num, 1));
		    num = new int[]{1, 2, 7, 1};
		    System.out.println(ts.findTargetSubsets(num, 9));
		
		
		
	}

	private int findTargetSubsets(int[] num, int sum) {
		// TODO Auto-generated method stub
		
		   int c = check(num,0,sum);

		return c;
	}

	private int check(int[] num, int currentIndex, int sum) {
		// TODO Auto-generated method stub
		
		if(currentIndex==num.length && sum==0)
		{
			return 1;
			
		}
		
		if(currentIndex>=num.length)
		{
			return 0;
			
		}
		
	
			
		
		int count1 = check(num,currentIndex+1,sum + num[currentIndex]);
		
		int count2 = check(num,currentIndex+1,sum - num[currentIndex]);

		
		
	
		return count1 + count2;
	}

}
