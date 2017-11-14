package ivanloy.asciimap.program;

public class AsciiMapEditor {

	public static void main(String[] args) {
		
		final short ROWS = 20;
		final short COLS = 10;
		
		Grid grid = new Grid(ROWS, COLS);
		
		grid.rect((short)1, (short)2, (short)11, (short)6);
		grid.rect((short)3, (short)1, (short)7, (short)9);
		grid.rect((short)0, (short)4, (short)16, (short)3);
		
		//ajustar al borde si dos rectangulos estan al lado(juntos) IMPORTANTE
		//cvuioasdhfliasdfashasdhvhsdfhsdifhsdfsdhfuisdhuyfgsduyfhsdhfuii
		
		
		grid.printGrid();
		
	}

}
