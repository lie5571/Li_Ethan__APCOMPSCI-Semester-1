import java.util.Scanner;
public class Average1 
{
    
    static double numberOne, numberTwo, numberThree, numberMean;
    
    public static void main(String[]args)
	{
        Scanner kb = new Scanner(System.in);
		System.out.print("Enter the first number: ");
        numberOne = kb.nextDouble();
        System.out.print("Enter the second number: ");
        numberTwo = kb.nextDouble();
        System.out.print("Enter the third number: ");
        numberThree = kb.nextDouble();
        Average();
        Print();
    }
   
    public static void Average()
	{
        numberMean = (numberOne + numberTwo + numberThree)/3;
    }
   
    public static void Print()
	{
        System.out.printf("The average of %.2f, %.2f, and %.2f is %.5f", numberOne, numberTwo, numberThree, numberMean);
    }
}
