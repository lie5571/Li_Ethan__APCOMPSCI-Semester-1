public class Car 
{
    private String paint, interior, engine, wheels;

    public Lab_12_01_01_Car(String wheels, String paint, String interior, String engine) 
	{
        this.wheels = wheels;
        this.paint = paint;
        this.interior = interior;
        this.engine = engine;
    }

    public String getPaint() 
	{
        return paint;
    }

    public String getInterior() 
	{
        return interior;
    }

    public String getEngine() 
	{
        return engine;
    }

    public String getWheels()
	{
        return wheels;
    }
}