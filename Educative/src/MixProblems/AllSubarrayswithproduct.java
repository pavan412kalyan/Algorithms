package MixProblems;

import java.util.Scanner;

public class AllSubarrayswithproduct {
    public int problem(int[] nums, int k) {
   
      
        
        int start=0;
        int product=1;
          int count=0;  
            for(int end=0;end<nums.length;end++)
            {
                
                product=product*nums[end];
            
                
                if(product<k)
                {
                  // System.out.println(product); 
                   count++; 
                    
                } 
                else{
                    
                    start++;
                    product=nums[start];
                    if(product<k)count++;
                   // System.out.println(product);
                    end=start;
                    
                    
                }
                if(start==nums.length-1)
                    break;
                
                if(end==nums.length-1)
                {  start++;
                   product=nums[start];
                    if(product<k)count++;

                    end=start;
                 
                }
                    
            
            }
        
        
        
        
        return count;
        
        
        
        

        
        
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllSubarrayswithproduct pro = new AllSubarrayswithproduct();
		Scanner sc = new Scanner(System.in);
		
		

	}

}
