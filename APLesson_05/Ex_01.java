import java.util.Random;
public class Ex_01
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int roll1 = rand.nextInt(6)+1;
		int roll2 = rand.nextInt(6)+1;
		System.out.println("You rolled a " + roll1);
		System.out.println("Computer rolled a " + roll2);
		diceRoll(roll1,  roll2);
	}
	
	public static void diceRoll(int r1, int r2)
	{
		if(r1>r2)
			System.out.println("Winner is you.");
		if(r1<r2)
			System.out.println("Winner is computer.");
		if(r1==r2)
			System.out.println("You tied.");
	}
}