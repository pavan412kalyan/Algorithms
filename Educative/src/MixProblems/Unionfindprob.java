package MixProblems;

public class Unionfindprob {
	int[]  size;
	int[]  v;
	
	public Unionfindprob(int n) {
		v = new int[n];
		size =new int[n];
		for(int i=0;i<v.length;i++) {
			v[i]=i;
			size[i]=1;
		   
		 }
	}
	
	
	
	int getCom()
	{ int c=0;
		for(int i=0;i<v.length;i++)
			 if(v[i]==i)
				 c++;

		return c ;
		
	
		
		
	}

	int root(int find)
			{ 
				int i=find;
		      while(v[i]!=i)
		      {
		    	  v[i]=v[v[i]];
		    	  i=v[i];
		       	  
		      }
		      
		    return i;
		
			}
			
	void union(int a, int b)		
	{
		if(!checkroot(a,b))
		{  int ra =root(a);
		   int rb= root(b);
			if(size[ra]>size[rb])
			{
				v[rb]=ra;
				size[rb]+=size[ra];			
				
			}
			else
			{
				v[ra]=rb;
				size[ra]+=size[rb];
			}
				
				
			
		}
		
	}		
			
	boolean checkroot(int p,int q)
	{
		if(root(p)==root(q))
			return true;
		else return false;
	}

	 void show() {
		 
		 for(int i=0;i<v.length;i++)
			 System.out.println(v[i]);
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unionfindprob un= new Unionfindprob(5);	
	  un.union(1,2);	
	  un.union(4,3);	
	  un.union(3,2);
	  un.union(0,3);	



	  un.show();
	  
	  
	  

	}

}
