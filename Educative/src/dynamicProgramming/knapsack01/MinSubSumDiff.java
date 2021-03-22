package dynamicProgramming.knapsack01;
/*Problem Statement #
Given a set of positive numbers, partition the set into two subsets with a minimum difference between their subset sums.

Example 1: #
Input: {1, 2, 3, 9}
Output: 3
Explanation: We can partition the given set into two subsets where minimum absolute difference 
between the sum of numbers is '3'. Following are the two subsets: {1, 2, 3} & {9}.*/
public class MinSubSumDiff {

	

	public static void main(String[] args) {
		MinSubSumDiff ps = new MinSubSumDiff();
	    int[] num = {1, 2, 3, 9};
	    System.out.println(ps.canPartition(num));
	    num = new int[]{1, 2, 7, 1, 5};
	    System.out.println(ps.canPartition(num));
	    num = new int[]{1, 3, 100, 4};
	    System.out.println(ps.canPartition(num));
	}

	private int canPartition(int[] num) {
		
		
	
		return check(num,0,0,0);
		
	}

	private int check(int[] num, int sum1, int sum2,int currentIndex) {
		// TODO Auto-generated method stub
		
		if(currentIndex>=num.length)
		{
			return Math.abs(sum1-sum2);
			
		}
		
		//include in set 1
		
		int diff1 =check(num,sum1 + num[currentIndex],sum2,currentIndex+1);
		
			
		//incude in set 2
		int diff2 =check(num,sum1 ,sum2 + num[currentIndex],currentIndex+1);

		
		return Math.min(diff1, diff2);
		
		
		
	
	}

}
