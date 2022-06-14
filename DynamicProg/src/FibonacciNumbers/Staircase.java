package FibonacciNumbers;
/*Problem Statement #
Given a staircase with ‘n’ steps and an array of ‘n’ numbers representing the
 fee that you have to pay if you take the step. Implement a method to calculate
  the minimum fee required to reach the top of the staircase (beyond the top-most step). 
  At every step, you have an option to take either 1 step, 2 steps, or 3 steps. Y
  ou should assume that you are standing at the first step.

Example 1:

Number of stairs (n) : 6
Fee: {1,2,5,2,1,2}
Output: 3
Explanation: Starting from index '0', we can reach the top through: 0->3->top
The total fee we have to pay will be (1+2).*/
class Staircase {

	  public int findMinFee(int[] fee) {
	   // int dp[] = new int[fee.length];
	    return findMinFeeRecursive( fee, 0);
	  }
	  
	  private int findMinFeeRecursive( int[] fee, int currentIndex) {
	
	    //current choice + min of next choices
		  if(currentIndex>=fee.length)
		      return 0;
		  
		  int choice1 = findMinFeeRecursive(fee,currentIndex+1);
		  int choice2= findMinFeeRecursive(fee,currentIndex+2);
		  int choice3 =findMinFeeRecursive(fee,currentIndex+3);
		  
		  return fee[currentIndex] + Math.min(choice1, Math.min(choice2,choice3));
		  
		  
	
	  }

	  public static void main(String[] args) {
	    Staircase sc = new Staircase();
	    int[] fee = {1,2,5,2,1,2};
	    System.out.println(sc.findMinFee(fee));
	    fee = new int[]{2,3,4,5};
	    System.out.println(sc.findMinFee(fee));
	  }
	}