package recursion.printBinary;

public class PinaryBrint {

	
	static void print(int n ,String  s)
	{
		  if(n==0) 
		  {
			  System.out.println(s);
			  
		  }
		if(n<0)
		  return;
	  
		  // System.out.print("0");
	   print(n-1, s+"0");
	   
	   //System.out.print("1");
	   print(n-1,s+"1");
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  print(5,"");
		
		
		
		
	}

}
