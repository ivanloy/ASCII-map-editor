package ivanloy.asciimap.program;

public class AsciiMapEditor {

	public static void main(String[] args) {
		
		final short ROWS = 70;
		final short COLS = 40;
		
		Grid grid = new Grid(ROWS, COLS); //CREAR GRID
		
		System.out.println(  "+==============================+\n"
						   + "|            DRAW              |\n"
						   + "+==============================|\n"
						   + "|                              |\n"
						   + "|      1. Horizontal line      |\n"
						   + "|      2. Vertical line        |\n"
						   + "|      3. Box                  |\n"
						   + "|      0. Exit                 |\n"
						   + "|                              |\n"
						   + "+==============================+\n" );
		
		System.out.println(  "==============================\n"
						   + "|            DRAW            |\n"
						   + "==============================\n"
						   + "|     1. Horizontal line     |\n"
						   + "|     2. Vertical line       |\n"
						   + "|     3. Box                 |\n"
						   + "|                            |\n"
						   + "|     0. Exit                |\n"
						   + "==============================\n" );
	}

}