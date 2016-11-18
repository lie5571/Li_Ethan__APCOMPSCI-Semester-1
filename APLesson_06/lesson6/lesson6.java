import java.util.Scanner;
public class lesson6
{
	public static void main(String[]args)
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.print(i + " ");
		}
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the number of cookies: ");
		int cookies = kb.nextInt();
		int batch = 1;
		for(int needed = cookies; needed > 0; needed -= 25)
		{
			System.out.println("Cookies Needed: " + needed);
			System.out.println("Batch #: " + batch);
			batch++;
		}
		System.out.println("Order Up!!");
	}
}