package assessment;

import java.util.Scanner;

public class Menu 
{
	public static void main(String[] args)
	{
		startGame();
	}
	
	public static void startGame()
	{

		System.out.println("Grey foggy clouds float oppressively close to you, \r\n" + 
				"reflected in the murky grey water which reaches up your shins.\r\n" + 
				"Some black plants barely poke out of the shallow water.\r\n" + 
				"Try \"north\",\"south\",\"east\",or \"west\"\r\n" + 
				"You notice a small watch-like device in your left hand.  \r\n" + 
				"It has hands like a watch, but the hands don't seem to tell time. \r\n");
		
		System.out.println("Please type North, East, South or West to try and find the goal, or Quit if you would like to leave");
		
		boolean x = false;
		while(x=true)
		{
			String in = input();
			switch(in) 
			{
				case "North" :
					MoveNorth n = new MoveNorth();
					n.moveNorth();
					GetGoals g = new GetGoals();
					g.getDistance();
					break;
				case "South":
					MoveSouth s = new MoveSouth();
					s.moveSouth();
					GetGoals g1 = new GetGoals();
					g1.getDistance();
					break;
				case "East":
					MoveEast e = new MoveEast();
					e.moveEast();
					GetGoals g2 = new GetGoals();
					g2.getDistance();
					break;
				case "West":
					MoveWest w = new MoveWest();
					w.moveWest();
					GetGoals g3 = new GetGoals();
					g3.getDistance();
					break;
				case "Quit":
					x = true;
					break;
			}	
		}
		
	}
	
	
	public static  String input()
	{
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	

}
