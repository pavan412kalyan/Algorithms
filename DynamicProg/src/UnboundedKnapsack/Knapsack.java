package UnboundedKnapsack;


/* Given two integer arrays to represent weights and profits of ‘N’ items, we need to find
 *  a subset of these items which will give us maximum profit such that their cumulative weight * 
 *  is not more than a given number ‘C’. We can assume an infinite supply of item quantities;
 *   therefore, each item can be selected multiple times*/
class Knapsack {

	  public int solveKnapsack(int[] profits, int[] weights, int capacity) {
		  
		  Integer[][] memo = new Integer[weights.length][capacity+1];
	    return this.knapsackRecursive(profits, weights, capacity, 0,memo);
	  }

	  private int knapsackRecursive(int[] profits, int[] weights, int capacity, int currentIndex,Integer[][] memo) {
	  
		  
		  //base case
		  if(capacity<=0 || currentIndex>=profits.length)
		    return 0;
		  
		  
		  
		  //
		  
		  int with=0;
		  int without =0;
		  
		  if(memo[currentIndex][capacity]==null)
		
		  {	  
		  if(capacity>=weights[currentIndex])
		   with = profits[currentIndex] + knapsackRecursive(profits, weights, capacity-weights[currentIndex], currentIndex,memo);
		  
		   without = knapsackRecursive(profits, weights, capacity, currentIndex+1,memo);
		    
		   memo[currentIndex][capacity]=Math.max(with,without);
		    
		  } 
		  return memo[currentIndex][capacity];
		  
	  }

	  public static void main(String[] args) {
	    Knapsack ks = new Knapsack();
	    int[] profits = { 15, 50, 60, 90 };
	    int[] weights = { 1, 3, 4, 5 };
	    int maxProfit = ks.solveKnapsack(profits, weights, 8);
	    System.out.println(maxProfit);
	  }
	}
