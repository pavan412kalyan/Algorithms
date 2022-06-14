package Random;

import java.util.PriorityQueue;

public class Reducearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] inp = new int[] {1,2,3,4};
		
		
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		
		
		for(int x : inp)
		   q.offer(x);
		int ans =0;
		
		while(q.size()>1)
		{
			
			int a = q.poll();
			int b =q.poll();
			
			int c= a+b;
			ans+=c;
			q.offer(c);
			

		}
		
		
		System.out.println(ans);
		
		
		
		
		
		
		
		
		

	}

}
