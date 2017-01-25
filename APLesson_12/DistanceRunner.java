import java.util.*;
public class DistanceRunner 
{
    static int x1, x2, y1, y2;
    static Scanner user_input = new Scanner(System.in);
    public static void main(String[]args)
	{
        System.out.print("X1:: ");
        x1 = user_input.nextInt();
        System.out.print("Y1:: ");
        y1 = user_input.nextInt();
        System.out.print("X2:: ");
        x2 = user_input.nextInt();
        System.out.print("Y2:: ");
        y2 = user_input.nextInt();
        Distance points = new Distance(x1, y1, x2, y2);
        System.out.println("Distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + "):: " + points.getDist());
        points.setVars(0,0,2,2);
        System.out.println("Distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + "):: " + points.getDist());

    }
}