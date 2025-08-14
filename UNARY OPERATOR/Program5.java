class Program5
{
	public static void main(String[] args)
	{
		int p=25;
		int q=23;
		int r=p-- + q++ + p-- + q++;
		System.out.println(r);
	}
}