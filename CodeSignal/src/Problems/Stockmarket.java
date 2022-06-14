package Problems;

public class Stockmarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=3;
		int[] prices = new int[] {1,2,5,3,3};
		int[] algs = new int[] {0,1,1,0,1};
		
		
   int curpro = 0;
   
   for(int i=0;i<algs.length;i++)
   {
	   
	   if(algs[i]==1)
		 curpro+=prices[i] ;
	   
		   else 
		 curpro-=prices[i] ;

			   
				   
   }
		
   
   for(int i=0;i<k;i++)
   {
	   if(algs[i]==1)
			 curpro-=prices[i] ;
		   
			   else 
			 curpro+=prices[i] ;
 
	   
   }
   
	
		
	}

}
