import java.math.*;
import java.util.Scanner;
public class User 
{
    private String firstName, lastName, avatar;
    private long userID;
    public User(String f, String l) 
	{
        firstName = f;
        lastName = l;
        avatar = "Undefined";
        userID = (long)(Math.random()*1000000000)+1;
    }
    public User(String f, String l, String a) 
	{
        firstName = f;
        lastName = l;
        avatar = a;
        userID = (long)(Math.random()*1000000000)+1;
    }
    public String toString() 
	{
        return "User info: \nFirst Name: "+firstName+"\nLast Name: "+lastName+"\nAvatar: "+avatar+"\nUser ID: "+userID;
    }
    public static void main(String[]args)
	{
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String f = kb.nextLine();
        System.out.println("Emter the last name:");
        String l = kb.nextLine();
        System.out.println("Do you want to use a custom avatar(Yes or No)");
        String av = kb.nextLine();
        if(av.equalsIgnoreCase("yes")) 
		{
            System.out.println("Enter the avatar:");
            String a = kb.nextLine();
            User user = new User(f, l, a);
            System.out.println(user.toString());
        }
        else 
		{
            User u = new User(f, l);
            System.out.println(u.toString());
        }
    }
}