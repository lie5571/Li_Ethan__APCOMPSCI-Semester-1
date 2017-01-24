public class GetOdds
{
	public static void main(String[]args) 
	{
		int[] Array = new int[10];
		fillArray(Array);
		System.out.print("For the following numbers: ");
		printArray(Array);
		System.out.println("\nThere are " + getOdds(Array) + " odd numbers.");
	}
	public static void fillArray(int[] numbers) 
	{
		for (int i=0;i<numbers.length;i++) 
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	public static void printArray(int[] numbers) 
	{
		for (int foo : numbers) 
		{
			System.out.print(foo + " ");
		}
	}
	public static int getOdds(int[] numbers) 
	{
		int odds = 0;
		for (int number : numbers) 
		{
			if (number % 2 == 0) 
			{
				odds++;
			}
		}
		return odds;
	}
}