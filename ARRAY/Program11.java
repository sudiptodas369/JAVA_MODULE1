class Program11
{
	public static void main(String[] args)
	{
		int[] arr={12,14,10,17,15,14};
		int large=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		System.out.println("Largest element in array: "+large);		
	}
}