import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore 
{
    ArrayList<Toy> toyList = new ArrayList<>();

    public ToyStore()
	{
        toyList = new ArrayList<>();
    }
    public ToyStore(String toyList)
	{
        loadToys(toyList);
    }

    public void loadToys(String toy)
	{
        ArrayList<String> toys = new ArrayList<>(Arrays.asList(toy.split("\\s*,\\s*")));
        toyList = new ArrayList<>();
        for (int i = 0; i < toys.size(); i += 2)
		{
            String name = toys.get(i);
            String type = toys.get(i + 1);
            Toy Toy = getThatToy(name);

            if (Toy == null)
			{
                if (type.equalsIgnoreCase("Car"))
				{
                    toyList.add(new Car(name));
                }
                if (type.equalsIgnoreCase("Action Figure"))
				{
                    toyList.add(new ActionFigure(name));
                }
            } 
			else 
			{
                Toy.setToyCount(Toy.getToyCount() + 1);
            }
        }
    }

    public Toy getThatToy(String name)
	{
        for (Toy Toy : toyList)
		{
            if (Toy.getToyName().equalsIgnoreCase(name))
			{
                return Toy;
            }
        }
        return null;
    }

    public String getMostFrequentToy()
	{
        String name = " ";
        int MAX = Integer.MIN_VALUE;
        for (Toy Toy : toyList)
		{
            if (MAX < Toy.getToyCount())
			{
                MAX = Toy.getToyCount();
                name = Toy.getToyName();
            }
        }
        return name;
    }

    public String getMostFrequentType()
	{
        int Car = 0, ActionFigure = 0;
        for (Toy Toy : toyList)
		{
            if (Toy.getType().equalsIgnoreCase("Car"))
			{
                Car++;
            } 
			if (Toy.getType().equalsIgnoreCase("Action Figure"))
			{
                ActionFigure++;
            }
        }
        if (Car > ActionFigure)
		{
            return "Cars!";
        } 
		else if (ActionFigure > Car)
		{
            return "Action Figures!";
        } 
		else 
		{
            return "Equals amounts of cars and action figures";
        }
    }

    public String toString() 
	{
        return "" + toyList;
    }
}
