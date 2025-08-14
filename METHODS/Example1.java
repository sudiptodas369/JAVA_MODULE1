class Example1
{
	static int square(int n)
	{
		int sq=n*n;
		return sq;
	}
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" square: "+square(i));
		}
	}
}