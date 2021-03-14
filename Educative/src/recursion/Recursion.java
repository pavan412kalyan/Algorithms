package recursion;

import java.util.*;
import java.util.concurrent.TimeUnit;
public class Recursion {

	 
	static boolean isPalindrome(String str)
	{
		System.out.println(str);
		
	    if(str.length()<=1)
		     return true;
		
		char first = str.charAt(0);
		char last = str.charAt(str.length()-1);
//		if(first==last)
//		{
//			return isPalindrome(str.substring(1,str.length()-1));
//			
//			
//		}
         return first==last && isPalindrome(str.substring(1,str.length()-1));
		
		
		//return false;
		
		
		
		
		
	}
	static int index=0;
	
	static int evaluate(char[] exp)
	{
		char ch = exp[index] ;
		if(ch=='(')
		{
		 index++;
		 int left = evaluate(exp);
		 index++;
		 char opr = exp[index];
		 index++;
		 int right = evaluate(exp);
		 index++;//')'
		 if(opr=='+')
		return left + right;
		 else if(opr=='*')
		 	return left*right;
			
			
		}
		
		else if(Character.isDigit(ch))
		{
			
			return   ch-'0';
			
			
		}
		
		
		return 0;
		
			
		
	}
	
	static List<String> ans = new ArrayList();

	static void getbinarydigits(int n)
	{
		
		getbinary(new StringBuilder(),0,n);
		//getbinary(new StringBuilder(),n);
		
	}
	
	static void getbinary(StringBuilder res , int length,int n)
	{
		System.out.println(res+"="+length);

		if(res.length()==n) 
			
		{
			  ans.add(res.toString());

		  System.out.println("return");
			return;

		
		}
		 // ans.add(res.toString());

		
//		
//		for(int i=0;i<=1;i++)
//		{
//		res.append(String.valueOf(i));
//		getbinary(res, length+1,n);
//		res.deleteCharAt(res.length()-1);
//		}
		res.append("0");
		getbinary(res, length+1,n);
		res.deleteCharAt(res.length()-1);
		
		res.append("1");
		getbinary(res, length+1,n);
		res.deleteCharAt(res.length()-1);


		
	}
	static void getbinary(StringBuilder res ,int length)
	{
		System.out.println(res+"="+length);

		if(length==0) 
			
		{
		  ans.add(res.toString());
			return;

		
		}
		
		
		
		res.append("0");
		getbinary(res, length-1);
		res.deleteCharAt(res.length()-1);
		
		res.append("1");
		getbinary(res, length-1);
		res.deleteCharAt(res.length()-1);
		
		
//// 	
//		getbinary(res+"0", length+1,n);
//		getbinary(res+"1", length+1,n);


		
	}
	
	static void ncr(int n,int r,int[] nums)
	{
		List<Integer> res = new ArrayList<Integer>();
		PandC(res,0,n,r,nums);
	}
	static int[] visited;
	
	static List<List<Integer>> pandc = new ArrayList<>();
	static void PandC(List<Integer> res ,int start,int n,int r,int[] nums)
	{
		//visited= new int[n];
		
		System.out.println(res);

		
//		if(res.size()==r)// for nCr-subsets
//			 {
//			System.out.println(res);
//
//			  pandc.add(new ArrayList<>(res));
//			  System.out.println("REturn");
//			   return ;
//			 
//			 
//			 }
		
		
		for(int i=start;i<n;i++)
		{  
	        res.add(nums[i]);
	     PandC(res, i+1,n,r,nums);
		 res.remove((res.size()-1));
		}

		
		
		
	}
	
	
	static List<List<Integer>> DiceAns = new ArrayList<>();
	static void dicesum(int d,int s)
	{
		List<Integer> res = new ArrayList();
		int cursum=0;
		diceseumhelper(d, s,cursum, res);
			
	}
	static int k=0;//calls
	static void diceseumhelper(int d, int target,int cursum,List<Integer> res)
	{
		System.out.println(k++);
		
		
		System.out.println(res);
		if( cursum>target)//optimize
		{
			return ;
		}
	 	if(res.size()==d)
		   {
	 		if(cursum==target)
	 		{
	 		DiceAns.add(new ArrayList(res));
	 		System.out.println(cursum);
//	 		System.out.println("RE");
	 		}
	 		
	 		    return;
		    }
	 	
	 	
		for(int i=1;i<=6;i++)
		{
			res.add(i);
			diceseumhelper(d,target,cursum+i,res);
			res.remove(res.size()-1);			
			
			
		}
		
		
	}
	
	
	static void Nqueens(int size)
	{
		int col=0;
		int[][] board = new int[size][size];
		solvequeens(board,col);
		
		
		//return board;
//		for(int[] x : board)
//		{
//			for(int y : x)
//				System.out.print(y+" ");
//
//			System.out.println();
//			
//		}
	}
	
	
   private static void solvequeens(int[][] board, int col) {
	   
//	   try {
//		TimeUnit.SECONDS.sleep(1);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
 
	   for(int[] x : board)
		{
			for(int y : x)
				System.out.print(y+" ");

			System.out.println();
			
		}
		System.out.println("##########");

	   if(col>=board.length)
		{
			
		   for(int[] x : board)
			{
				for(int y : x)
					System.out.print(y+" ");

				System.out.println();
				
			}
			System.out.println("##########");

			return;
			
		}
		
	   for(int row=0;row<board.length;row++)
	   {
		   if(issafe(row,col,board))
		   {	 		   
			 board[row][col]=1;
			 solvequeens(board,col+1);
			 board[row][col]=0;		   
		   }   
	   }
	   
	   
	}

	private static boolean issafe(int row, int col,int[][] board) {
	// TODO Auto-generated method stub
		int r =board.length,c=board.length;
		for(int i=0;i<board.length;i++)
		{
			if(board[row][i]==1)
			    return false;
			if(board[i][col]==1)
			    return false;
			
			if(row+i <r && row+i>=0 && col+i>=0  && col+i< c && board[i + row][i+col]==1)
			    return false;
			
			if( row-i <r && row-i>=0 && col-i>=0  && col-i<c &&  board[ row-i][col-i]==1)
			    return false;
			
			if( row+i <r && row+i>=0 && col-i>=0  && col-i<c &&  board[ row+i][col-i]==1)
			    return false;
			
			if( row-i <r && row-i>=0 && col+i>=0  && col+i<c &&  board[ row-i][col+i]==1)
			    return false;
			
			
			
			
		}	
		
		
	return true;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print(10);
		//System.out.println(x);
		//String str="DD";
		//System.out.println(str.substring(1,str.length()-1));
		
		//System.out.println(isPalindrome("ABCDDCBA")) ;
		
		//System.out.println('7'-'0');
		
		//char[] exp= "(((2+9)+4)+(3*5))".toCharArray();// when each operation is surrounded by '(' and ')'
	//System.out.println(evaluate(exp)); 
		
		
		//Getting binary
//		getbinarydigits(3);
//		System.out.println(ans);
		
		
	//	NCR- r out of n
//		int[] nums =new int[]{1,2,3,6};
//		ncr(nums.length,3,nums);
//
		System.out.println(pandc);
		
		dicesum(3,3);
		System.out.println(DiceAns);
//		
//	
		
		
		//NQUEENS
		//Nqueens(100);
		
		
		
		
		
		
		
		
	}

}
