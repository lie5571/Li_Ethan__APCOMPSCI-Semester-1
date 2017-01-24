import java.util.Scanner;
public class ReverseWord 
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

        System.out.println("In order...");
        for (String word : words){
            System.out.println(word);
        }

        System.out.println("In reverse...");
        reverse(words);
    }

    public static void reverse(String[] words)
	{
        for (int i = words.length - 1; i >= 0; i--)
		{
            System.out.println(words[i]);
        }
    }
}