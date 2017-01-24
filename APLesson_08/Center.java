import java.util.Scanner;
public class Center 
{
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the first word:");
		String word1 = keyboard.nextLine();
		
		System.out.println("Enter the second word:");
		String word2 = keyboard.nextLine();
		
		System.out.println("Enter the third word:");
		String word3 = keyboard.nextLine();
		
		System.out.println(makeCenter(word1));
		
		System.out.println(makeCenter(word2));
		
		System.out.println(makeCenter(word3));
	}
	public static String makeCenter(String word) 
	{
		if (word.length()>= 20) 
		{
			return word;
		}
		else 
		{
			return makeCenter(" " + word + " ");
		}
	}
}
