public class StudentAdvance extends Advance
{
    int daysLeft;

    public StudentAdvance(int daysLeft) 
	{
        super(daysLeft);
        this.daysLeft = daysLeft;
    }

    public int getPrice()
	{
        return super.getPrice()/2;
    }

  
    public String toString() 
	{
        return "serialNumber=" + getSerialNumber() +
                "\nPrice=" + getPrice() + 
				"\nStudent ID Required";
    }
}
