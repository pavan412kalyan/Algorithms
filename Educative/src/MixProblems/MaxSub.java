package MixProblems;

public class MaxSub {
	
	
	public static int maxSum(int arr[],int k)
	{  int sum=0;
		for(int i=0;i<k;i++) {
			
			sum+=arr[i];
			
			
		}
		
		int max =Integer.MIN_VALUE;
		for(int i=k;i<arr.length;i++) {
			
			sum+=arr[i]-arr[i-k];
			max=Math.max(max,sum);
			
				
		}
		
		
		
		
		return max;
		
		
	}
	
	
	public static int minwindow(int arr[],int t)
	{
		int start =0;
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int end=0;end<arr.length;end++)
		{
			sum+= arr[end];
			
			while(sum>=t) {
				
				min=Math.min(min, end-start+1);
				
				sum-=arr[start];
				start++;
				
			}
			
			
			
		}
		
		
		
		
		
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		  int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0 }; 
	        int k = 4; 
	        int n = arr.length; 
	        int target=15;
	        System.out.println(maxSum(arr,k)); 
	        System.out.println(minwindow(arr,target)); 

		
		

	}

}
