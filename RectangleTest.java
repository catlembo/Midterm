package exam;

import static org.junit.Assert.*;
import org.junit.Test;


class RectangleTest {


	@Test
	public void ConstructionTest() {
		Rectangle r = new Rectangle(1,2);
		assertEquals(1,r.getWidth());
		assertEquals(2,r.getLength());
		assertTrue(r instanceof Rectangle);
	}

	
	
	
	
	@Test
	public void GetWidthTest() {
		Rectangle r =new Rectangle(1,2);
		assertEquals(1,r.getWidth());
		
	}
	@Test 
	public void GetLengthTest() {
		Rectangle r = new Rectangle(1,2);
		assertEquals(2,r.getLength());
	}
	@Test
	public void SetLengthTest() {
		Rectangle r = new Rectangle(1,2);
		r.setLength(3);
		assertEquals(3,r.getLength());
	}
	@Test
	public void SetWidthTest() {
		Rectangle r = new Rectangle(1,2);
		r.setWidth(3);
		assertEquals(3,r.getWidth());
	}
	
	
	
	
	
	@Test
	public void AreaTest() {
		Rectangle r = new Rectangle(1,2);
		assertEquals(2,r.area(),0.05);
	}
	
	
	
	
	
	
	@Test
	public void PerimeterTest() {
		Rectangle r = new Rectangle(1,2);
		assertEquals(6,r.perimeter(),0.05);
	}
	
	
	
	
	
	
}
