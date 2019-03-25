package exam;

import static org.junit.Assert.*;
import org.junit.Test;

public class CuboidTestV2 {

	@Test
	public void ConstructionTest(){
		Cuboid r = new Cuboid (1,2,3);
		assertEquals(3,r.getDepth());
		assertEquals(2,r.getLength());
		assertEquals(1,r.getWidth());
		assertTrue(r instanceof Cuboid);
	}
	
	
	
	
	
	@Test
	public void GetDepthTest() {
		Cuboid r = new Cuboid(1,2,3);
		assertEquals(3,r.getDepth());
	}
	@Test
	public void SetDepthTest() {
		Cuboid r = new Cuboid(1,2,3);
		r.setDepth(4);
		assertEquals(4,r.getDepth());
	}
	
	
	
	
	@Test
	public void AreaTest() {
		Cuboid r = new Cuboid(1,2,3);
		assertEquals(22,r.area(),0.05);
	}
	
	
	@Test
	public void VolumeTest() {
		Cuboid r = new Cuboid(1,2,3);
		assertEquals(6,r.volume(),0.05);
	}
}
