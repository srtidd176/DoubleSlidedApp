package starter.controller;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import starter.boundary.DoubleSlidedApp;
import starter.boundary.PuzzleView;
import starter.model.EmptyTile;
import starter.model.Model;
import starter.model.Tile;

	
public class MoveController extends MouseAdapter {
	DoubleSlidedApp app;
	Model model;
	
	
	public MoveController(DoubleSlidedApp app, Model model) {
		this.app = app;
		this.model = model;
	}
	
	
	
	public void findTile(Point p) {
		for(int i = 0; i < this.model.getTiles().length; i++) {
			Rectangle r = this.model.getTiles()[i].getRectangle();
			if(r.contains(p)) {		//If the mouse click is inside the tile
				if(this.model.getPuzzlePieces().nextToEmpty(this.model.getTiles()[i])) {	//If tile is adjacent to empty tile
					this.model.getPuzzlePieces().swapEmptyTile(this.model.getTiles()[i]);	//Swap tile's coordinates with that of Empty tile's
					this.model.getTiles()[i].flip();
					if(this.lostGame(this.model.getTiles()[i].getFaceUpValue())) {		//Check to see if a move causes you to lose the game
						this.app.setLostGame(true);
						this.app.setGameStatusLabel("4 OF THE SAME NUMBER! GAME OVER!");	
					}
					else if(this.wonGame()) {
						this.app.setWonGame(true);
						this.app.setGameStatusLabel("YOU HAVE WON!");
					}
					this.model.updateNumMoves();		//Increase number of moves
					this.app.repaint();
				}
			}
		}
	}
	
	@Override
	public void mousePressed(MouseEvent me) {	
		
		//Check if adjacent to empty space
		//if so FLIP and move to location
		//MAKE SURE TO REFRESH THE DISPLAY

		Point p = me.getPoint();		
		if(this.app.getLostGame() == false && this.app.getWonGame() == false) {
			this.findTile(p);
		}
	}
	
	
	//Check to see if game has resulted in a lost
	public boolean lostGame(int num) {
		int total = 0;
		for(int face = 0; face < this.model.getTiles().length; face++) {
			if(num == this.model.getTiles()[face].getFaceUpValue()) {
				total++;
			}
		}
		if (total >= 4) {
			return true;
		}
		else {
		return false;
		}
	}
	
	
	//Check to see if game has been won
	public boolean wonGame() {
		for(int num = 0; num < this.model.getTiles().length; num++) {
			boolean isFinal = false;
			for(int finalNum = 0; finalNum < this.model.getFinalTiles().getFinalTiles().length; finalNum++ ) {
				if(this.model.getTiles()[num].getColumn() == this.model.getFinalTiles().getFinalTiles()[finalNum].getColumn()){
					if(this.model.getTiles()[num].getRow() == this.model.getFinalTiles().getFinalTiles()[finalNum].getRow()) {
						if(this.model.getTiles()[num].isFlipped() == this.model.getFinalTiles().getFinalTiles()[finalNum].isFlipped()){
							if(this.model.getTiles()[num].getFaceUpValue() == this.model.getFinalTiles().getFinalTiles()[finalNum].getFaceUpValue()) {
								isFinal = true;
							}
						}
					}
				}
			}
			if(isFinal == false) {
				return false;
			}
		}
		if(this.model.getEmpty().getColumn() == this.model.getFinalTiles().getFinalEmpty().getColumn()) {
			if(this.model.getEmpty().getRow() == this.model.getFinalTiles().getFinalEmpty().getRow()) {
				return true;
			}
		}
		return false;
	}
}
