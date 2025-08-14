class Program8
{
	public static void main(String[] args)
	{
		int [] arr={14,13,11,16,12};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0 || arr[i]%3==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Even sum: "+sum);
	}
}