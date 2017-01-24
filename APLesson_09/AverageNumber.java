
public class AverageNumber 
{
    public static void main(String[]args)
	{
		
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
		{
           
            numbers[i] = (int)(Math.random() * 100) +1;
        }

        System.out.print("Numbers: ");
        for (int number: numbers)
		{
            System.out.print(number + " ");
        }

        System.out.println("\nThe average of the numbers is: " + average(numbers));
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