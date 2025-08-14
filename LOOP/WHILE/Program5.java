class Program5
{
	public static void main(String[] args)
	{
		int x=1;
		int y=10;
		int sum=0;
		while(x<=y)
		{
			if(x%2==0)
			{
				sum+=x;
			}
			
			x++;
		}
		System.out.println(sum);
	}
}