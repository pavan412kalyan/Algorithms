package MixProblems;
/*Given an array of integers, find the first missing positive integer in linear time and constant space. 
 * In other words, find the lowest positive integer that does not exist in the array. T
 * he array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3. */
public class Missingpositive_DCP {

	public static int missing(int[] nums)
	{
		if(nums.length==0) return 1;
	    for(int i=0;i<nums.length;i++)
	    {
	       while(nums[i]<nums.length && nums[i]!=i && nums[i]>=0 && nums[i]!=nums[nums[i]]) 
	       {
	           int t=nums[nums[i]];
	           nums[nums[i]]=nums[i];
	           nums[i]=t;
	           
	       }  
	        
	        
	        
	    }
	        
	      
	        
	        
	       int i;
	         for( i=1;i<nums.length;i++)
	         { 
	             if(nums[i]!=i)
	                  return i; 
	             //System.out.println(nums[i]);
	        
	          
	          
	         }
	        
	       
	        
	        if(nums[0]==nums.length)
	            return nums[0]+1;
	            
	        
	    return i;    
	}           
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums = new int[] {3,4,-1,1};
		System.out.println(missing(nums));
        
	}
}
