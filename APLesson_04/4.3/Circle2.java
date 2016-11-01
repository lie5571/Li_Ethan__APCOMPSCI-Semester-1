import java.util.Scanner;
public class Circle2 
{
    public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
        System.out.print("What is the radius of the circle: ");
        double radius = kb.nextDouble();
        print(radius, calcArea(radius));
    }
    
    public static double calcArea(double radius)
	{
        return 3.14 * radius * radius;
    }
   
    public static void print(double radius, double area)
	{
        System.out.printf("The area of a circle with a radius of %.2f is %.5f", radius, area);
    }
}
