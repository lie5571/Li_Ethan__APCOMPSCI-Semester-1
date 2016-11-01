import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How heavy are you in pounds? ");
		double weight = kb.nextDouble();
		
		System.out.println("How tall are you in inches? ");
		double height = kb.nextDouble();
		
		double BMI = weight*703/(height*height);
		calcHealth(BMI);
		System.out.println("Your BMI is:" + BMI);
		
		
	}
	
	public static void calcHealth(double BMI)
	{
		if(BMI < 18.5)
			System.out.println("You are underweight");
		else if(BMI <=24.9)
			System.out.println("You are normal");
		else if(BMI <= 29.9)
			System.out.println("You are overweight");
		else if(BMI <= 34.9)
			System.out.println("You are obese");
		else if(BMI <= 39.9)
			System.out.println("You are very obese");
		else if(BMI > 39.9)
			System.out.println("You are morbidly obese");
		
		
	}    
}
	