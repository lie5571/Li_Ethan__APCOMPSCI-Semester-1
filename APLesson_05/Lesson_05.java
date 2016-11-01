public class Lesson_05

{
	public static void main(String[]args)
	{
		int num = 3;
		if(num == 3);
		{
			System.out.println("num equals 3!");
		}
		
		if(num == 5)
		{
			System.out.println("num equals 5!");
		}
		
		
		if(tOrF())
		{
			System.out.println("It is true!");
		}
		if(!tOrF())
		{
			System.out.println("It is false!");
		}
	}
	
	public static boolean tOrF()
	{
		return 8 >= 5;
	}
	

}