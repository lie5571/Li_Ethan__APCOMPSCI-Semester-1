import java.util.Scanner;
public class Cube2 
{
    public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
        System.out.print("Enter one side: ");
        double side = kb.nextDouble();
        print(side, calcSurfaceArea(side));
    }

    public static double calcSurfaceArea(double side)
	{
        return 6 * side * side;
    }
    
    public static void print(double side, double surfaceArea)
	{
        System.out.printf("The surface area of cube with a side length of %.2f is %.5f", side, surfaceArea);
    }
}
