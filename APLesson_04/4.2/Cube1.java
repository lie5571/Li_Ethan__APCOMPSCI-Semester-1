import java.util.Scanner;//Import Scanner
public class Lab_04_02_03_Cube {
    //Instance Variables
    static double side, surfaceArea;
    //Scanner Setup
    static Scanner user_input = new Scanner(System.in);
    //Main Method
    public static void main(String[]args){
        System.out.print("Enter one side:: ");
        side = user_input.nextDouble();
        calcSurfaceArea();
        print();
    }
    //Method to calculate the surface area
    public static void calcSurfaceArea(){
        surfaceArea = 6 * side * side;
    }
    //Method to print
    public static void print(){
        System.out.printf("The surface area of cube with a side length of::%.2f is::%.5f", side, surfaceArea);
    }
}
