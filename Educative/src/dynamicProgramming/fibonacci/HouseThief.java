package dynamicProgramming.fibonacci;
/*Given a number array representing the wealth of ‘n’ houses, 
 * determine the maximum amount of money the thief can steal without alerting the security system.

Example 1:

Input: {2, 5, 1, 3, 6, 2, 4}
Output: 15
Explanation: The thief should steal from houses 5 + 6 + 4*/


class HouseThief {

	  public int findMaxSteal(int[] wealth) {
	    return findMaxStealRecursive(wealth, 0);
	  }

	  private int findMaxStealRecursive(int[] wealth, int currentIndex) {
	   
		  if(currentIndex > wealth.length -1 ) //crossed 
		  {
			  return 0;
			  
		  }
		  
		  
		  
		  //steal current  and take 2 jumps
		  
		  int amount1 = findMaxStealRecursive(wealth, currentIndex+2) + wealth[currentIndex];
		  
		  
		  //leave current and go next
		  
		  int amount2 = findMaxStealRecursive(wealth, currentIndex+1);

		  
		  
		  return Math.max(amount1,amount2);
		  
		  
	  }

	  public static void main(String[] args) {
	    HouseThief ht = new HouseThief();
	    int[] wealth = {2, 5, 1, 3, 6, 2, 4};
	    System.out.println(ht.findMaxSteal(wealth));
	    wealth = new int[]{2, 10, 14, 8, 1};
	    System.out.println(ht.findMaxSteal(wealth));
	  }
	}
