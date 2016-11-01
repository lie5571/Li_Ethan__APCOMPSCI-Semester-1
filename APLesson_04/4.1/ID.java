import java.util.Scanner; 

public class ID
{
	public static void main(String[]args)
	{
		ID form = new ID();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String l1 = keyboard.nextLine();
		
		System.out.println("Enter your last name: ");
		String r1 = keyboard.nextLine();
		
		System.out.println("Enter your title: ");
		String l2 = keyboard.nextLine();
		
		System.out.println("Enter the school site: ");
		String l3 = keyboard.nextLine();
		
		System.out.println("Enter the school year: ");
		String r2 = keyboard.nextLine();
		
		System.out.println("What is your subject? ");
		String r3 = keyboard.nextLine();
		
		System.out.println("***********************************");
		
		form.format(l3, r2);
		form.format(l1, r1);
		form.format(l2, r3);
		
		System.out.println("\n***********************************");
	}
	
	
	public void format(String l, String r)
	
	{
		System.out.printf("\n* %15s    %10s * ", l, r);
	}
	
	
	
	
	
	
}


