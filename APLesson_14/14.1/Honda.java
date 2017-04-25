public class Honda extends Car 
{
    private double Variable11, Variable21;
    public Honda(double[] pos) 
	{
        super();
        move(pos[0], pos[1]);
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