package Graphs.UnionFind;


import java.util.*;

public class Unionfind {
	
	static int[] parent;
	static int[] size;

	public Unionfind(int n) {
		// TODO Auto-generated constructor stub
		parent = new int[n];
		size = new int[n];
		Arrays.fill(size, 1);
		for(int i=0;i<n;i++)
		   parent[i]=i;
	}
	
	static int root(int find)
	{
		int i=find;
		
		while(parent[i]!=i)
		{		
			parent[i]=parent[parent[i]];
			i=parent[i];

				
		}
			
		return i;
	}
	
	
	private void union(int a, int b) {
		// TODO Auto-generated method stub
		
		if(check(a,b)) // if roots are equal 
		    return;
		
				
		if(size[a] > size[b])
		{
		    parent[b]=a;
			size[b]+=size[a];
			
		}
		else {
			parent[a]=b;
			size[a]+=size[b];
			
		}
		
		
	}
	
	
	 static int getMaxGroup()
	 {
		 // Retrive max size of group
		 int max=-1;
		 HashMap<Integer,Integer> map = new HashMap();
		 
		 //each independent component has common root. calculate its freq
		 
		 for(int i=0;i<parent.length;i++)
		 {
			 int root = root(i);
			 map.put(root,map.getOrDefault(root, 0)+1);
			 max=Math.max(max,map.get(root));
			 
			 
		 }
		return max;
	 }
	

	private boolean check(int a, int b) {
		// TODO Auto-generated method stub
		if(root(a)==root(b))
		     return true;
		return false;
	}
	
	
	private void show() {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(parent));
		System.out.println(getMaxGroup());
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unionfind un= new Unionfind(5);	
	  un.union(1,2);	
	  un.union(4,3);	
	  un.union(3,2);
	  un.union(0,3);	

      

	   un.show();
	  
	  
	  
	  

	}

	
	

}
