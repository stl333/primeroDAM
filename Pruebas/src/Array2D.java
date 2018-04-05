
public class Array2D
{

	public static void main(String[] args)
	{
		final int FILAS = 5;
		final int COLUMNAS = 8;
		int[][] numeros = new int [FILAS][COLUMNAS];
		int cont = 0;
		
		for(int filas = 0; filas < numeros.length; filas++) 
		{
			for(int columnas = 0; columnas < numeros[0].length; columnas++)
			{
				numeros[filas][columnas] = cont;
				cont++;
			}
		}
		
		for(int filas = 0; filas < numeros.length; filas++) 
		{
			for(int columnas = 0; columnas < numeros[0].length; columnas++)
			{
				System.out.print(numeros[filas][columnas] + "\t");
			}
			System.out.println("\n\n");
		}
	}

}
