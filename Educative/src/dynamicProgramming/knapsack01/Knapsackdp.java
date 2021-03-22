package dynamicProgramming.knapsack01;

class Knapsackdp {

	  public int solveKnapsack(int[] profits, int[] weights, int capacity) {
	    Integer[][] dp = new Integer[profits.length][capacity + 1];
	    return this.knapsackRecursive(dp, profits, weights, capacity, 0);
	  }

	  private int knapsackRecursive(Integer[][] dp, int[] profits, int[] weights, int capacity,int currentIndex) {

		  if(currentIndex==weights.length || capacity <=0)
		  {
			  
			  return 0;
			  
			  
		  }
		  
		  
		  if(dp[currentIndex][capacity]!=null)
		      return  dp[capacity][currentIndex];
		  
		  //include current 
		  int profit1=0;
		  if(weights[currentIndex]<=capacity)
			  profit1= profits[currentIndex] + knapsackRecursive(dp,profits,weights,capacity-weights[currentIndex],currentIndex+1);
		  //Don't include current
		  
		   int profit2=knapsackRecursive(dp,profits,weights,capacity,currentIndex+1);

		  
		  return dp[currentIndex][capacity]= Math.max(profit1,profit2);
		  
		  
		  
		  
		  
		  
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