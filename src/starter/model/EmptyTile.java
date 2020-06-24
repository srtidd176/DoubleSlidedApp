package starter.model;

import java.awt.Rectangle;

public class EmptyTile {
	int column;
	int row;
	Rectangle rec;

	
	public EmptyTile(int column, int row, int tileWidth, int tileHeight) {
		this.column = column;
		this.row = row;
		this.rec = new Rectangle(this.column - (tileWidth/2),this.row - (tileHeight/2), tileWidth, tileHeight);
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
	
	public void setLocation(int x, int y) {
		this.column = x;
		this.row = y;
		this.rec.x = this.column - (this.rec.width/2);
		this.rec.y = this.row - (this.rec.height/2);
	}
	
}
