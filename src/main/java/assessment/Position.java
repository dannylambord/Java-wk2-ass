package assessment;

public class Position extends Board {
	
	public float getYPosition()
	{
		Board b = new Board();
		float row1 = 0;
		float col = 0;
		float yPos = 0;
		
			for(int[] row :Board.board)
			{
				for(int cell :row)
				{
					if(cell == 2)
					{
						yPos = row1;
						return yPos;
					}
					col++;
				}
				
				row1++;
				col = 0;
			}
			
			//System.out.println(yPos);
			return yPos;
	}
	
	public float getXPosition()
	{
		float row1 = 0;
		float col = 0;
		float xPos = 0;
		
			for(int[] row :Board.board)
			{
				for(int cell :row)
				{
					if(cell == 2)
					{
						xPos = col;
						return xPos;
					}
					col++;
				}
				
				row1++;
				col = 0;
			}
			
			//System.out.println(xPos);
			return xPos;
	}

}
