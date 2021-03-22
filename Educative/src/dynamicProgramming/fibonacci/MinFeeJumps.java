package dynamicProgramming.fibonacci;

class MinFeeJumps {

	  public int findMinFee(int[] fee) {
	    return findMinFeeRecursive(fee, 0);
	  }
	  
	  private int findMinFeeRecursive(int[] fee, int currentIndex) {
	   
		  if(currentIndex>fee.length-1) //must reach outisde
		  {
			  return  0;
			  
		  }
		  
		
		  
		  //1
		  int cost1 = findMinFeeRecursive(fee, currentIndex+1) + fee[currentIndex]; 
		  
		  //2
		  int cost2 = findMinFeeRecursive(fee, currentIndex+2) + fee[currentIndex]; 
		  
		  //3
		  int cost3 = findMinFeeRecursive(fee, currentIndex+3) + fee[currentIndex]; 


		  return Math.min(cost1, Math.min(cost2, cost3));
		  
		  
	  }

	  public static void main(String[] args) {
		  MinFeeJumps sc = new MinFeeJumps();
	    int[] fee = {1,2,5,2,1,2};
	    System.out.println(sc.findMinFee(fee));
	    fee = new int[]{2,3,4,5};
	    System.out.println(sc.findMinFee(fee));
	  }
	}