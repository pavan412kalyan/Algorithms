package Random;

public class hacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int k=10;
		
		
		for(int i=1;i<=(k-1)/2;i++)
		{
			
					
		
		  for(int j=1;j<=k*2-1;j++)	
			{
			  
			  
			  
			 
			  if(j==1 || j== k*2-1)
			  {
				  System.out.print("*");
				  continue;
				  
			  }
			  
			  if(j==k-(i-1))
			  {
				  System.out.print("*");
				  
			  }
			  else if(j==k+i-1)
			  {
				  
				  System.out.print("*");
				  
			  }
			
			  else {
				  System.out.print(" ");
			  }
			  
			  
				
			}
		  System.out.println();
			
				
		}
		
		

		for(int i=1;i<=2*k-1;i++)
		{
	      
			if(i<=(k+1)/2)
			{
				System.out.print("*");
				
			}
			else if(i>=(k+ k/2))
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			
		}
		
		
		

		
		
		
		
		if(k%2==0)
		{
			for(int i=1;i<=2*k-1;i++)
			{
		      
				if(i<=(k+1)/2)
				{
					System.out.print("*");
					
				}
				else if(i>=(k+ k/2))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();

			
			
		}	
		
		


//		
		for(int i=(k-1)/2;i>=1;i--)
		{
						
		
		  for(int j=1;j<=k*2-1;j++)	
			{
			  
			 
			  
			  if(j==1 || j== k*2-1)
			  {
				  System.out.print("*");
				  continue;
				  
			  }
			  
			  if(j==k-(i-1))
			  {
				  System.out.print("*");
				  
			  }
			  else if(j==k+i-1)
			  {
				  
				  System.out.print("*");
				  
			  }
			
			  else {
				  System.out.print(" ");
			  }
			  
			  
				
			}
		  System.out.println();
			
			
			
		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//
//		for(int i=k;i>=1;i--)
//		{
//			
//	
//	       for(int j=1;j<=k*2-1;j++)	
//			{
//			  
//			  if(j==1 || j== k*2-1)
//			  {
//				  System.out.print("*");
//				  continue;
//				  
//			  }
//			  
//			  if(j==k-(i-1))
//			  {
//				  System.out.print("*");
//				  
//			  }
//			  else if(j==k+i-1)
//			  {
//				  
//				  System.out.print("*");
//				  
//			  }
//			
//			  else {
//				  System.out.print(" ");
//			  }
//			  
//			  
//				
//			}
//		  System.out.println();
//			
//			
//			
//		}
//		
//		
		
		
		
		
		
		
		
		
		
		
		
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
