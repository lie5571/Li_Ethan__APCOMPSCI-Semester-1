import java.util.Scanner;
public class Circle1
 {
 
    static double radius, area;
   
    public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
        System.out.print("What is the radius of the circle: ");
        radius = kb.nextDouble();
        calcArea();
        print();
    }
   
    public static void calcArea()
	{
        area = 3.14 * radius * radius;
    }
    
    public static void print()
	{
        System.out.printf("The area of a circle with a radius of %.2f is %.5f", radius, area);
    }
}
