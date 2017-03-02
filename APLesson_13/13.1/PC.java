public class PC extends GameSystem
{
    String systemInputs;

    public PC(String platform) 
	{
        super(platform);
    }

    public String getSystemInputs()
	{
        return "Winkeyless B.87 EX X2 and Logitech MX Master";
    }
    public String toString() 
	{
        return "Platform='" + super.getPlatform() + '\'' +
                " Serial Number='" + super.getSerialNumber() + '\'' +
                " System Inputs='" + getSystemInputs() + '\'';
    }
}
