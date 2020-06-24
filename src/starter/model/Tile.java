package starter.model;

import java.awt.Rectangle;

public class Tile {
	int up;
	int down;
	boolean flipped; //if true down is shown
	int column;
	int row;
	Rectangle rec;
	
	
	public Tile(int up,int down, int tileWidth, int tileHeight) {
		this.up = up;
		this.down = down;
		this.flipped = false;
		this.rec = new Rectangle(this.column - (tileWidth/2),this.row - (tileHeight/2), tileWidth, tileHeight);
	}
	
	public Tile(int up,int down, boolean isFlipped, int tileWidth, int tileHeight) {
		this.up = up;
		this.down = down;
		this.flipped = isFlipped;
		this.rec = new Rectangle(this.column - (tileWidth/2),this.row - (tileHeight/2), tileWidth, tileHeight);
	}

	public void setLocation(int column, int row) {
		this.column = column;
		this.row = row;
		this.rec.x = this.column - (this.rec.width/2);
		this.rec.y = this.row - (this.rec.height/2);
	}
	

	public int getColumn() {
		return this.column;
	}
	
	public int getRow() {
		return this.row;
	}
	
	
	public Rectangle getRectangle() {
		return this.rec;
	}
	
	public boolean isFlipped() {
		return this.flipped;
	}
	
	public int getFaceUpValue() {
		if(this.flipped) {
			return this.down;
		}
		else {
			return this.up;
		}
	}

	public void flip() {
		this.flipped = !this.flipped;
	}
}
