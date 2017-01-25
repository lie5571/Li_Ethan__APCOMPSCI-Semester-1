import java.util.*;
public class MilesPerHourRunner 
{
    static Scanner user_input = new Scanner(System.in);
    static int dist, hours, min;
    public static void main(String[]args)
	{
        System.out.println("Enter a distance");
        dist = user_input.nextInt();
        System.out.println("Enter the hours");
        hours = user_input.nextInt();
        System.out.println("Enter the minutes");
        min = user_input.nextInt();
        MilesPerHour miles = new MilesPerHour();
        miles.setVars(dist, hours, min);
        System.out.println(dist + " miles in " + hours + " hours and " + min + " minutes results in a speed of " + miles.getMilesperhour() + " MPH.");
    }
}