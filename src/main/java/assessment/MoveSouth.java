package assessment;

public class MoveSouth extends Board{
	
	public String moveSouth()
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

		Board.board[oldX][oldY] = 0;

		int y1 = (int) y + 1;
		int x1 = (int) x;

		Board.board[x1][y1] = 2;
		
		System.out.println("The position of the player is now " + (int)p.getXPosition() + "," + (int)p.getYPosition());
		return "The position of the player is now " + (int)p.getXPosition() + "," + (int)p.getYPosition();
	}

}
