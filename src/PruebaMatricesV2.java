
public class PruebaMatricesV2 {

	public static void main(String[] args) {
		final int CARRERAS = 5;
		final int POSICIONES = 6;
		int[][] resultados = new int [CARRERAS][POSICIONES];
		
		//rellenamos la matriz con valores aleatorios
		for(int i=0; i<resultados.length; i++) {
			for(int j=0; j<resultados[i].length;j++) {
				resultados[i][j] = (int)(Math.random()*10+1);
			 }//for j	
			}//for i
		
		//recorremos una matriz y la sacamos por pantalla:
		
		for(int i=0; i<resultados.length; i++) {
			for(int j=0; j<resultados[i].length;j++) {
				System.out.print(resultados[i][j] +"\t");
			}//for j
			System.out.println();
		}//for i
		

	}//main

}//class
