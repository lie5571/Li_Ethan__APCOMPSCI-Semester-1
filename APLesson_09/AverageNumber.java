import java.util.Scanner;
public class AverageNumber 
{
    public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i <= 9; i++)
		{
            System.out.print("Enter number #" + (i + 1) + "::");
            numbers[i] = keyboard.nextInt();
        }

        System.out.print("Numbers:: ");
        for (int number: numbers)
		{
            System.out.print(number + " ");
        }

        System.out.println("\nThe average of the numbers is:: " + average(numbers));
    }

    public static int average(int[] numbers)
	{
        int sum = 0;
        for (int number : numbers)
		{
            sum += number;
        }
        return sum / 10;
    }
}