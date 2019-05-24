package assessment;

public class GetGoals extends Board {
	
	public float getGoalX()
	{
		float row1 = 0;
		float col = 0;
		float xPos = 0;
		
			for(int[] row :Board.board)
			{
				for(int cell :row)
				{
					if(cell == 3)
					{
						xPos = col;
						return xPos;
						
					}
					col++;
				}
				
				row1++;
				col = 0;
			}
			
			return xPos;
		
	}
	
	public float getGoalY()
	{
		float row1 = 0;
		float col = 0;
		float yPos = 0;
		
			for(int[] row :Board.board)
			{
				for(int cell :row)
				{
					if(cell == 3)
					{
						yPos = row1;
						return yPos;
					}
					col++;
				}
				
				row1++;
				col = 0;
			}
			
			return yPos;
	}
	
	public String getDistance()
	{
		Position p = new Position();
		int xPos = (int) p.getXPosition();
		int yPos = (int) p.getYPosition();
		
		Board b = new Board();
		
		float x = (getGoalX() - p.getXPosition());
		float y = (getGoalY() - p.getYPosition());
		
		
		double goal = Math.round(Math.sqrt(((x*x) + (y*y))));
		System.out.println(Board.board[xPos][yPos]);
		
		
		
		System.out.println("The distance to the goal is: " + goal + "m");
		
		return "The distance to the goal is: " + goal + "m";
	}

}
