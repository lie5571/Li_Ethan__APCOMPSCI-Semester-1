import java.util.*;
public class XsandOs
{
	public static void main (String[]args)
	{
		String[][] xando = new String[4][4];
		
		for( int i = 0; i < xando.length; i++)
		{
			for( int j = 0; j < xando[i].length; j++)
			{
				int pick = 1 +(int)((Math.random()* 2));
				
				if(pick == 1)
				{
					xando[i][j] = "X";
				}
				
				if(pick == 2)
				{
					xando[i][j] = "O";
				}
				System.out.print(xando[i][j] + "\t");
			}
			System.out.println(" ");
		}
		
	}
	
}