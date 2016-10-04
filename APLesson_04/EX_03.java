import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		EX_03 form = new EX_03();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your interest rate: ");
		double r = kb.nextDouble();
		
		System.out.println("Enter your principal: ");
		double p = kb.nextDouble();
		
		System.out.println("Enter the number of times the loan is compounded per year: ");
		double n = kb.nextDouble();
		
		System.out.println("Enter the life of the loan in years: ");
		double t = kb.nextDouble();
		
		System.out.println("Your total monthly payment is " + form.format(r, p, n, t));
	}
	
	public double format(double r, double p, double n, double t)
	{
		return p*(Math.pow(1+r/n, n*t))/(t*12);
	}
}
