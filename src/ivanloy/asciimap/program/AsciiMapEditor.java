package ivanloy.asciimap.program;

import java.util.Scanner;

public class AsciiMapEditor {

	public static void main(String[] args) {
		
		final short WIDTH = 8;
		final short HEIGHT = 8;
		int casilla = 0;
		int random = 0;
		int suma = 0;
		Scanner scanner = new Scanner(System.in);
		
		//Grid grid = new Grid(ROWS, COLS); //CREAR GRID
		Board board = new Board(WIDTH, HEIGHT);
		
		/*System.out.println(  "+==============================+\n"
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
						   + "==============================\n" );*/
		
		board.setBoard();
		
		while(true) {
			
			board.cleanBoardTile(casilla);
		
			System.out.println("Pulse cualquier tecla para continuar...");
			
			scanner.next(); 
			
			suma = Board.throwDices(1);
			
			System.out.println("Sacaste un " + suma);
			casilla += suma;
			
			while(casilla > WIDTH * 2 + HEIGHT * 2 - 4 - 1) casilla -= WIDTH * 2 + HEIGHT * 2 - 4; 
			
			board.writeBoardTile(casilla);
			
			board.printBoard();
			
		}
		
	}
		
	

}