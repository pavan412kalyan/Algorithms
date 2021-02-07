package Random;

public class HarvestProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int arr[] = new int[] {1,5,1,3,7,-3};
		int arr[] = new int[] { -68 ,-79, 9, 99, 84, 92, -67 ,-78};

		int k=2;
		
		
		int left=0,right=0;
		int max = Integer.MIN_VALUE;
		int n=arr.length;
		for(int i=0; i<k;i++)
		{
			left+=arr[i];
			right+=arr[n/2+i];
			
			
		}
		
		max=Math.max(left +right,max);
		System.out.println(left+" "+right);
		
		
		for(int i=1;i<=n/2;i++)
		{
			
			left= left-arr[i-1]+arr[i+k-1];
			right=right-arr[n/2+i-1]+arr[(n/2+i-1 +k)%n];
			
			System.out.println(left+" ----"+right);

			max=Math.max(left +right,max);

			
			
		}
		
		System.out.println(max);
		
		
		
		
		
	}

}
