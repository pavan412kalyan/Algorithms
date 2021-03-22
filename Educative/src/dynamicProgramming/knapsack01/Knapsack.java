package dynamicProgramming.knapsack01;
/*Items: { Apple, Orange, Banana, Melon }
Weights: { 2, 3, 1, 4 }
Profits: { 4, 5, 3, 7 }
Knapsack capacity: 5

Let’s try to put different combinations of fruits in the knapsack, such that their total weight is not more than 5: */



class Knapsack {

	  public int solveKnapsack(int[] profits, int[] weights, int capacity) {
	    return this.knapsackRecursive(profits, weights, capacity, 0);
	  }

	  private int knapsackRecursive(int[] profits, int[] weights, int capacity, int currentIndex) {
	    
		  if(currentIndex==weights.length || capacity <=0)
		  {
			  
			  return 0;
			  
			  
		  }
		  
		  
		  //include current 
		  int profit1=0;
		  if(weights[currentIndex]<=capacity)
			  profit1= profits[currentIndex] + knapsackRecursive(profits,weights,capacity-weights[currentIndex],currentIndex+1);
		  //Don't include current
		  
		   int profit2=knapsackRecursive(profits,weights,capacity,currentIndex+1);

		  
		  return Math.max(profit1,profit2);
		  
		  
		  
	  }

	  public static void main(String[] args) {
	    Knapsack ks = new Knapsack();
	    int[] profits = {1, 6, 10, 16};
	    int[] weights = {1, 2, 3, 5};
	    int maxProfit = ks.solveKnapsack(profits, weights, 7);
	    System.out.println("Total knapsack profit ---> " + maxProfit);
	    maxProfit = ks.solveKnapsack(profits, weights, 6);
	    System.out.println("Total knapsack profit ---> " + maxProfit);
	  }
	}