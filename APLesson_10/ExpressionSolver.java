import java.util.*;
public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter  a number, an expression , and another number:");
		String equations = keyboard.nextLine();
		ArrayList<String> equation = new ArrayList<String>(Arrays.asList(equations.split(" ")));
		System.out.print(doEquation(equation));
	}
	
	public static ArrayList<String> doEquation(ArrayList<String> equation)
	{
		int i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if(equation.get(i).equals("*"))
				{
					equation.set(i, " " + ((Integer.parseInt(equation.get(i - 1))) * (Integer.parseInt(equation.get(i + 1)))));

				}
				
				else
				{
					equation.set(i, " " + ((Integer.parseInt(equation.get(i - 1))) / (Integer.parseInt(equation.get(i + 1)))));

				}
				
				equation.remove(i-1);
				equation.remove(i);
			}
			i++;
			
		}
		i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if(equation.get(i).equals("+"))
				{
					equation.set(i, " " + ((Integer.parseInt(equation.get(i - 1))) + (Integer.parseInt(equation.get(i + 1)))));
				}
				
				else
				{
					equation.set(i, " " + ((Integer.parseInt(equation.get(i - 1))) - (Integer.parseInt(equation.get(i + 1)))));
				}
				
				equation.remove(i-1);
				equation.remove(i);
			}
			i++;
		}
		
		
		return equation;
	}
}
