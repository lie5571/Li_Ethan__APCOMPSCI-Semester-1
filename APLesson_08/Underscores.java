import java.util.Scanner;
public class Underscores 
{
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = keyboard.nextLine();
		System.out.println(replace(sentence));
	}
	public static String replace(String word) 
	{
		if (word.indexOf(" ") < 0) 
		{
			return word;
		}
		else 
		{
			return replace(word.substring(0, (word.indexOf(" "))) + "_" + word.substring((word.indexOf(" ") + 1), word.length()));
		}
	}
}