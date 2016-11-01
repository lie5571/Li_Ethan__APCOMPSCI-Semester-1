public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		
		String word1 = "blaah";
		double number1 = 3257398.32;
		form.format(word1, number1);
		
		String word2 = "yesssss";
		double number2 = 32143.2434;
		form.format(word2, number2);
		
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}

}
