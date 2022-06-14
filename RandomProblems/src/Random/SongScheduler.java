package Random;

import java.util.*;

public class SongScheduler {
	
	
	private static void solve(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		
      List<int[]> songs = new ArrayList<>();
      int i=0;
      for(int x : arr)
      {
    	  songs.add(new int[] {i++,x});
    	  
      }
      //System.out.println(songs);
      
		Collections.sort(songs,(a,b)->a[1]-b[1]);
		
		int l=0,r=songs.size()-1;
		int tar = k -30;
		int f=-1,s=-1;
		while(l<r)
		{
			if(songs.get(l)[1]+songs.get(r)[1]==tar)
			{
				f=songs.get(l)[0];s=songs.get(r)[0];
			
				while(r>0 && r>l+1 && songs.get(r)[1]==songs.get(r-1)[1])
				{
					
					if(songs.get(r)[0] > songs.get(r-1)[0])
					{
					     s=	songs.get(r-1)[0];
							
					}
					
					r--;
					
				}
				
				
				
				break;
	
				
			}
			else if(songs.get(l)[1]+songs.get(r)[1]<tar)
			{
				l++;
				
			}
			else {
				
				r--;
			}
			
			
			
		}
		
		
		
		System.out.println(f+"--"+s);
		
		
	}
	
	

	public static void main(String[] args) {

		
//		int[]  arr =  { 20,30,50,60,10,40};
		//int[]  arr =  { 20,70,50,60,10,40};
	//	int[]  arr =  { 10,50,70,90,70,70,70,90,70,70};
		int[] arr = {2,7,200,90,100,180,6};
        

		int k = 320;
		
		 solve(arr,k);
		 
		 
		 Scanner sc= new Scanner(System.in);
		 
		 
		 while(sc.hasNextLine())
		 {
			 String x =sc.nextLine();
			 if(x.equals(""))break;
			System.out.println(x); 
			 
			 
		 }
		
		
	}

	

}
