import java.util.Scanner;
class Program4
{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		
		System.out.print("Enter mobile number : ");
		long mobileNumber=scn.nextLong();
		
		System.out.print("Enter Height : ");
		float height=scn.nextFloat();
		
		System.out.print("Enter Marital Status (true/false) : ");
		boolean status=scn.nextBoolean();
		
		System.out.print("Enter String : ");
		boolean str=scn.next();
		
		System.out.println("Contact "+ mobileNumber);
		System.out.println("Height "+ height);
		System.out.println("Married "+ status);
		System.out.println(str);
		
		
		
	}
}