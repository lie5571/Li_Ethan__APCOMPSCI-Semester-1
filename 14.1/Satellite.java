import java.util.*;
public class Satellite 
{
    public static void main(String[]args) 
	{
        ArrayList<Car> locate = new ArrayList<>();
        double[] positions = new double[6];
        for(int i=0; i<6; i++) 
		{
        	positions[i] = Math.round((double)(Math.random() * 100) + 1);
        }
        double[] honLoc = {5, 6};
        locate.add(new Honda(honLoc));
        locate.add(new Toyota("8, 9"));
        locate.add(new GMC(3, 8));
        int i = 0;
        for(Car l : locate) 
		
		{
        	l.move(positions[i], positions[i+1]);
        	i += 2;
        }
        double[] home = {0, 0};
        String printout = "\n\n" + "==========================" + "\nStarting locations...";
        for(Car l : locate) 
		
		{
            printout += "\nCar for " + l.getID() + ": (" + getCar(l.getLoc()) + ")";
        }
        printout += "\n\n" + "==========================";
        i = 0;
        for(Car l : locate) 
		{
            double[] newPos = l.getLoc();
            double x = newPos[0], y = newPos[1];
            printout += "\nAfter " + l.getID() + " moved (" + positions[i] + ", " + positions[i+1] + ")"
            + "\nNew location: " + "(" + x + ", " + y + " )";
            i += 2;
        }
        printout += "\n\n" + "==========================" + "\nDistance from home...";
        for(Car l : locate) 
		{
            printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
        }
        System.out.println(printout);
    }
    public static double getDistance(double[] car, double[] home)
	{
        return Math.round(Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2))));
    }
    
	public static String getCar(double[] loc)
	{
        return loc[0] + ", " + loc[1];
    }
}