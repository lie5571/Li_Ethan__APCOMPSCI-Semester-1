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
        x1 = m_x;
        y1 = m_y;
        x2 = m_z;
        y2 = m_xy;
        dist = 0;
    }
    public void setVars(int m_x, int m_y, int m_z, int m_xy) 
	{
        x1 = m_x;
        y1 = m_y;
        x2 = m_z;
        y2 = m_xy;
    }
    public double getDist() 
	{
        return  Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

}