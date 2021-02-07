package Part2;

import java.util.Arrays;

public class SegmentTrees {

	static int[] input = new int[] {1,2,5,6,7,9};
	static int n=input.length;
	static int h =(int) (Math.log(n+1)/Math.log(2));
    static int x = (int) (Math.ceil(Math.log(n) / Math.log(2))); 
    static int max_size = 2 * (int) Math.pow(2, x) - 1; 


	static int[] st = new int[max_size];
	
 static int construct(int[] st, int[] input ,int si,int l, int r)
   {
	  if(l==r)
	  {
		  st[si]=input[l];
		  return st[si];
		  
	  }
	  
	  int mid = (l+r)/2;
	  
	  
	  
	  return st[si] = construct(st,input,2*si+1,l,mid) + construct(st,input,2*si+2,mid+1,r);
	     
	   
   }
 
 
 static int  getSum(int si,int sl, int sr, int l, int r )
 {
	 
	 if(l<=sl && r>=sr ) //full overlap
		 return st[si];
	 
	 if(sr<l || sl>r) //no overlap
		 return 0;
	 
	 int mid =(sl+sr)/2;
	 
	 
	 return getSum(2*si+1,sl,mid,l,r) + getSum(2*si+2,mid+1,sr,l,r); //partial overlap
	 
 }
 
 
 static void update(int si, int sl, int sr, int pos,int diff)
 {
	 if(sl>pos || sr< pos)
	        return;
	 
	 st[si]+=diff;
	 if(sl!=sr)
	 {
		 int mid = (sl+sr)/2;
		 update(2*si+1, sl, mid, pos, diff);
		 update(2*si+2, mid+1, sr, pos, diff);

	 }
	  
 }
 
 static void updatetree(int pos,int newValue)
 {
	 
	 int diff= -input[pos] + newValue;
	  update(0, 0, n-1, pos,diff);
	  input[pos]=newValue;

 }
 
 
 
 
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		construct(st,input,0,0,n-1);
		System.out.println(getSum(0,0,n-1,0,4));
		
		//{1,2,5,6,7,9}
		//1-3=-2
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(st));

	
		int newValue=5;
		int pos=0;
		updatetree(pos,newValue);		
		System.out.println(Arrays.toString(input));

		System.out.println(Arrays.toString(st));

	}

}
