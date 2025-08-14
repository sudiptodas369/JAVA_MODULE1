class PerfectNumber
{
	public static void main(String[] args)
	{
		int num=8;
		int i=1;
		int sum=0;
		while(i<=(num/2))
		{
			if(num%i==0)
			{
				sum+=i;
			}
			i++;
		}
		if(sum==num)
		{
			System.out.println(num+" is a perfect number");
		}
		else
		{
			System.out.println(num+" is not a perfect number");
		}
	}
}