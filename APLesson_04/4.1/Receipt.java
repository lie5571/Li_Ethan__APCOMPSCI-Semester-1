import java.util.Scanner;

public class Receipt
{
	public static void main(String[]args)
	{
		Receipt form = new Receipt();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.next();
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		
		System.out.println("Please enter item 2:");
		String item2 = keyboard.next();
		System.out.println("Please enter the price");
		double price2 = keyboard.nextDouble();
		
		System.out.println("Please enter item 3:");
		String item3 = keyboard.next();
		System.out.println("Please enter the price");
		double price3 = keyboard.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<Receipt>>>>>>>>>>>>>>>");
		
		form.format(item1, price1);
		
		form.format(item2, price2);
		
		form.format(item3, price3);
		
		double subtotal = price1+price2+price3;
		
		double tax = subtotal*0.075;
		
		double total = subtotal+tax;
		
		form.format("Subtotal: ", subtotal);
		form.format("Tax: ", tax);
		form.format("Total: ", total);
		
		System.out.println("\n____________________________________");
		System.out.println("   * Thank you for your support *   ");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n* %15s ........ %10.2f ", item, price);
	}
}
