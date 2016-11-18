import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		int factorial = kb.nextInt();
		int num = 1;
		
		for(int i = 1; i <= factorial; i++)
		{
			num = num * i; 
			System.out.print(num + " ");
		}
	}
}