package dynamicProgramming.UnboundedKnapsack;
/*We are given a ribbon of length ‘n’ and a set of possible ribbon lengths. 
 * We need to cut the ribbon into the maximum number of pieces that comply with the above-mentioned possible lengths. 
 * Write a method that will return the count of pieces.

Example 1:

n: 5
Ribbon Lengths: {2,3,5}
Output: 2
Explanation: Ribbon pieces will be {2,3}.*/
class CutRibbon {

	  public int countRibbonPieces(int[] ribbonLengths, int total) {
	    int maxPieces = this.countRibbonPiecesRecursive(ribbonLengths, total, 0);
	    return maxPieces == Integer.MIN_VALUE ? -1 : maxPieces;
	  }

	  private int countRibbonPiecesRecursive(int[] ribbonLengths, int total, int currentIndex) {
	   
		  
		  if(total==0)
		  {
			  return 0;
			  
			  
		  }
		  
		  if(currentIndex>=ribbonLengths.length)
		  {
			  return Integer.MIN_VALUE;
			  
		  }
		  
		  //include and donot move to next index
		  int count1 =Integer.MIN_VALUE;
		  if(ribbonLengths[currentIndex]<=total)
		  {
			  int res = countRibbonPiecesRecursive(ribbonLengths, total-ribbonLengths[currentIndex], currentIndex);
			  
			  if(res!=Integer.MIN_VALUE)
			  {
				  
				  count1 = 1 + res;
				  
			  }
			  
		  }
		  
		  int count2 = countRibbonPiecesRecursive(ribbonLengths, total, currentIndex+1);

		  
		  return Math.max(count1, count2);
		  
		  
		  
		  
	  }

	  public static void main(String[] args) {
	    CutRibbon cr = new CutRibbon();
	    int[] ribbonLengths = {2,3,5};
	    System.out.println(cr.countRibbonPieces(ribbonLengths, 5));
	    ribbonLengths = new int[]{2,3};
	    System.out.println(cr.countRibbonPieces(ribbonLengths, 7));
	    ribbonLengths = new int[]{3,5,7};
	    System.out.println(cr.countRibbonPieces(ribbonLengths, 13));
	    ribbonLengths = new int[]{3,5};
	    System.out.println(cr.countRibbonPieces(ribbonLengths, 7));
	  }
	}