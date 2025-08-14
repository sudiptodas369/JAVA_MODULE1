class Program13
{
	public static void main(String[] args)
	{
		int val=13;
		if(val%2==0 && val%3==0)
		{
			System.out.println("Bangalore");
		}
		else if(val%2==0)
		{
			System.out.println("Chennai");
		}
		else if(val%3==0)
		{
			System.out.println("Hyderbad");
		}
		else
		{
			System.out.println("Cochin");
		}
	}
}