import java.awt.Rectangle;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import starter.model.Tile;

class TileTest extends TestCase{
	
	
	
	@Test
	void setup() throws Exception {
		
		super.setUp();
		Tile tile = new Tile(1,4,100,100);
		Tile tile2 = new Tile(2,3,true,100,100);
		tile.setLocation(100, 150);
		tile2.setLocation(200, 250);	
	}
	
	@Test
	void testGetColumn(){
		Tile tile = new Tile(1,4,100,100);
		Tile tile2 = new Tile(2,3,true,100,100);
		tile.setLocation(100, 150);
		tile2.setLocation(200, 250);	
		assertEquals(100,tile.getColumn());
		assertEquals(200,tile2.getColumn());
	}
	
	@Test
	void testGetRow() {
		Tile tile = new Tile(1,4,100,100);
		Tile tile2 = new Tile(2,3,true,100,100);
		tile.setLocation(100, 150);
		tile2.setLocation(200, 250);	
		assertEquals(150,tile.getRow());
		assertEquals(250,tile2.getRow());
		
	}
	
	@Test
	void testIsFlipped(){
		Tile tile = new Tile(1,4,100,100);
		Tile tile2 = new Tile(2,3,true,100,100);
		tile.setLocation(100, 150);
		tile2.setLocation(200, 250);	
		assertEquals(false, tile.isFlipped());
		assertEquals(true, tile2.isFlipped());
	}
	
	@Test
	void testFlip() {
		Tile tile = new Tile(1,4,100,100);
		Tile tile2 = new Tile(2,3,true,100,100);
		tile.setLocation(100, 150);
		tile2.setLocation(200, 250);	
		tile.flip();
		tile2.flip();
		assertEquals(true, tile.isFlipped());
		assertEquals(false, tile2.isFlipped());
	}
	
	
	@Test
	void testFaceUpValue() {
		Tile tile = new Tile(1,4,100,100);
		Tile tile2 = new Tile(2,3,true,100,100);
		tile.setLocation(100, 150);
		tile2.setLocation(200, 250);	
		assertEquals(1,tile.getFaceUpValue());
		assertEquals(3,tile2.getFaceUpValue());
	}

	
	@Test
	void testGetRectangle() {
		Tile tile = new Tile(1,4,100,100);
		Tile tile2 = new Tile(2,3,true,100,100);
		tile.setLocation(100, 150);
		tile2.setLocation(200, 250);	
		Rectangle rec1 = new Rectangle(50,100,100,100);
		Rectangle rec2 = new Rectangle(150,200,100,100);
		
		assertEquals(rec1,tile.getRectangle());
		assertEquals(rec2,tile2.getRectangle());
	}
	
}
