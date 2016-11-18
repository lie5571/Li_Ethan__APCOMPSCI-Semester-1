import java.util.Scanner;
public class Counting 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the number you want to count up to: ");
		int total = kb.nextInt();
		System.out.println("Please enter the number you want to count by: ");
		int step = kb.nextInt();
		
		for(int i = 0; i <= total; i+=step)
		{
			System.out.print(i + " ");
		}
	}
}