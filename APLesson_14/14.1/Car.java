import java.util.*;
public abstract class Car implements Location 
{
	private int ID;
	private double[] arrayOfDoubleswut = new double[2];
	public Car() 
	{
		ID = (int)(Math.random() * 1000000) + 100000;
		arrayOfDoubleswut[0] = 0;
		arrayOfDoubleswut[1] = 0;
	}
	public void move(double Variable1, double Variable2)
	{
		arrayOfDoubleswut[0] += Variable1;
		arrayOfDoubleswut[1] += Variable2;
	}
	public int getID() 
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return arrayOfDoubleswut;
	}
	
}