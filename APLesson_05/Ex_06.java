import java.util.Scanner;

public class Ex_06
{
	static String Password, Username;
	public static void main(String[]args)
	{	
		Username = "BOB";
		Password = "Joe";
		
		passCheck();
		
	}
	
	public static void passCheck()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the Username: ");
		String user1 = kb.next();
		System.out.println("Please enter the Password: ");
		String pass1 = kb.next();
		
		if(user1.equals(Username) && pass1.equals(Password))
			System.out.println("You are granted access!");
		else
			if(user1.equals(Username) && ! pass1.equals(Password))
				System.out.println("Your password is incorrect");
			else if(! user1.equals(Username) && pass1.equals(Password))
				System.out.println("Your username is incorrect");
			else
				System.out.println("Your username and password are incorrect");
	}
}