import java.util.Scanner;
public class RightTriangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your word: ");
		String word = kb.next();
		for(int i = word.length(); 0 <= i; i--)
		{
			System.out.println(word.substring(i,word.length()));
		}
		
		
	}
}