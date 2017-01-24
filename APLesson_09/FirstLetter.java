import java.util.Scanner;
public class FirstLetter 
{
    public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i <= 4; i++)
		{
            System.out.print("Enter word #" + (i + 1) + "::");
            words[i] = keyboard.nextLine();
        }

        first(words);
    }

    public static void first(String[] words)
	{
        for (String word : words)
		{
            System.out.print(word.charAt(0) + " ");
        }
    }
}