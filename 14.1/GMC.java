public class GMC extends Car\
{
    private double Variable11, Variable21;
    public GMC(double Variable1, double Variable2) 
	{
        super();
        move(Variable1, Variable2);
    }
    public void move(double Variable1, double Variable2) 
	{
		
        this.Variable11 += Variable1;
        this.Variable21 += Variable2;
    }
    public double[] getLoc() 
	{
        double[] coords = {Variable11, Variable21};
        return coords;
    }
}