import java.util.*;
public class GameHealth 
{
	static int HEALTHLOAD = 6, healthcount = HEALTHLOAD;
	static String[] health = new String[HEALTHLOAD];
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String turn = "";
		for (int i=0; i<health.length; i++) { health[i] = "@"; }
		while (!(turn.equalsIgnoreCase("QUIT")) && healthcount > 0) 
		{
			System.out.println("It is your turn. Press any key when ready:");
			turn = keyboard.next();
			int damage = 1 + (int)(Math.random() * 2);
			amount = 1 + (int)(Math.random() * 6);
			takeDamage(damage, amount);
			printHealth();
		}
		System.out.println("Player is dead.");
	}
	public static void takeDamage(int damage, int amount) 
	{
		if (damage == 1) 
		{
			System.out.println("Player takes " + amount + " damage.");
			healthcount -= amount;
		}
		else 
		{
			if (healthcount + amount < HEALTHLOAD) 
			{ 
				healthcount += amount; 
			}
			else 
			{ 
				healthcount = HEALTHLOAD; 
			}
			System.out.println("Player gains " + amount + " health.");;
		}
	}
	public static void printHealth() 
	{
		String output = "";
		output += "Health:\t";
		for (int i=0; i<HEALTHLOAD; i++) 
		{
			if (i < healthcount) 
			{ 
				health[i] = "@"; 
			}
			else 
			{ 
				health[i] = "[]"; 
			}
			output += health[i] + " ";
		}
		System.out.println(output);
	}
}