package ivanloy.asciimap.program;

public class Grid {

	short rows;
	short cols;
	private byte[][] tile;
	
	public Grid(short cols, short rows) {
		
		this.rows = rows;
		this.cols = cols;
		
		tile = new byte[cols][rows];
		
	}
	
	public void setTile(byte tile, short x, short y) {
		
		this.tile[x][y] = tile;
		
	}
	
	private void printTileChar(short x, short y){
		
		switch(tile[x][y]) {
		
			case 0 : System.out.print(" "); break;
			case 1 : System.out.print("═"); break;
			case 2 : System.out.print("║"); break;
			case 3 : System.out.print("╔"); break;
			case 4 : System.out.print("╗"); break;
			case 5 : System.out.print("╚"); break;
			case 6 : System.out.print("╝"); break;
			
		}
		
	}
	
	public void printGrid() {
		
		for(short i = 0; i < rows; i++) {
			for(short j = 0; j < cols; j++) {
			
				printTileChar(j, i);
				
			}
			System.out.println();
		}
		
	}
	
	public void rect(short x, short y, short width, short height) {
		
		//tile[col][row] = 3; //╔
		
	}
	
	public void hLine(short x, short y, short length) {
		
		for(short i = x; i < x + length; i++) {
			
			tile[i][y] = 1; //═
			
		}
		
	}
	
}
