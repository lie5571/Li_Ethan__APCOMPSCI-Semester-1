import java.util.Scanner;
public class TreeDeg60 
{
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word:");
		String Word = keyboard.nextLine();
		tree(Word, 0, Word.length());
	}
	public static void tree(String word, int start, int stop) 
	{
		if (start <= stop) {
			System.out.printf("%15s\n", word.substring(0, start));
			start += 1;
			tree(word, start, stop);
		}
	}
}