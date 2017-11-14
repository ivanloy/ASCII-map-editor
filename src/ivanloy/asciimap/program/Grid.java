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
			case 7 : System.out.print("╬"); break;
			
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
		
		tile[x][y] = 3;                                             //╔
		hLine((short)(x+1), y, (short)(width-2));                   //═
		hLine((short)(x+1), (short)(y+height-1), (short)(width-2)); //═
		tile[x+width-1][y] = 4;                                     //╗
		vLine(x, (short)(y+1), (short)(height-2));                  //║
		vLine((short)(x+width-1), (short)(y+1), (short)(height-2)); //║
		tile[x][y+height-1] = 5;                                    //╚
		tile[x+width-1][y+height-1] = 6;                            //╝
		
	}
	
	public void hLine(short x, short y, short length) {
		
		for(short i = x; i < x + length; i++) {
			
			if(tile[i][y] == 2) tile[i][y] = 7; //╬
			else tile[i][y] = 1;                //═
			
		}
		
	}
	
	public void vLine(short x, short y, short length) {
		
		for(short i = y; i < y + length; i++) {
			
			if(tile[x][i] == 1) tile[x][i] = 7; //╬
			else tile[x][i] = 2;                //║
			
		}
		
	}

}
