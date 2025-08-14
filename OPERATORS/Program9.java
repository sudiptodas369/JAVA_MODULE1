class Program9
{
	public static void main(String[] args)
	{
		double principal=100000.0;
		int tenure =2;
		double rate=11.5;
		double simpleInterest = (principal*tenure*rate)/100;
		double totalRepayment=principal+simpleInterest;
		double emi=totalRepayment/(tenure*12);
		System.out.println("Simpleinterest: "+simpleInterest);
		System.out.println("Total Repayment: "+totalRepayment);
		System.out.println("EMI: "+emi);
	}
}