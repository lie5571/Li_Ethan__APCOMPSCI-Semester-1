import java.util.Scanner; 

public class BMI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How heavy are you in pounds?");
		int weight = keyboard.nextInt();
		
		System.out.println("How tall are you in inches?");
		int height = keyboard.nextInt();
		
		System.out.println("Your BMI is "+ weight*703/(height*height));
	}
}
