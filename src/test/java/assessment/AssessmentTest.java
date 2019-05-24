package assessment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AssessmentTest {
	
	@Before
	public void Setup()
	{
		Board b = new Board();
		b.createBoard();
		
	}

	@Test
	public void moveNorth() 
	{


		MoveNorth n = new MoveNorth();
		assertEquals("Position wasnt moved north","The position of the player is now 1,1",n.moveNorth());//Starting pos is 2,1 for all tests
	}
	
	@Test
	public void moveSouth() 
	{


		MoveSouth s = new MoveSouth();
		assertEquals("Position wasnt moved north","The position of the player is now 3,1",s.moveSouth());
	}
	
	@Test
	public void moveEast() 
	{

		MoveEast e = new MoveEast();
		assertEquals("Position wasnt moved East","The position of the player is now 2,2",e.moveEast());
	}
	
	@Test
	public void moveWest() 
	{

		MoveWest w = new MoveWest();
		assertEquals("Position wasnt moved north","The position of the player is now 0,2",w.moveWest());
	}
	
	@Test
	public void distanceLeft()
	{

		GetGoals g = new GetGoals();
		assertEquals("Distance left wasn't returned correctly","The distance to the goal is: 3.0m", g.getDistance());
		
	}
	

	

}
