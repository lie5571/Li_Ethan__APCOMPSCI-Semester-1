import java.util.*;
public class Toyota implements Location 
{
	Scanner kb = new Scanner(System.in);
	private double Variable11, Variable21;
	private int id;
	public Toyota(String pos) 
	
	{
		ArrayList<String> position = new ArrayList<>(Arrays.asList(pos.split(", ")));
		double xpos = Double.parseDouble(position.get(0));
		double ypos = Double.parseDouble(position.get(1));
		move(xpos, ypos);
	}
	public void setID() 
	
	{
		id = (int)(Math.random()*999999) + 99999;
	}
	public int getID() 
	
	{
		return id;
	}
	public void move(double Variable1, double Variable2) 
	
	{
		this.Variable11 += Variable1;
		this.Variable21 += Variable2;
	}
	public double [] getLoc() {
		double [] coords = {Variable11, Variable21};
		return coords;
	}
}