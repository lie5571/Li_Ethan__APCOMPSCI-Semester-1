public abstract class Toy 
{
    private String toyName;
    private int toyCount;

    public Toy()
	{
        this.toyName = " ";
        this.toyCount = 0;
    }

    public Toy(String toyName)
	{
        this.toyName = toyName;
        this.toyCount = 1;
    }


    public String getToyName()
	{
        return toyName;
    }

    public void setToyName(String toyName)
	{
        this.toyName = toyName;
    }

    public int getToyCount() 
	{
        return toyCount;
    }

    public void setToyCount(int toyCount) 
	{
        this.toyCount = toyCount;
    }

    public abstract String getType();

    public String toString() 
	{
		return  toyName +toyCount;
	}
}
