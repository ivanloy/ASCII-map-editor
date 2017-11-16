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
			case 8 : System.out.print("╠"); break;
			case 9 : System.out.print("╣"); break;
			case 10 : System.out.print("╦"); break;
			case 11 : System.out.print("╩"); break;
			
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
	
<<<<<<< HEAD
	public void rect(int x, int y, int width, int height) {
		
		rect((short)x, (short)y, (short)width, (short)height);
		
	}
=======
>>>>>>> 1fd89b554e0819aa06aacc6891b641d8514c1041
	public void rect(short x, short y, short width, short height) { //COMENTAR MEJOR TODO ESTO
		
		if(tile[x][y] == 2 || tile[x][y] == 5) tile[x][y] = 8;
		else if(tile[x][y] == 1 || tile[x][y] == 4) tile[x][y] = 10;  
		else if(tile[x][y] == 6 || tile[x][y] == 9 || tile[x][y] == 11 || tile[x][y] == 7) tile[x][y] = 7; //╬
		else tile[x][y] = 3;                                             //╔
		
		hLine((short)(x+1), y, (short)(width-2));                   //═
		hLine((short)(x+1), (short)(y+height-1), (short)(width-2)); //═
		
		if(tile[x+width-1][y] == 2 || tile[x+width-1][y] == 6) tile[x+width-1][y] = 9;
		else if(tile[x+width-1][y] == 1 || tile[x+width-1][y] == 3) tile[x+width-1][y] = 10;  //╦
		else if(tile[x+width-1][y] == 5 || tile[x+width-1][y] == 8 || tile[x+width-1][y] == 11 || tile[x+width-1][y] == 7) tile[x+width-1][y] = 7;
		else tile[x+width-1][y] = 4;                                     //╗
		
		vLine(x, (short)(y+1), (short)(height-2));                  //║
		vLine((short)(x+width-1), (short)(y+1), (short)(height-2)); //║
		
		if(tile[x][y+height-1] == 2 || tile[x][y+height-1] == 3) tile[x][y+height-1] = 8;        //╠
		else if(tile[x][y+height-1] == 1 || tile[x][y+height-1] == 6) tile[x][y+height-1] = 11;  //╩
		else if(tile[x][y+height-1] == 4 || tile[x][y+height-1] == 9 || tile[x][y+height-1] == 10 || tile[x][y+height-1] == 7) tile[x][y+height-1] = 7;
		else tile[x][y+height-1] = 5;                                    //╚
		
		if(tile[x+width-1][y+height-1] == 2 || tile[x+width-1][y+height-1] == 4) tile[x+width-1][y+height-1] = 9; //╣
		else if(tile[x+width-1][y+height-1] == 1 || tile[x+width-1][y+height-1] == 5) tile[x+width-1][y+height-1] = 11;
		else if(tile[x+width-1][y+height-1] == 3 || tile[x+width-1][y+height-1] == 8 || tile[x+width-1][y+height-1] == 10 || tile[x+width-1][y+height-1] == 7) tile[x+width-1][y+height-1] = 7;
		else tile[x+width-1][y+height-1] = 6;                            //╝
		
	}
	
	public void hLine(short x, short y, short length) { //HACER CAMBIOS PARA CUANDO SE ENCUENTRAN CON ESQUINAS Y PARA LIMITES SIN CUADRADO
		
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