import java.util.Scanner;

public class EX_04
{
	public static void main(String[]args)
	{
		EX_04 form = new EX_04();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the height in inches: ");
		double h = kb.nextDouble();
		
		System.out.println("Enter the length in inches: "):
		double l = kb.nextDouble();
		
		System.out.println("Enter the width in inches: ");
		double w = kb.nextDouble();
		
		System.out.printf("Your volume in cubic feet is %.5f" , form.volume(h,l,w));
	}
	
	public double volume
	{
		h=h/12;
		l=l/12;
		w=w/12;
		return (h*l*w);
	}
}