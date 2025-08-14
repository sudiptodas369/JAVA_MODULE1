class PrimeNumber
{
	public static void main(String[] args)
	{
		int num=15;
		int i=1;
		int count=0;
		while(i<=(num/2))
		{
			if(num%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==1)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
	}
}