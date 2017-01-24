import java.util.*;
public class Divisor
{
	public static void main (String[]args)
	{
		int[][] nums = new int[4][4];
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = 1 +(int)((Math.random()* 100));
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println(" ");
		}
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int divisor = user_input.nextInt();
		
		int count = 0;
		for( int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				if(nums[i][j] % divisor == 0)
				{
					count += 1;
				}
			}
		}
		System.out.println("There are " + (count) + " numbers divisible by " + (divisor) + " in the Array.");
	}
}