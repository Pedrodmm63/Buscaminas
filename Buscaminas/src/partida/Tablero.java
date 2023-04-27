package partida;

import java.util.Arrays;

public class Tablero {

	int filas = 8;
	int columnas = 8;
	
	char[][] tablero;
	
	public Tablero() {
			
		tablero = new char[filas][columnas];
		for(int i=0; i < filas; i++) {
			for(int j=0; j<columnas; j++) {
				tablero[i][j] = '-';
			}
		}
	}

	@Override
	public String toString() {
		String devolver = ""; 
		for(int i=0; i < filas; i++) {
			for(int j=0; j<columnas; j++) {
				devolver += tablero[i][j];
			}
			devolver += "\n";
		}
		return devolver ;
	}
	
	
	
}	
