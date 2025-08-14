class WithoutCornerSum
{
	public static void main(String[] args)
	{
		int[] arr={12,14,10,17,15,14};
		int sum=0;
		for(int i=1;i<arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum :"+sum);
	}
}