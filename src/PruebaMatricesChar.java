
public class PruebaMatricesChar {

	public static void main(String[] args) {
		int FILAS=5;
		int COLUMNAS=4;
		
		char[][]tablero = new char[FILAS][COLUMNAS];
		
		//Rellenar tablero:
		for(int i=0; i<tablero.length; i++) {
			for(int j=0; j<tablero[i].length; j++) {
				if (Math.random()<0.2 ) {
					tablero[i][j]='*';
				}//if
			}//for j
		}//for i
		
		//Mostrar tablero:
		for(int i=0; i<tablero.length;i++) {
		 for(int j=0; j<tablero[i].length; j++) {
			 
		 }//for j
		}//for i
			

	}

}
