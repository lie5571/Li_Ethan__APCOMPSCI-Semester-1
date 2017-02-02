import java.util.*;
public class MilesPerHour 
{
    static int distance, hours, minutes;
    static long milesperhour;
    public MilesPerHour()
	{
        distance = 0;
        hours = 0;
        minutes = 0;
        milesperhour = 0;
    }
    public MilesPerHour(int dist, int hr, int min)
	{
        distance = dist;
        hours = hr;
        minutes = min;
        milesperhour = 0;
    }
    public void setVars(int dist, int hr, int min) 
	{
        distance = dist;
        hours = hr;
        minutes = min;
        milesperhour = 0;
    }
    public long getMilesperhour()
	{
        return Math.round(distance / (hours + minutes / 60.0));
    }

}