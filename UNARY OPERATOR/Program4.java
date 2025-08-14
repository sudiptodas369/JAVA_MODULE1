class Program4
{
	public static void main(String[] args)
	{
		int p=13;
		int q=p++ + p++ + p++;
		System.out.println(q);
		
		int r=17;
		int s=r-- + r-- + r--;
		System.out.println(s);
	}
}