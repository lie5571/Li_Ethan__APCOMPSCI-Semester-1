public class GameSystem 
{
    String platform;
    int serialNumber;

    public GameSystem()
	{
        this.platform = " ";
        this.serialNumber = 1 + (int)(Math.random()*9999999);
    }

    public GameSystem(String platform)
	{
        this.platform = platform;
        this.serialNumber = 1 + (int)(Math.random()*9999999);
    }

    public String getPlatform() 
	{
        return platform;
    }

    public int getSerialNumber() 
	{
        return serialNumber;
    }
}
