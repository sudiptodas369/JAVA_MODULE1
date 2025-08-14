class Program8
{
	public static void main(String[] args)
	{
		double price=7300.0;
		double discountPercentage=0.2;
		double totalDiscount=price*discountPercentage;
		price=price-totalDiscount;
		System.out.println("Discounted amount "+totalDiscount);
		System.out.println("Selling price: "+price);
	}
}