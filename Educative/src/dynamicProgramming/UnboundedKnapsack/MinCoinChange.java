package dynamicProgramming.UnboundedKnapsack;
/*Given an infinite supply of ‘n’ coin denominations and a total money amount, 
 * we are asked to find the minimum number of coins needed to make up that amount.

Example 1:

Denominations: {1,2,3}
Total amount: 5
Output: 2
Explanation: We need minimum of two coins {2,3} to make a total of '5'
Example 2:

Denominations: {1,2,3}
Total amount: 11
Output: 4
Explanation: We need minimum four coins {2,3,3,3} to make a total of '11'*/
class MinCoinChange {

	  public int countChange(int[] denominations, int total) {
	    int result = this.countChangeRecursive(denominations, total, 0);
	    return (result == Integer.MAX_VALUE ? -1 : result);
	  }

	  private int countChangeRecursive(int[] denominations, int total, int currentIndex) {
	    
		  //base
		  
		  if(total==0)
		  {
			  
			  return 0;
		  }
		  
		  if(denominations.length <= currentIndex)
		  {
			  return Integer.MAX_VALUE;
			  
		  }
		  
		  //include
		  
		  int count1=Integer.MAX_VALUE;
		  if(denominations[currentIndex]<=total)
		  {
		    int x  = countChangeRecursive(denominations, total-denominations[currentIndex], currentIndex);
			  
		       if(x!=Integer.MAX_VALUE)
		       {
		    	   count1=x+1;
		    	   
		       }
		    
		  }
		  
		 int count2 = countChangeRecursive(denominations, total, currentIndex+1);

		  
		  return Math.min(count1, count2);
		  
		  
		  
	  }

	  public static void main(String[] args) {
		  MinCoinChange cc = new MinCoinChange();
	    int[] denominations = {1, 2, 3};
	    System.out.println(cc.countChange(denominations, 5));
	    System.out.println(cc.countChange(denominations, 11));
	    System.out.println(cc.countChange(denominations, 7));
	    denominations = new int[]{3, 5};
	    System.out.println(cc.countChange(denominations, 7));
	  }
	}