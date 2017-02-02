import java.util.*;
public class GameGun 
{
	static int CLIPSIZE = 16;
	static int bulletCount = 96;
	static int shotCount = CLIPSIZE;
	static String[] clip = new String[CLIPSIZE];
	
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		for (int i=0; i<clip.length; i++) 
		{
			clip[i] = " * "; 
		}
		
		while (bulletCount > 0 || shotCount > 0) 
		{
			if (bulletCount == 0 && shotCount == 0) 
			{ 
				System.out.println("You're out of bullets.\n\nGame over.");
			}
			
			System.out.println("Available actions are:\nR: Reload\nS: Shoot\n");
			System.out.println("What would you like to do?");
			String temp = keyboard.next();
			
			if (temp.equalsIgnoreCase("R")) 
			{
				reload();
				System.out.println("Reloaded.");
				printClip();
			}
			else if (temp.equalsIgnoreCase("S"))
			{
				shoot();
				printClip();
			}
		}
	}
	
	public static void resetClip() 
	{
		for (int i=0; i<clip.length; i++) 
		{ 
			clip[i] = " * "; 
		}
	}
	
	public static void shoot() 
	{
		if (shotCount > 0) 
		{
			clip[shotCount - 1] = "[]";
			shotCount--;
			bulletCount--;
			System.out.println("BOOM");
		}
		else 
		{ 
			System.out.println("RELOAD"); 
		}
	}
	public static void reload() 
	{
		if (bulletCount >= CLIPSIZE) 
		{ 
	        bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE; 
			
		}
		else 
		{ 
			shotCount = bulletCount; bulletCount = 0; 
		}
		resetClip();
	}
	public static void printClip() 
	{
		String output = "";
		output += "Bullets:\t" + bulletCount + "\nClip:\t";
		for (int i=0; i<CLIPSIZE; i++) 
		{ 
			output += clip[i] + " "; 
		}
		System.out.println(output);
	}
}