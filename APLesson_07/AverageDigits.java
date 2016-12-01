import java.util.Scanner;
public class AverageDigits
{
	static int digits = 0;
	static int number;
	static int average = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		number = kb.nextInt();
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + average);
	}
	public static void avDigits()
	{
		int num = number;
		while( num > 0)
		{
			digits += 1;
			average += num % 10;
			num /= 10;
		}
		average = average/digits;
	}
}