public abstract class Ticket 
{
    int serialNumber;
    public Ticket() 
	{
        serialNumber = 1000000 + (int)(Math.random() * 9999999);
    }

    public int getSerialNumber()
	{
        return serialNumber;
    }

    public abstract int getPrice();


    public String toString() 
	{
        return "serialNumber=" + getSerialNumber() +
                "\nPrice=" + getPrice();
    }
}
