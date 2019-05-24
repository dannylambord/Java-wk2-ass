package assessment;

public class MoveEast extends Board {
	
	public String moveEast()
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
		int x1 = (int) x + 1;

		Board.board[y1][x1] = 2;

		int xPos = (int)p.getXPosition();
		int yPos = (int)p.getYPosition();

		
		System.out.println("The position of the player is now " + (int)p.getXPosition() + "," + (int)p.getYPosition());
		return "The position of the player is now " + xPos  + "," + yPos; 
	}

}
