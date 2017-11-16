package ivanloy.asciimap.program;

public class AsciiMapEditor {

	public static void main(String[] args) {
		
		final short ROWS = 50;
		final short COLS = 16;
		
		Grid grid = new Grid(ROWS, COLS);
		
		grid.rect(15, 5, 10, 6); 
		grid.rect(24, 5, 12, 6);
		grid.rect(4, 5, 12, 6);
		grid.rect(15, 10, 10, 6);
		grid.rect(15, 0, 10, 6);
		grid.rect(24, 10, 12, 6);
		grid.rect(4, 0, 12, 6);
		grid.rect(24, 0, 12, 6);
		grid.rect(4, 10, 12, 6);
		
		grid.rect((short)15, (short)0, (short)10, (short)6); //CORREGIR ESTE CASO (UNO ENCIMA DE OTRO) si ╦, dejarlo
		
		
		
		
		
		grid.printGrid();
		
	}

}