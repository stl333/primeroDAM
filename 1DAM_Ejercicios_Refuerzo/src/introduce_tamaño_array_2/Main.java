package introduce_tamaño_array_2;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce nº filas: ");
		final int NUM_FILAS = sc.nextInt();
		
		System.out.print("Introduce nº columnas: ");
		final int NUM_COLUMNAS = sc.nextInt();
		
		sc.close();
		
		int[][] numeros = new int[NUM_FILAS][NUM_COLUMNAS];
		int cont = 0;
		
		// Rellenar Array empezando por última columna
		for(int columnas = numeros[0].length - 1; columnas >= 0; columnas--)
		{
			for(int filas = numeros.length - 1; filas >= 0; filas--)
			{
				numeros[filas][columnas] = cont++;
			}
		}
		
		// Mostrar Array
		for(int filas = 0; filas < numeros.length; filas++) 
		{
			for(int columnas = 0; columnas < numeros[0].length; columnas++)
			{
				System.out.print(numeros[filas][columnas] + "\t");
			}
			System.out.println("\n");
			
		}
	}
}