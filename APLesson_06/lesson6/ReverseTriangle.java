import java.util.Scanner;
public class ReverseTriangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = kb.next();
		
		
		for(int i = word.length(); 0 <= i; i--)
		{
			System.out.println(word.substring(0,i));
		}
	}
}