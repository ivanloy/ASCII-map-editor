package ivanloy.asciimap.program;

public class Board {
	
	int width;
	int height;
	Grid grid;
	
	public Board(int width, int height) {
		
		this.width = width;
		this.height = height;
		System.out.println((short)(width*6)+ ", " + (short)(height*3));
		grid = new Grid((short)(width*7), (short)(height*3+1));
		
	}
	
	
	
	
	static public int throwDices(int numTimes) {
		
		double random;
		int suma = 0;
		
		for(int i = 0; i < numTimes; i++) {
			
			random = (int)(Math.ceil(Math.random()*6));
			suma += random;
			
		}
		
		
		return suma;
		
	}
	
	public void setBoard() {
		
		for(int i = 0; i < width; i++) {
			
			grid.rect(i*6, 0, 7, 4);
			grid.rect(i*6, (height-1)*3, 7, 4);
			
		}
		
		for(int i = 0; i < height; i++) {
			
			grid.rect(0, i*3, 7, 4);
			grid.rect((width-1)*6, i*3, 7, 4);
			
		}
		
	}
	
	public void cleanBoardTile(int tile) {
		
		if(tile >= 0 && tile < width) grid.setTile(0, tile * 6 + 3, 1);
		else if(tile >= width && tile < width + height - 2) grid.setTile(0, 3 + 6 *(width-1), (tile-width+1) * 3 + 1);
		else if(tile >= width + height - 2 && tile < width * 2 + height - 2) grid.setTile(0, (width - 1 - tile + width + height - 2) * 6 + 3, (height-1) * 3 + 1); //QUEDAN ESTAS DOS, ARRIBA Y ABAJO
		else grid.setTile(0, 3, (height - 3 - tile + width * 2 + height - 2 + 1) * 3 + 1);
		
	}
	
	public void writeBoardTile(int tile) {
		
		if(tile >= 0 && tile < width) grid.setTile(12, tile*6+3, 1);
		else if(tile >= width && tile < width + height - 2) grid.setTile(12, 3+6*(width-1), (tile-width+1)*3+1);
		else if(tile >= width + height - 2 && tile < width * 2 + height - 2) grid.setTile(12, (width - 1 - tile + width + height - 2) * 6 + 3, (height-1) * 3 + 1);
		else grid.setTile(12, 3, (height - 3 - tile + width * 2 + height - 2 + 1) * 3 + 1);
		
	}
	
	public void printBoard() {
		
		grid.printGrid();
		
	}
	
}
