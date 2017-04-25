import java.util.*;
public class Toyota extends Car 
{
    private double Variable11, Variable21;
    public Toyota(String pos) 
	{
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(pos.split(", ")));
        Double posX = Double.parseDouble(position.get(0)), posY = Double.parseDouble(position.get(1));
        super.move(posX, posY);
    }
}