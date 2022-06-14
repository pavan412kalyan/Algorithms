package PartitionSet;

import java.util.*;

class SubsetSum {

	  public int countSubsets(int[] num, int sum) {
		  
		int totalsum =0;
		
		for(int x : num)
		    totalsum+=x;
	  Integer[][] dp = new Integer[num.length][totalsum+1];	  
	    return this.countSubsetsRecursive(num, sum, 0,dp);
	  }

	  private int countSubsetsRecursive(int[] num, int sum, int currentIndex,Integer[][] dp) {
	   
		  if(sum==0)
		    return 1;
		  if(currentIndex>=num.length || sum<=0)
		      return 0;
		 if(dp[currentIndex][sum]==null) 
		 {
			  int with =0;
	  		 if(num[currentIndex]<=sum)   // add only if cur num is less than sum
			 	 with = countSubsetsRecursive(num,sum-num[currentIndex],currentIndex+1,dp);
			 	int without = countSubsetsRecursive(num, sum, currentIndex+1,dp);
		  
		 dp[currentIndex][sum]=with+without;
		 }
		  
		  
		  return dp[currentIndex][sum];
	  }
	  
	  
	  
	  
	  void countsubsetswithSum(int start, List<Integer> res,int[] nums,int cursum)
	  {
		  
		    System.out.println(res +"sum="+cursum);
		  
		        
		    if(res.size()>=nums.length)
		        return;
		  
		  
		  for(int i=start;i<nums.length;i++)
		  {
			  res.add(nums[i]);
			  
			  countsubsetswithSum(i+1, res,nums,cursum+nums[i]);
			  
			  res.remove(res.size()-1);
			  
			  
			  
			  
		  }
		  
		  
		  
		  
	  }
	  
	  
	  
	  
	  

	  public static void main(String[] args) {
	    SubsetSum ss = new SubsetSum();
	    int[] num = {1, 1, 2, 3};
	    System.out.println(ss.countSubsets(num, 4));
	    num = new int[]{1, 2, 7, 1, 5};
	    System.out.println(ss.countSubsets(num, 9));
	    
	   // ss.countsubsetswithSum(0, new ArrayList<Integer>(), num, 0);
	  }
	}