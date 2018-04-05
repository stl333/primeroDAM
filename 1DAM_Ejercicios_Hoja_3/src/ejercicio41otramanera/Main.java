package ejercicio41otramanera;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero de filas: ");
		int fila = sc.nextInt();
		
		System.out.print("N�mero de columnas: ");
		int columna = sc.nextInt();
	
		int num;
		
		// pedimos numero inicial
		do
		{
			System.out.print("Elige entre 0 o 1: ");
			num = sc.nextInt();
		}while(num != 0 && num != 1);
		sc.close();
		
		boolean color = false;
		if(num == 1)
		{
			color = true;
		}
		
		boolean[][] ajedrez = new boolean[fila][columna];
		
		for(int i = 0; i < ajedrez.length; i++)
		{
	  		for(int j = 0; j < ajedrez[0].length; j++)
	 		{
	  			ajedrez[i][j] = color;
	  			color = !color;
	 		}
	  		if(ajedrez[0].length % 2 == 0)
	  		{
	  			color = !color;
	  		}
	  	}
		
		for(int i = 0; i < ajedrez.length; i++)
		{
			for(int j = 0; j < ajedrez[0].length; j++)
			{
				System.out.print((ajedrez[i][j] ? 1 : 0) + "\t");
			}
			System.out.println();
		}
	}
}
	
