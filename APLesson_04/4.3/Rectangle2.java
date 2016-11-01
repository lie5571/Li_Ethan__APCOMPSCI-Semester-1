import java.util.Scanner;
public class Rectangle2 
{
  
    public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = kb.nextDouble();
        System.out.print("Enter the width ");
        double width = kb.nextDouble();
        print(length, width, calcPerimeter(length, width));
    }
    
    public static double calcPerimeter(double length, double width)
	{
        return 2 * length + 2 * width;
    }
    
    public static void print(double length, double width, double perimeter)
	{
        System.out.println("The perimeter of a rectangle with length " + length + " and width " + width + " is " + perimeter);
    }
}
