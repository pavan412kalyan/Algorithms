package UnboundedKnapsack;

import java.util.ArrayList;
import java.util.*;

/*Denominations: {1,2,3}
Total amount: 5
Output: 2
Explanation: We need minimum of two coins {2,3} to make a total of '5'
*/
class CoinChange {
	List<Integer> ans = new ArrayList();

	  public int countChange(int[] denominations, int total) {
	    int result = this.countChangeRecursive(denominations, total, 0);

	  return 0;
	  
	  }

	  private int countChangeRecursive(int[] denominations, int total, int currentIndex) {
	    
		  ////////incomplete 
		  if(total==0)
		    return 0;
		  
		  if(currentIndex>=denominations.length || total<0)
		        return Integer.MAX_VALUE;
		  
		  int with=0,without=0;
		  
		  if(denominations[currentIndex]<=total)
		  { 
			  with = countChangeRecursive(denominations, total-denominations[currentIndex], currentIndex);
		      
			  
		  
		  }
		  without = countChangeRecursive(denominations, total,currentIndex+1);
		  
		  
		  
		  return Math.min(with+1,without);
		  
		  
			
	  }

	  public static void main(String[] args) {
	    CoinChange cc = new CoinChange();
	    int[] denominations = {1, 2, 3};
	    System.out.println(cc.countChange(denominations, 5));
	    System.out.println(cc.countChange(denominations, 11));
	    System.out.println(cc.countChange(denominations, 7));
	    denominations = new int[]{3, 5};
	    System.out.println(cc.countChange(denominations, 7));
	  }
	}