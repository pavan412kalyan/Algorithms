package PartitionSet;

public class PartitionSet {

	  public boolean canPartition(int[] num) {
		  int sum = 0;
		    for (int i = 0; i < num.length; i++)
		      sum += num[i];

		    // if 'sum' is a an odd number, we can't have two subsets with equal sum
		    if(sum % 2 != 0)
		      return false;

		    return this.canPartitionRecursive(num, sum/2, 0);
	
	  }
	private boolean canPartitionRecursive(int[] num, int sum, int currentIndex) {
		
		
		if(sum<0 || currentIndex>=num.length)
		         return false;
		if(sum==0)
		 return true;
		
		boolean including =false;
		   if(num[currentIndex]<=sum)
		 including = canPartitionRecursive(num,sum-num[currentIndex],currentIndex+1);
		
		if(including)
		return true;
		
		boolean without = canPartitionRecursive(num,sum,currentIndex+1);

		return  without;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 public static void main(String[] args) {
		    PartitionSet ps = new PartitionSet();
		    int[] num = {1, 2, 3, 4};
		    System.out.println(ps.canPartition(num));
		    num = new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,100};
		    System.out.println(ps.canPartition(num));
		    num = new int[]{2, 3, 4, 6};
		    System.out.println(ps.canPartition(num));
		  }
}
