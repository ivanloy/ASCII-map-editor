package ivanloy.asciimap.program;

public class AsciiMapEditor {

	public static void main(String[] args) {
		
		final short ROWS = 20;
		final short COLS = 20;
		
		Grid grid = new Grid(ROWS, COLS);
		
		grid.hLine((short)1, (short)4, (short)7);
		
		grid.printGrid();
		
	}

}
