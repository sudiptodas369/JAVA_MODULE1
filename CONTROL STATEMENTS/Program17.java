class Program17
{
	public static void main(String[] args)
	{
		double accBal=10000.0;
		int amt=13;
		if(amt<=accBal)
		{
			if(amt%100 ==0)
			{
				System.out.println("Withdramtwamtl Success");
			}
			else
			{
				System.out.println("Invalid Denomination");
			}
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}