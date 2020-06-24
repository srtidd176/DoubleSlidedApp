package starter.model;

public class PuzzlePieces {
	Tile tiles[];
	EmptyTile empty;

	
	public PuzzlePieces( Tile tiles[], EmptyTile empty) {
		this.tiles = tiles;
		this.empty = empty;
	}
	
	public boolean nextToEmpty(Tile tile) {
		if (tile.getColumn() + tile.getRectangle().width == this.empty.getColumn() && tile.getRow() == this.empty.getRow()) {
			return true;
		}
		else if (tile.getColumn() - tile.getRectangle().width == this.empty.getColumn() && tile.getRow() == this.empty.getRow()) {
			return true;
		}
		else if (tile.getColumn()  == this.empty.getColumn() && tile.getRow() + tile.getRectangle().height == this.empty.getRow()) {
			return true;
		}
		else if (tile.getColumn()  == this.empty.getColumn() && tile.getRow() - tile.getRectangle().height == this.empty.getRow()) {
			return true;
		}
		return false;
	}
	
	public void swapEmptyTile(Tile tile) {
		int tempC = tile.getColumn();
		int tempR = tile.getRow();
		tile.setLocation(this.empty.getColumn(),this.empty.getRow());
		this.empty.setLocation(tempC,  tempR);
	}
	
	public Tile[] getTiles() {
		return this.tiles;
	}
	
	public EmptyTile getEmpty() {
		return this.empty;
	}
	

}
