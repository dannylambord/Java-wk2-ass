package assessment;

public class Board {
	
	static int[][] board = {};
	
	
	public void createBoard()
	{
		

		int[][] board2 = {{0,0,0,3},
						{1,0,1,0},
						{0,2,0,0},
						{0,0,0,0}};
		
		board = board2;

	}
	
	public void printBoard()
	{
		int row1 = 0;
		int col = 0;
		
		for(int[] row :board)
		{
			for(int cell :row)
			{
				System.out.println("Row = " + row1 + " Col = " + col + " Value = " + cell);
				col++;
			}
			row1++;
			col = 0;
		}
	}

}
