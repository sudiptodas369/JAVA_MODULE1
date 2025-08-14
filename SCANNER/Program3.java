import java.util.Scanner;
class Program3
{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		System.out.print("Enter number1 : ");
		double num1=scn.nextDouble();
		System.out.print("Enter number2 : ");
		double num2=scn.nextDouble();
		double sum=num1+num2;
		System.out.println("Sum :"+sum);
		
	}
}