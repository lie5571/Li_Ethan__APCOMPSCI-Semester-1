import java.util.*;
public class CarRunner {
    static Scanner user_input = new Scanner(System.in);
    public static void main(String[]args)
	{
        System.out.print("Enter the paint:: ");
        String paint = user_input.nextLine();
        System.out.print("Enter the interior:: ");
        String interior = user_input.nextLine();
        System.out.print("Enter the engine configuration:: ");
        String engine = user_input.nextLine();
        System.out.print("Enter the wheels:: ");
        String wheels = user_input.nextLine();
        Car TeslaP100D = new Car(paint, interior, engine, wheels);
        System.out.println("Your car is ready!");
        System.out.println("Paint:\t" + TeslaP100D.getPaint());
        System.out.println("Interior:\t" + TeslaP100D.getInterior());
        System.out.println("Engine:\t" + TeslaP100D.getEngine());
        System.out.println("Wheels:\t" + TeslaP100D.getWheels());
    }

}