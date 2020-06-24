package starter.model;

import java.awt.Rectangle;

public class Model {
	PuzzlePieces puzzlePieces;
	PuzzlePieces defaultPieces;
	FinalConfiguration finalTiles;
	
	int numMoves;
	
	public Model() {
		
		int recWidth = 50;
		int recHeight = 50;
		
		Tile[] tiles = new Tile[8];
		tiles[0] = new Tile(1,4,false,recWidth, recHeight);
		tiles[0].setLocation(100,100);
		tiles[1] = new Tile(1,4,true, recWidth, recHeight);
		tiles[1].setLocation(150,100);
		tiles[2] = new Tile(3,2,false,recWidth, recHeight);
		tiles[2].setLocation(200,100);
		tiles[3] = new Tile(2,3,false,recWidth, recHeight);
		tiles[3].setLocation(100,150);
		tiles[4] = new Tile(4,1,true,recWidth, recHeight);
		tiles[4].setLocation(150,150);
		tiles[5] = new Tile(4,1,false,recWidth, recHeight);
		tiles[5].setLocation(200,150);
		tiles[6] = new Tile(2,3,false,recWidth, recHeight);
		tiles[6].setLocation(150,200);
		tiles[7] = new Tile(3,2,false,recWidth, recHeight);
		tiles[7].setLocation(200,200);
		EmptyTile empty = new EmptyTile(100,200,recWidth, recHeight);
		this.puzzlePieces = new PuzzlePieces(tiles, empty);
		
		Tile[] tiles2 = new Tile[8];
		tiles2[0] = new Tile(1,4,false,recWidth, recHeight);
		tiles2[0].setLocation(100,100);
		tiles2[1] = new Tile(1,4,true, recWidth, recHeight);
		tiles2[1].setLocation(150,100);
		tiles2[2] = new Tile(3,2,false,recWidth, recHeight);
		tiles2[2].setLocation(200,100);
		tiles2[3] = new Tile(2,3,false,recWidth, recHeight);
		tiles2[3].setLocation(100,150);
		tiles2[4] = new Tile(4,1,true,recWidth, recHeight);
		tiles2[4].setLocation(150,150);
		tiles2[5] = new Tile(4,1,false,recWidth, recHeight);
		tiles2[5].setLocation(200,150);
		tiles2[6] = new Tile(2,3,false,recWidth, recHeight);
		tiles2[6].setLocation(150,200);
		tiles2[7] = new Tile(3,2,false,recWidth, recHeight);
		tiles2[7].setLocation(200,200);
		EmptyTile empty2 = new EmptyTile(100,200,recWidth, recHeight);
		this.defaultPieces = new PuzzlePieces(tiles2,empty2);
		
		this.finalTiles = new FinalConfiguration();
		this.numMoves = 0;
	}
	
	public PuzzlePieces getPuzzlePieces() {
		return this.puzzlePieces;
	}
	
	public Tile[] getTiles() {
		return this.puzzlePieces.getTiles();
	}
	
	public EmptyTile getEmpty() {
		return this.puzzlePieces.getEmpty();
	}
	
	public void resetTiles() {
		for(int num = 0; num < this.defaultPieces.getTiles().length; num++) {
			int column = this.defaultPieces.getTiles()[num].getColumn();
			int row = this.defaultPieces.getTiles()[num].getRow();
			this.puzzlePieces.getTiles()[num].setLocation(column, row);
			
			if(this.puzzlePieces.getTiles()[num].isFlipped() != this.defaultPieces.getTiles()[num].isFlipped()) {
				this.puzzlePieces.getTiles()[num].flip();			
			}
		}
		int column = this.defaultPieces.getEmpty().getColumn();
		int row = this.defaultPieces.getEmpty().getRow();
		this.puzzlePieces.getEmpty().setLocation(column, row);
		this.numMoves = 0;
	}
	
	public int getNumMoves() {
		return this.numMoves;
	}
	
	public void setNumMoves(int num) {
		this.numMoves = num;
	}
	
	public void updateNumMoves() {
		this.numMoves += 1;
	}

	public FinalConfiguration getFinalTiles() {
		// TODO Auto-generated method stub
		return this.finalTiles;
	}
}
