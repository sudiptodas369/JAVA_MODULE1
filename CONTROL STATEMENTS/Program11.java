class Program11
{
	public static void main(String[] args)
	{
		double accBal=10000.0;
		int amt=13000;
		if(amt<=accBal){
			System.out.println("Withdrawl Success");
		}
		else{
			System.out.println("Insufficient Balance");
		}
	}
}