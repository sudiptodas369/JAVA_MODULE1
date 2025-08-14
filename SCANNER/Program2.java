import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		System.out.print("Enter value : ");
		int val=scn.nextInt();
		if(val%2==0)
		{
			System.out.println(val +" is even number ");
		}
		else
		{
			System.out.println(val +" is odd number ");
		}
		
	}
}