public class Playstation extends Console
{

    public Playstation() 
	{
        super();
    }

    public Playstation(String system) 
	{
        super(system);
    }
   
    public String getController()
	{
        return "PlayStation DualShock 4";
    }

    public String getPlatform() 
	{
        return "PlayStation 4 Pro";
    }
}
