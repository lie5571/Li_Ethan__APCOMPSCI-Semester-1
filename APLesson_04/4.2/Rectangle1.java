import java.util.Scanner;
public class Rectangle1 
{
   
    static double length, width, perimeter;
    
    public static void main(String[]args)
	{
        Scanner kb = new Scanner(System.in);
		System.out.print("Enter the length: ");
        length = kb.nextDouble();
        System.out.print("Enter the width: ");
        width = kb.nextDouble();
        calcPerimeter();
        print();
    }
    
    public static void calcPerimeter()
	{
        perimeter = 2 * length + 2 * width;
    }
    
    public static void print()
	{
        System.out.println("The perimeter of a rectangle with length " + length + " and width " + width + " is " +perimeter);
    }
}
