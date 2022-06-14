package Random;

import java.util.Arrays;

public class RollingString {
	static String keys ="abcdefghijklmnopqrstuvwxyz";
	static StringBuilder ans ;


	public static void main(String[] args) {
		
//		String ip = "abcdeef";
//		String[] operations = new  String[] {"02L","24R","13L"};

		//String ip = "abc";

		
//		int a = 0;
//		int b= 3;
		
		
//		for(int i=a;i<b;i++)
//		{
//		 
//			char c = keys.charAt(ip.charAt(i) -'a'+1);
//			
//			ans.setCharAt(i, c);
//
//		
//			
//		}
		
 
		
		
		
		
		
//          for(String op  : operations )	
//          {
//
//        	 int a= Integer.parseInt(op.charAt(0)+"");
//             int b= Integer.parseInt(op.charAt(1) +"");
//             char c = op.charAt(2);
//           
//     		System.out.println(ans);
// 
//		        roll(a,b,c);
//
//		    
//          }
		
				
		//System.out.println(ans);
		
		
		
		
		//////////////////////////////////// keys ="abcdefghijklmnopqrstuvwxyz";
		
 	//String[] operations = new  String[] {"0 10 L","2 12 L","0 2 R","2 12 L","0 12 R"};
	String[] operations = new  String[] {"2 12 L","1 4 R","1 3 L"};

		String ip = "zbbdfgfdgdfgc";
	//	String ip ="abcdf";
		ans = new StringBuilder(ip);
		//String[] operations = new  String[] {"0 2 L","0 4 R","1 3 L"};



		int[] opr = new int[ip.length()+1];
	     	//System.out.println(ip);
		  // System.out.println(Arrays.toString(opr));

		   for(String op  : operations )	
	          {
                 
			    String[] k = op.split(" ");
			    int a = Integer.parseInt(k[0]);
			    int b = Integer.parseInt(k[1]);
			    String dir = k[2];
			    System.out.println(a+"-"+b);
		        roll(a,b,dir);

			    		
			   
			   
			   
//	        	 int a= Integer.parseInt(op.charAt(0)+"");
//	             int b= Integer.parseInt(op.charAt(1) +"");
//	             char dir = op.charAt(2);
	          // System.out.println(dir);
	     		 if(dir.equals("L"))
	     		 {
	     			System.out.print(dir +" "+ opr[a]);  
	     			
	     			 opr[a]  =opr[a]  -1;
	     			 opr[b+1] = opr[b+1] +1;
	     			 
	     		 }
	     		 else
	     		 {
		     		//	System.out.print(dir);  
		     			System.out.print(dir +" "+ opr[a]);  

		     			 opr[a]  =opr[a]  +1;
		     			 opr[b+1] = opr[b+1] -1;
		     			 
		     			 
		     		 
	 	 
	     		 }
	             
	  		  System.out.println(a+"-"+b + Arrays.toString(opr));

	     		 
			    
	          }
		   
		   
			StringBuilder sb = new StringBuilder();
			int curChanges=0;
			for(int i=0;i<ip.length();i++)
		   {
				curChanges+=opr[i];
				char c= keys.charAt((ip.charAt(i) -'a'+ curChanges + 26)%26);
               
				sb.append(c);
			   
			   
		   }
		
			System.out.println(sb);
		
		
	/////////////////////////////////////////	
		
		
		System.out.println(ans);
		
		
		
	   }
	
	
	
	
	
	
	

	static void roll(int a, int b, String op)
	{

		
		for(int i=a;i<=b;i++)
		{
			char c ;
			
			if(op.equals("R"))
			{

			c= keys.charAt((ans.charAt(i) -'a'+1+26)%26);
			
			}
			else {

				 c = keys.charAt((ans.charAt(i) -'a'-1+26)%26);

				
			}
			
			    ans.setCharAt(i, c);

			
		}
		
		//System.out.println(ans + "="+a+"-"+b);

		
		
	}
	
		
		
}
