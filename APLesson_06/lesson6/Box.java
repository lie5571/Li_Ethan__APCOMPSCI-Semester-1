import java.util.Scanner;
public class Box
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your word: ");
		String word = kb.next();
		System.out.println(word.length());
		
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word);
		}
	}
}