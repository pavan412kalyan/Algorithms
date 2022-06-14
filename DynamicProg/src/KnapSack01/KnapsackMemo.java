package KnapSack01;

import java.util.*;

public class KnapsackMemo {
	 public int solveKnapsack(int[] profits, int[] weights, int capacity) {
		int[][] memo = new int[profits.length][capacity+1];
		for(int[] x : memo)
			Arrays.fill(x, -1);
		 return this.knapsackRecursive(profits, weights, capacity, 0,memo);
		 
	 
	 }
	
	 
	 private int knapsackRecursive(int[] profits, int[] weights, int capacity, int currentIndex,int[][] memo) {
		
		 
		 if(capacity<=0 || currentIndex>=profits.length)
		              return 0;
		 
		 //with and without including currentIndex
		 
		if(memo[currentIndex][capacity]!=-1)
		   return memo[currentIndex][capacity];
		 
		 int withCurrent=0;
		 if(weights[currentIndex]<=capacity)
		 {
			 
			 withCurrent= profits[currentIndex]+ knapsackRecursive(profits,weights,capacity-weights[currentIndex],currentIndex+1,memo);
			 
			 
		 }
		 
		 int withoutCurrent=knapsackRecursive(profits,weights,capacity,currentIndex+1,memo);
		 
		 
		 
		 return memo[currentIndex][capacity]=Math.max(withCurrent,withoutCurrent);
		   
		  }














public static void main(String[] args) {
  KnapsackMemo ks = new KnapsackMemo();
  int[] profits = {1, 6, 10, 16};
  int[] weights = {1, 2, 3, 5};
  int maxProfit = ks.solveKnapsack(profits, weights, 7);
  System.out.println("Total knapsack profit ---> " + maxProfit);
  maxProfit = ks.solveKnapsack(profits, weights, 6);
  System.out.println("Total knapsack profit ---> " + maxProfit);
}


}
