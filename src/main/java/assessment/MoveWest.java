package assessment;

public class MoveWest extends Board {
	
	public String moveWest()
	{
		Position p = new Position();
		float y = p.getYPosition();
		float x = p.getXPosition();

		if(Board.board[(int) x][(int) y] == 3)
		{
			return "Goal reached!";
		}
		
		int oldX = (int) x;
		int oldY = (int) y;

		Board.board[oldY][oldX] = 0;

		int y1 = (int) y;
		int x1 = (int) x - 1;

		Board.board[y1][x1] = 2;


		int xPos = (int)p.getXPosition();
		int yPos = (int)p.getYPosition();

		
		System.out.println("The position of the player is now " + xPos + "," + yPos);
		return "The position of the player is now " + xPos  + "," + yPos; 
	}

}
