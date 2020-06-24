package starter.model;

public class FinalConfiguration{

	Tile[] tiles;
	EmptyTile empty;
	
	public FinalConfiguration() {
		this.tiles = new Tile[8];
		this.tiles[0] = new Tile(1,4,false,50, 50);
		this.tiles[0].setLocation(100, 100);
		this.tiles[1] = new Tile(2,3,false,50, 50);
		this.tiles[1].setLocation(150, 100);
		this.tiles[2] = new Tile(3,2,false,50, 50);
		this.tiles[2].setLocation(200, 100);
		this.tiles[3] = new Tile(1,4,true,50, 50);
		this.tiles[3].setLocation(100, 150);
		this.tiles[4] = new Tile(4,1,false,50, 50);
		this.tiles[4].setLocation(200, 150);
		this.tiles[5] = new Tile(2,3,true,50, 50);
		this.tiles[5].setLocation(100, 200);
		this.tiles[6] = new Tile(3,2,true,50, 50);
		this.tiles[6].setLocation(150, 200);
		this.tiles[7] = new Tile(4,1,true,50, 50);
		this.tiles[7].setLocation(200, 200);
		this.empty = new EmptyTile(150,150,50, 50);
	}

	
	public Tile[] getFinalTiles() {
		return this.tiles;
	}
	
	
	public EmptyTile getFinalEmpty() {
		return this.empty;
	}
	
	
}

	
	
	