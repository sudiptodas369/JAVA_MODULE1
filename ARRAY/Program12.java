class Program12
{
	public static void main(String[] args)
	{
		int[] arr={12,14,10,17,15,14};
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println("smallst element in array: "+small);		
	}
}