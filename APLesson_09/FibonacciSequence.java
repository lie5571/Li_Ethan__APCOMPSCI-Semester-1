import java.util.Scanner;
public class FibonacciSequence 
{
    public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your starting number:: ");
        int startNumber = keyboard.nextInt();
        System.out.print("Enter your sequence size:: ");
        int size = keyboard.nextInt();
        int[] sequenceFibonacci = new int[size];

        for (int i = 0; i < sequenceFibonacci.length; i++)
		{
            if (i == 0 || i == 1)
			{
                sequenceFibonacci[i] = startNumber;
            }
            else 
			{
                sequenceFibonacci[i] = sequenceFibonacci[i - 2] + sequenceFibonacci[i - 1];
            }
            System.out.print(sequenceFibonacci[i] + " ");
        }
    }
}