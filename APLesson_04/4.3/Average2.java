import java.util.Scanner;
public class Average2 
{
    public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double numberOne = kb.nextDouble();
        System.out.print("Enter the second number: ");
        double numberTwo = kb.nextDouble();
        System.out.print("Enter the third number: ");
        double numberThree = kb.nextDouble();

        print(numberOne, numberTwo, numberThree, Average(numberOne, numberTwo, numberThree));
    }
   
    public static double Average(double numberOne, double numberTwo, double numberThree)
	{
        return (numberOne + numberTwo + numberThree)/3;
    }
    
    public static void print(double numberOne, double numberTwo, double numberThree, double numberMean)
	{
        System.out.printf("The average of %.2f, %.2f, and %.2f is %.5f", numberOne, numberTwo, numberThree, numberMean);
    }
}
