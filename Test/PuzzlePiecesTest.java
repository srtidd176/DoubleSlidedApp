

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import starter.model.EmptyTile;
import starter.model.PuzzlePieces;
import starter.model.Tile;

class PuzzlePiecesTest extends TestCase{

	public PuzzlePieces setup() {
		Tile[] tiles = new Tile[8];
		tiles[0] = new Tile(1,4,false,50, 50); //TL
		tiles[0].setLocation(100,100);
		tiles[1] = new Tile(1,4,true, 50, 50); //TM
		tiles[1].setLocation(150,100);
		tiles[2] = new Tile(3,2,false,50, 50); //TR
		tiles[2].setLocation(200,100);
		tiles[3] = new Tile(2,3,false,50, 50); //ML
		tiles[3].setLocation(100,150);
		tiles[4] = new Tile(4,1,true,50, 50);  //MR
		tiles[4].setLocation(200,150);
		tiles[5] = new Tile(4,1,false,50, 50); //BL
		tiles[5].setLocation(100,200);
		tiles[6] = new Tile(2,3,false,50, 50); //BM
		tiles[6].setLocation(150,200);
		tiles[7] = new Tile(3,2,false,50, 50); //BR
		tiles[7].setLocation(200,200);
		EmptyTile empty = new EmptyTile(150,150,50, 50); //MM
		PuzzlePieces pp = new PuzzlePieces(tiles, empty);
		return pp;
	}
	
	
	@Test
	void testSetup() {
		Tile[] tiles = new Tile[8];
		tiles[0] = new Tile(1,4,false,50, 50); //TL
		tiles[0].setLocation(100,100);
		tiles[1] = new Tile(1,4,true, 50, 50); //TM
		tiles[1].setLocation(150,100);
		tiles[2] = new Tile(3,2,false,50, 50); //TR
		tiles[2].setLocation(200,100);
		tiles[3] = new Tile(2,3,false,50, 50); //ML
		tiles[3].setLocation(100,150);
		tiles[4] = new Tile(4,1,true,50, 50);  //MR
		tiles[4].setLocation(200,150);
		tiles[5] = new Tile(4,1,false,50, 50); //BL
		tiles[5].setLocation(100,200);
		tiles[6] = new Tile(2,3,false,50, 50); //BM
		tiles[6].setLocation(150,200);
		tiles[7] = new Tile(3,2,false,50, 50); //BR
		tiles[7].setLocation(200,200);
		EmptyTile empty = new EmptyTile(150,150,50, 50); //MM
		PuzzlePieces pp = new PuzzlePieces(tiles, empty);
	}
	
	
	@Test
	void testGetTiles() {
		PuzzlePieces pp = this.setup();
		pp.getTiles();
	}	
	
	@Test
	void testGetEmpty() {
		PuzzlePieces pp = this.setup();
		pp.getEmpty();
	}
	
	@Test
	void testSwampEmptyTile() {
		PuzzlePieces pp = this.setup();
		Tile tile = new Tile(1,1,100,100);
		tile.setLocation(2, 10);
		pp.swapEmptyTile(tile);
		assertEquals(2,pp.getEmpty().getColumn());
		assertEquals(10,pp.getEmpty().getRow());
	}
	
	@Test
	void testIsNextToEmpty() {
		PuzzlePieces pp = this.setup();
		assertTrue(pp.nextToEmpty(pp.getTiles()[1]));
		assertTrue(pp.nextToEmpty(pp.getTiles()[3]));
		assertTrue(pp.nextToEmpty(pp.getTiles()[4]));	
		assertTrue(pp.nextToEmpty(pp.getTiles()[6]));
		assertFalse(pp.nextToEmpty(pp.getTiles()[0]));
	}

}
