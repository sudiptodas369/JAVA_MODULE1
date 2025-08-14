class Program6
{
	public static void main(String[] args)
	{
		int num=10;
		int i=1;
		System.out.print("Divisors: ");
		while(i<=(num/2))
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}
	}
}