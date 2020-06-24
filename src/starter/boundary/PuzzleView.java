package starter.boundary;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import starter.model.Model;
import starter.model.PuzzlePieces;
import starter.model.Tile;
import starter.model.EmptyTile;

public class PuzzleView extends JPanel {

	Tile tile;
	EmptyTile empty;
	PuzzlePieces pieces;
	DoubleSlidedApp app;
	Model model;
	/**
	 * Create the panel.
	 */

	public PuzzleView(Model model, DoubleSlidedApp app) {
		this.pieces = model.getPuzzlePieces();
		this.empty = this.pieces.getEmpty();
		this.app = app;
		this.model = model;
	}

	@Override
	public void paintComponent(Graphics g) {
		Tile[] tiles = this.pieces.getTiles();
		g.setColor(Color.black);
		for(int i = 0; i < tiles.length; i++) {
			this.tile = tiles[i];
			if(this.tile.isFlipped()) {
				g.setColor(Color.GRAY);
			}
			else {
				g.setColor(Color.LIGHT_GRAY);
			}
			
			g.fillRect((int)this.tile.getRectangle().x, (int)this.tile.getRectangle().y, this.tile.getRectangle().width, this.tile.getRectangle().height);
			g.setColor(Color.BLACK);
			g.drawString(String.valueOf(this.tile.getFaceUpValue()), this.tile.getColumn(), this.tile.getRow());
			
		}
		
		g.setColor(Color.yellow);
		g.fillRect(this.empty.getRectangle().x, this.empty.getRectangle().y, this.empty.getRectangle().width, this.empty.getRectangle().height);
	
		this.app.getNumMovesLabel().setText("Number Of Moves: " + this.model.getNumMoves());
	}
	
	
}
