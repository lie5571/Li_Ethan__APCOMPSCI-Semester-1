public class GMC implements Location 
{
    private double Variable11, Variable21;
    private int id;
    public GMC(double Variable1, double Variable2) 
	{
        move(Variable1, Variable2);
    }
    public void setID() 
	{
        id = (int)(Math.random() * 999999) + 99999;
    }
    public int getID() 
	{
		return id;
    }
    public void move(double Variable1, double Variable2) {
        this.Variable11 += Variable1;
        this.Variable21 += Variable2;
    }
    public double[] getLoc() 
	{
        double[] coords = {Variable11, Variable21};
        return coords;
    }
}