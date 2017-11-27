package ivanloy.asciimap.program;

import java.util.Scanner;

public class AsciiMapEditor {

	public static void main(String[] args) {
		
		final short ROWS = 70;
		final short COLS = 19;
		int casilla = 0;
		int random = 0;
		int suma = 0;
		Scanner scanner = new Scanner(System.in);
		
		Grid grid = new Grid(ROWS, COLS); //CREAR GRID
		
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
		
		for(int i = 0; i < 6; i++) {
				
			grid.rect(i*6, 0, 7, 4);
			grid.rect(i*6, 15, 7, 4);
			
		}
		
		for(int i = 0; i < 5; i++) {
			
			grid.rect(0, i*3, 7, 4);
			grid.rect(30, i*3, 7, 4);
			
		}
		while(true) {
			
			if(casilla >= 0 && casilla <= 5) grid.setTile(0, casilla*6+3, 1);
			else if(casilla >= 10 && casilla <=15) grid.setTile(0, (6-casilla+10-1)*6+3, 16);
			else if(casilla >= 6 && casilla <=9) grid.setTile(0, 33, (casilla-6+1)*3+1);
			else if(casilla >= 16 && casilla <=19) grid.setTile(0, 3, (4-(casilla-16+1-1))*3+1);
		
			suma = 0;
			System.out.println("Pulse cualquier tecla para continuar...");
			
			scanner.next();
			
			random = (int)(Math.ceil(Math.random()*6));
			suma += random;
			random = (int)(Math.ceil(Math.random()*6));
			suma += random;
			
			System.out.println("Sacaste un " + suma);
			casilla += suma;
			
			while(casilla > 19) casilla-=20; 
			
			if(casilla >= 0 && casilla <= 5) grid.setTile(12, casilla*6+3, 1);
			else if(casilla >= 10 && casilla <=15) grid.setTile(12, (6-casilla+10-1)*6+3, 16);
			else if(casilla >= 6 && casilla <=9) grid.setTile(12, 33, (casilla-6+1)*3+1);
			else if(casilla >= 16 && casilla <=19) grid.setTile(12, 3, (4-(casilla-16+1-1))*3+1);
			
			grid.printGrid();
			
		}
		
	}
		
	

}