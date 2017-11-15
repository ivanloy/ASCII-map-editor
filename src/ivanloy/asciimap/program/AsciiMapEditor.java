package ivanloy.asciimap.program;

public class AsciiMapEditor {

	public static void main(String[] args) {
		
		final short ROWS = 50;
		final short COLS = 16;
		
		Grid grid = new Grid(ROWS, COLS);
		
		grid.rect((short)15, (short)5, (short)10, (short)6);
		grid.rect((short)24, (short)5, (short)12, (short)6);
		grid.rect((short)4, (short)5, (short)12, (short)6);
		grid.rect((short)15, (short)10, (short)10, (short)6);
		grid.rect((short)15, (short)0, (short)10, (short)6);
		grid.rect((short)24, (short)10, (short)12, (short)6);
		grid.rect((short)4, (short)0, (short)12, (short)6);
		grid.rect((short)24, (short)0, (short)12, (short)6);
		grid.rect((short)4, (short)10, (short)12, (short)6);
		
		grid.rect((short)15, (short)0, (short)10, (short)6); //CORREGIR ESTE CASO (UNO ENCIMA DE OTRO) si ╦, dejarlo
		
		
		//ajustar al borde si dos rectangulos estan al lado(juntos) IMPORTANTE
		//cvuioasdhfliasdfashasdhvhsdfhsdifhsdfsdhfuisdhuyfgsduyfhsdhfuii
		
		
		grid.printGrid();
		
	}

}
