class Program3
{
	public static void main(String[] args)
	{
		int p=10;
		int q=p++ + p++;
		System.out.println(q);
		
		int r=15;
		int s=r-- + r--;
		System.out.println(s);
	}
}