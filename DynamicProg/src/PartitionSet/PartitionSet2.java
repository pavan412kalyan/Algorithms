package PartitionSet;

public class PartitionSet2 {
	
	
	 public int canPartition(int[] num) {
		 int sum=0;
		  for(int x : num)
		      sum+=x;
		   Integer[][] dp = new Integer[num.length][sum+1];
		    return this.canPartitionRecursive(num, 0, 0, 0,dp);
		  }

		  private int canPartitionRecursive(int[] num, int currentIndex, int sum1, int sum2,Integer[][] dp) {
			
			  if(currentIndex==num.length)	  
			   return Math.abs(sum1-sum2);
			  
			  if(dp[currentIndex][sum1]==null)
			  
				{
				  int diff1=  canPartitionRecursive(num,currentIndex+1,sum1,sum2+ num[currentIndex],dp);
			  
				   int diff2=  canPartitionRecursive(num,currentIndex+1,sum1+num[currentIndex],sum2,dp);

			 
                       dp[currentIndex][sum1]= Math.min(diff1, diff2); 
			      
				}
			  
			  return dp[currentIndex][sum1];
				
			  
			  
		  }

	 public static void main(String[] args) {
		    PartitionSet2 ps = new PartitionSet2();
		    int[] num = {1, 2, 3, 9};
		    System.out.println(ps.canPartition(num));
		    num = new int[]{1, 2, 7, 1, 5};
		    System.out.println(ps.canPartition(num));
		    num = new int[]{1, 3, 100, 4};
		    System.out.println(ps.canPartition(num));
		  }
		}