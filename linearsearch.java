

public class linearsearch {

	public static int Linear_Search(int arr[],int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {55,78,24,58,45};
		int target=58;
		
		System.out.println(Linear_Search(arr,target));
	}

}
