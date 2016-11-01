import java.util.Scanner;

public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("MUAHAHAHAHAHA! YOU HAVE BEEN SUCKED INTO THIS TERRIBLE WORLD!");
		System.out.println("No matter what choices you make you'll definately die :)");
		System.out.println("But let's have some fun and see how you die, eh?");
		System.out.println("Your starting place is a dark spooky forest.");
		System.out.println("You see two paths, one with blood trailing behind it and another with sunshine and flowers. Which path do you take?" +
							"\n 1. The bloody path" +
							"\n 2. The Sunshine daisy path");
							int choice1 = kb.nextInt();
		if(choice1 == 1)
		{
		 System.out.println("Darn you got past the first one. But I'll still have the last laugh. MUHAHAHA!");
		 System.out.println("Well, now it appears you are on the trail of a bleeding animal, possibly your next meal");
		 System.out.println("You see two weapons on the ground that you can possbily use. Which one do you pick up?" +
							 "\n 1. An old Japanese katana" + 
							 "\n 2. A good ol' bat");
							 int choice2 = kb.nextInt();
			if(choice2 == 1)
			{
				System.out.println("I thought you were smart for getting past the first one but obviously, I was wrong. HEHEHE.");
				System.out.println("Use your brain ya weeaboo. That katana is so old that the wrappings on the handle has worn away to reveal the sharp rust covered tang.");
				System.out.println("And the last I remembered, a certain someone didn't get their tetnus shot, so you die!");
			}
			else
			{
				System.out.println("Hmmmm, it seems like you've been able to escape the grasp of death yet again!");
				System.out.println("I'm beginning to like you......just a tad.");
				System.out.println("Alright, as you are stalking your next meal like the hunter you are, you come upon two portals. Which one do you take?" +
									"\n 1. A clean, nice looking portal that says 'Home'" +
									"\n 2. A dirty smudged portal that says 'The End'");
									int choice3 = kb.nextInt();
				if(choice3 == 1)
				{
					System.out.println("Alright, ya got me there. I was trying to trick you. Well, you passed the test");
					System.out.println("You can go home now, safe and sound. Let's play again sometime......hehehehe....");
				}
				else
				{
					System.out.println("WEEEEEE, I gotcha! Finally!");
					System.out.println("I said the end didn't I? The end of your life that is, HAHAHAHA!");
				}
			}	
			
		}
		else
		{
		 System.out.println("HAHA! You fool! That path is obviously a trick, full of deadly traps such as the spiked pitfall that you just implaed yourself in!");
		 System.out.println("You should have taken the bloody path. That was a trail to your next meal!");
		 System.out.println("Haven't you seen Man Vs. Wild?");
		}
		
	}
}