import java.util.Scanner; //import statement

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = keyboard.next();
		System.out.println(name + "?? What a terrible name.");
		
		System.out.println("How old are you?");
		int num1 = keyboard.nextInt();
		System.out.println("Wow " + num1 + "? Are you a dinosaur?");
		
		System.out.println("What do you do for fun?");
		String fun = keyboard.next();
		System.out.println(fun + "? That sounds so boring that I'm falling asleep just thinking about it.");
		
		System.out.println("What kind of music do you like?");
		String like = keyboard.next();
		System.out.println("Hah, " + like + " is the worst type of music ever!");
		
		System.out.println("How many siblings do you have?");
		int num2 = keyboard.nextInt();
		System.out.println(num2 + " seems like a really bad number.");
		
		System.out.println("What do you want to be when you grow up?");
		String up = keyboard.next();
		System.out.println(up + "? Hah, good luck buddy.");
		
	}
	
}