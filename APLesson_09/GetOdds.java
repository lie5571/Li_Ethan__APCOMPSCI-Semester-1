public class GetOdds
{
	static int[] numbers = new int[10]; 
	public static void main(String[]args) 
	{
		
		fillArray();
		System.out.print("For the following numbers: ");
		printArray();
		System.out.println("\nThe odd numbers are " + getOdds() );
	}
	public static void fillArray() 
	{
		for (int i=0; i<numbers.length; i++) 
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	public static void printArray() 
	{
		for (int foo : numbers) 
		{
			System.out.print(foo + " ");
		}
	}
	public static String getOdds() 
	{
		String odds = "";
		for (int number : numbers) 
		{
			if (number % 2 != 0) 
			{
				odds += number + " ";
			}
		}
		return odds;
	}
}