import java.util.*;
public class Car implements Location 
{
	private final int ID = (int)(Math.random() * 1000000) + 100000;
	private double[] Loc;
	
	public Car() 
	{
		Loc = new double[2];
	}
	
	public int getID() 
	{
		return ID;
	}
	
	public void move(double Variable1, double Variable2) 
	{
		Loc[0] += Variable1;
		Loc[1] += Variable2;
	}
	public double[] getLoc() 
	{
		return Loc;
	}
	
	
}