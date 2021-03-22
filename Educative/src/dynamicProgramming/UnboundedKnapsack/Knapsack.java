package dynamicProgramming.UnboundedKnapsack;
/*Introduction #
Given the weights and profits of ‘N’ items, we are asked to put these items in a knapsack which has a capacity ‘C’. 
The goal is to get the maximum profit from the items in the knapsack. The only difference between the 0/1 Knapsack problem and this problem is that we are allowed to use an unlimited quantity of an item.

Let’s take the example of Merry, who wants to carry some fruits in the knapsack to get maximum profit. 
Here are the weights and profits of the fruits:

Items: { Apple, Orange, Melon }
Weights: { 1, 2, 3 }
Profits: { 15, 20, 50 }
Knapsack capacity: 5*/
class Knapsack {

	  public int solveKnapsack(int[] profits, int[] weights, int capacity) {
	    return this.knapsackRecursive(profits, weights, capacity, 0);
	  }

	  private int knapsackRecursive(int[] profits, int[] weights, int capacity, int currentIndex) {
	   
		  if(capacity<=0)
		  {
			  return 0;
			  
		  }
		  
		  if(currentIndex==profits.length)
		  {
			  return 0;
			  
		  }
		  
		  
		 
		  //include and donot move to next index - it can be repeated
		  int profit1=0;
		  if(weights[currentIndex]<=capacity)
		  profit1 = profits[currentIndex]+ knapsackRecursive(profits,weights,capacity-weights[currentIndex],currentIndex);
		  
		  //do not include
		   int  profit2 =knapsackRecursive(profits,weights,capacity,currentIndex+1);

		  
		  
		  
		  return Math.max(profit1, profit2);
		  
		  
	  }

	  public static void main(String[] args) {
	    Knapsack ks = new Knapsack();
	    int[] profits = { 15, 50, 60, 90 };
	    int[] weights = { 1, 3, 4, 5 };
	    int maxProfit = ks.solveKnapsack(profits, weights, 8);
	    System.out.println(maxProfit);
	  }
	}