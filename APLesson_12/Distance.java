import java.util.*;
public class Distance 
{
    private int x1, y1, x2, y2;
    private double dist;
    public Distance() 
	{
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        dist = 0;
    }
    public Distance(int x_1, int y_1, int x_2, int y_2) 
	{
        x1 = x_1;
        y1 = y_1;
        x2 = x_2;
        y2 = y_2;
        dist = 0;
    }
    public void setVars(int x_1, int y_1, int x_2, int y_2) 
	{
        x1 = x_1;
        y1 = y_1;
        x2 = x_2;
        y2 = y_2;
        dist = 0;
    }
    public double getDist() 
	{
        return  Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

}