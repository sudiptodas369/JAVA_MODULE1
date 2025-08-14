class Program3
{
	public static void main(String[] args)
	{
		int option=1;
		switch(option)
		{
			case 1: System.out.println("Cash Withdrawal");
			break;
			case 2: System.out.println("Balance Enquiry");
			break;
			case 3: System.out.println("Mini Statement");
			break;
			case 4: System.out.println("PIN Change");
			break;
			default: System.out.println("INVALID Selection");
		}
	}
}