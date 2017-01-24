import java.util.Scanner;
public class FindZs 
{
	public static void main(String[]args) 
	{
		String[] words = new String[5];
		fillArray(words);
		System.out.print("For the following words: ");
		printArray(words);
		System.out.println("\nOnly " + hasZs(words) + "contain(s) the letter z.");
	}
	public static void fillArray(String[] words) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter five words:");
		for (int i=0;i<words.length;i++) 
		{
			words[i] = keyboard.next();
		}
	}
	public static void printArray(String[] words) 
	{
		for (String word : words) 
		{
			System.out.print(word + " ");
		}
	}
	public static String hasZs(String[] words) 
	{
		String zs = "";
		for (String word : words) 
		{
			if (word.indexOf("z") >= 0) 
			{
				zs += word + " ";
			}
		}
		return zs;
	}
}