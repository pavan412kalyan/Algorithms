package dynamicProgramming.UnboundedKnapsack;
/*Introduction #
Given an infinite supply of ‘n’ coin denominations and a total money amount, we are asked to find the total number of distinct ways to make up that amount.

Example:

Denominations: {1,2,3}
Total amount: 5
Output: 5
Explanation: There are five ways to make the change for '5', here are those ways:
  1. {1,1,1,1,1} 
  2. {1,1,1,2} 
  3. {1,2,2}
  4. {1,1,3}
  5. {2,3}*
  
time comp  --  2^(C+T)
  */


class CoinChange {

	  public int countChange(int[] denominations, int total) {
	    return this.countChangeRecursive(denominations, total, 0);
	  }

	  private int countChangeRecursive(int[] denominations, int total, int currentIndex) {
	    
		  
		  //base case
		  if(total==0)
		  {
			  return 1;
			  
		  }
		  if(currentIndex==denominations.length)
		  {
			  return 0;
			  
		  }
		  
		 
		  //include  and do not move to next
		  int count1=0;
		  if(denominations[currentIndex] <=total)
		  {
			  
			  count1 = countChangeRecursive(denominations, total-denominations[currentIndex], currentIndex);
			  
		  }
		  
		  int count2 = countChangeRecursive(denominations, total, currentIndex + 1 );
		  
		  
		  return count1 + count2;
		  
	  }

	  public static void main(String[] args) {
	    CoinChange cc = new CoinChange();
	    int[] denominations = {1, 2, 3};
	    System.out.println(cc.countChange(denominations, 5));
	  }
	}
