package dynamicProgramming.UnboundedKnapsack;
/*Given a rod of length ‘n’, we are asked to cut the rod and sell the pieces in a way that will maximize the profit. 
 * We are also given the price of every piece of length ‘i’ where ‘1 <= i <= n’.

Example:

Lengths: [1, 2, 3, 4, 5]
Prices: [2, 6, 7, 10, 13]
Rod Length: 5*/
class RodCutting {

	  public int solveRodCutting(int[] lengths, int[] prices, int n) {
	    
		  
	         return  helper(lengths,prices,n,0);	  
	
		  
	  }

	  private int helper(int[] lengths, int[] prices, int n, int currentIndex) {
		// TODO Auto-generated method stub
		  
		  if(currentIndex==prices.length || n<=0)
		  {
			  return 0;
			  
		  }
		  
		  
		  System.out.println(lengths[currentIndex]+"--"+prices[currentIndex]);
		  
		  
		  //include and donot move to next index
		  int profit1=0;
		  if(lengths[currentIndex]<=n)
		  {
			  profit1= prices[currentIndex]+helper(lengths, prices, n-lengths[currentIndex], currentIndex);
			  
		  }
		  System.out.println("+++");

		  //move to next without including current
		  int profit2= helper(lengths, prices, n, currentIndex+1);

		  System.out.println("---");
		  
		return Math.max(profit1,profit2);
	}

	public static void main(String[] args) {
	    RodCutting rc = new RodCutting();
	    int[] lengths = {1, 2, 3, 4, 5};
	    int[] prices = {2, 6, 7, 10, 13};
	    int maxProfit = rc.solveRodCutting(lengths, prices, 5);
	    System.out.println(maxProfit);
	  }
	}
