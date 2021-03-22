package dynamicProgramming.knapsack01;
/*Input: {1, 2, 3, 4}
Output: True
Explanation: The given set can be partitioned into two subsets with equal sum: {1, 4} & {2, 3}*/


//USE boolean array for DP memo
class PartitionSet {

	  public boolean canPartition(int[] num) {
	    
		  int sum=0;
		  
		  for(int i=0;i<num.length;i++)
		  {
			  sum+=num[i];
			  
			  
		  }
		  
		  if(sum%2==1)
		     return false;
		  
		  return   canPartitionRecursive(num,sum,0);
		  
		  
	  }

	  private boolean canPartitionRecursive(int[] num, int sum, int currentIndex) {
	   
		  
		  if(sum==0)
		  {
			  return true;
			  
		  }
		  
		  
		  
		  if(currentIndex==num.length || currentIndex >= num.length)
		  {
			  return false;
			  
		  }
		  
		 
		  
		  
		  //include  
		  
		  boolean res1 =false ;
         if(num[currentIndex]<=sum)
		  res1=canPartitionRecursive(num,sum-num[currentIndex],currentIndex+1);
		 
		  if(res1) return true;
				  
				    
		  //donot include
		  
		  boolean res2 =canPartitionRecursive(num,sum,currentIndex+1);

		 		  
		  return res2;
		  
		  
		  

		  
	  }

	  public static void main(String[] args) {
	    PartitionSet ps = new PartitionSet();
	    int[] num = {1, 2, 3, 4};
	    System.out.println(ps.canPartition(num));
	    num = new int[]{1, 1, 3, 4, 7};
	    System.out.println(ps.canPartition(num));
	    num = new int[]{2, 3, 4, 6};
	    System.out.println(ps.canPartition(num));
	  }
	}