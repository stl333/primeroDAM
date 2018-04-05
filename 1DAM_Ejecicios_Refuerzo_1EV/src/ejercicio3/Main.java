package ejercicio3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Filas: ");
		int fila = sc.nextInt();
		System.out.println("Columnas: ");
		int columna = sc.nextInt();
		sc.close();
		
		int[][] tabla = new int[fila][columna];
		int num = 1;
		
		for (int j = tabla[0].length - 1; j >= 0; j--) 
		{
			for(int i = tabla.length - 1; i >= 0; i--)
			{
				tabla[i][j] = num++;
			}
		}
		for(int i = 0; i < tabla.length; i++)
		{
			for(int j = 0; j < tabla[0].length; j++)
			{
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
