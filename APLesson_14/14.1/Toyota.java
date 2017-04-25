import java.util.*;
public class Toyota extends Car 
{
    private double Variable11, Variable21;
    public Toyota(String pos) 
	{
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(pos.split(", ")));
        Double posX = Double.parseDouble(position.get(0)), posY = Double.parseDouble(position.get(1));
        move(posX, posY);
    }
    public void move(double x, double y) 
	{
        this.Variable11 += x;
        this.Variable21 += y;
    }
    public double[] getLoc() 
	{
        double[] coords = {Variable11, Variable21};
        return coords;
    }
}