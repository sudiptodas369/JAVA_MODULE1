class Example3
{
	static boolean findPrimeNumber(int num)
	{
		int a=1;
		int count=0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				count++;
			}
			a++;
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			boolean isPrimeNumber=findPrimeNumber(i);
			if(isPrimeNumber==true)
			{
				System.out.print(i+" ");
			}
		}
	}
}