

import java.awt.Rectangle;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import starter.model.EmptyTile;

class EmptyTileTest extends TestCase {


	@Test
	void setup() {
		EmptyTile empty = new EmptyTile(150,200,100,100);
	}
	
	
	
	@Test
	void testGetColumn() {
		EmptyTile empty = new EmptyTile(150,200,100,100);
		assertEquals(150,empty.getColumn());
	}
	
	@Test
	void testGetRow() {
		EmptyTile empty = new EmptyTile(150,200,100,100);
		assertEquals(200,empty.getRow());
	}
	
	@Test
	void testSetLocation() {
		EmptyTile empty = new EmptyTile(150,200,100,100);
		empty.setLocation(50, 60);
		assertEquals(50, empty.getColumn());
		assertEquals(60, empty.getRow());
	}
	
	@Test
	void testGetRectangle() {
		EmptyTile empty = new EmptyTile(150,200,100,100);
		Rectangle rec = new Rectangle(100,150,100,100);
		assertEquals(rec,empty.getRectangle());
	}

}
