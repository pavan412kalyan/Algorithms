package UnboundedKnapsack;

class CoinChange1 {

	  public int countChange(int[] denominations, int total) {
		  
		  Integer[][] memo = new Integer[denominations.length][total+1];
	    return this.countChangeRecursive(denominations, total, 0,memo);
	  }

	  private int countChangeRecursive(int[] denominations, int total, int currentIndex,Integer[][] memo) {
	    
		  
		  
		  
		  if(total==0)
		   return 1;
		  if(total<0 || currentIndex>=denominations.length)
		    return 0;
		  
		  int with =0;
		  int without=0;
		  if(memo[currentIndex][total]==null)
		  {
		  
			  if(total>=denominations[currentIndex])		  
		   with = countChangeRecursive(denominations, total-denominations[currentIndex], currentIndex,memo);
		  		  
		   without = countChangeRecursive(denominations, total, currentIndex+1,memo);
		   
		   memo[currentIndex][total]=with+without;
		  }
		  
		  
		  
		  
		  
		  return memo[currentIndex][total];
	  }

	  public static void main(String[] args) {
	    CoinChange1 cc = new CoinChange1();
	    int[] denominations = { 1,2,3};
	    System.out.println(cc.countChange(denominations,5));
	  }
	}