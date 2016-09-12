import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input a Whole numerical vaule for x within the function 2x+1");
		int num = keyboard.nextInt();
		System.out.println("The answer is " + (2*num+1));
	
	}
}