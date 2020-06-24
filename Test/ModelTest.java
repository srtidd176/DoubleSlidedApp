import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import starter.model.Model;

class ModelTest extends TestCase{

	@Test
	void setup() {
		Model model = new Model();
	}
	
	@Test
	void testGetPuzzlePieces() {
		Model model = new Model();
		model.getPuzzlePieces();
	}
	
	@Test 
	void testGetTiles() {
		Model model = new Model();
		model.getTiles();
	}
	
	@Test
	void testGetEmpty() {
		Model model = new Model();
		model.getEmpty();
	}
	
	@Test
	void testGetNumMoves() {
		Model model = new Model();
		assertEquals(0,model.getNumMoves());
	}
	
	@Test
	void testSetNumMoves() {
		Model model = new Model();
		model.setNumMoves(12);
		assertEquals(12,model.getNumMoves());
	}
	
	@Test
	void testUpdateNumMoves() {
		Model model = new Model();
		model.setNumMoves(2);
		model.updateNumMoves();
		assertEquals(3,model.getNumMoves());
	}
	
	@Test
	void testGetFinalTiles() {
		Model model = new Model();
		model.getFinalTiles();
	}

	@Test
	void testResetTiles() {
		Model model = new Model();
		model.resetTiles();
	}
	
}
