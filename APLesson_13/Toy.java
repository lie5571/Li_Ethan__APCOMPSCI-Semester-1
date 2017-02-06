public class Toy
{
	private String name; 
	private int count;
	
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	
	public Toy(String n)
	{
		this.name = n;
		this.count = 1;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getCount()
	{
		return this.count;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(double v)
	{
		this.count = v;
	}
	
	
}