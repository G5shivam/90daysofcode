public class Reversestring {

	public static void Reverse(int arr[],int n) 
	{
		int j,a;
		
		 for(j=0;j<n/2;j++)
		 {
			
			a=arr[j];
				arr[j]=arr[n-1-j];
				arr[n-1-j]=a;
			}
			
 }
	
	public static void main(String[] args)
	{
	
		int arr[]= {35,89,13,45,39};
		int n= 5;
		Reverse(arr,n);
		
		for(int j=0;j<n;j++)
		{
		
		System.out.println(arr[j]);
		}
		
	}
	
	
}