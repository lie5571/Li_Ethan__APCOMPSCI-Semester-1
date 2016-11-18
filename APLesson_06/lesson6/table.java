import java.util.Scanner;
public class table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		int number = kb.nextInt();
		System.out.println("Please enter your table size: ");
		int table = kb.nextInt();
		
		for(int i = 1; i <= table; i++)
		{
			int output = number*i;
			System.out.println(i + " " + output);
		}
		
	}
}