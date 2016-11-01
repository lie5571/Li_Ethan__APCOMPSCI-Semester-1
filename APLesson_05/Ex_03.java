import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
	
		
		System.out.println("Enter your grade for your first class: ");
		String grade1 = kb.next();
		
		System.out.println("Enter your grade for your second class: ");
		String grade2 = kb.next();
		
		System.out.println("Enter your grade for your third class: ");
		String grade3 = kb.next();
		
		System.out.println("Enter your grade for your fourth class: ");
		String grade4 = kb.next();
		
		System.out.println("Enter your grade for your fifth class: ");
		String grade5 = kb.next();
		
		System.out.println("Enter your grade for your sixth class: ");
		String grade6 = kb.next();
		
		System.out.println("Enter your grade for your seventh class: ");
		String grade7 = kb.next();
		
		
		double gPoints =  calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
		double gpa = gPoints/7;
		System.out.println("Your GPA is: " + gpa);
	}
	
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		else
			return 0.0;
	}
}