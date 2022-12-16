
public class PruebaMatrices {

	public static void main(String[] args) {
		int[][] notas1 = new int [30][6];
		int notas2[][] = {
			{5,6,7},
			{7,6,5},
			{1,2,3},
			{10,10,9},
		};//arrays
		
		//recorremos una matriz y la sacamos por pantalla:
		
		for(int i=0; i<notas2.length; i++) {
			for(int j=0; j<notas2[i].length;j++) {
				System.out.print(notas2[i][j] +" ");
			}//for
			System.out.println();
		}//for
		

	}//main

}//class
