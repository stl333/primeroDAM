package ejercicio40;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] tabla = new int[4][4];
		int[] sumaFila = new int[tabla.length];
		int[] sumaColumna = new int[tabla[0].length];
		int[] sumaDiagonal = new int[2];
		
		int aux;
		int cont = 0;
		boolean repetido;
		int fila = 0;
		int columna = 0;
		
		// recorremos el array hasta llenar todos las posiciones
		while(cont < tabla.length * tabla[0].length)
		{
			System.out.print("Número [" + fila + "]["+ columna + "]: ");
			aux = sc.nextInt();
			
			repetido = false;	
			
			// buscamos en el array que ese número no esté ya almacenado
			for(int i = 0; i <= fila && !repetido; i++)
			{
				for(int j = 0; j < tabla[0].length && !repetido; j++)
				{
					if(aux == tabla[i][j])
					{
						repetido = true;
					}
				}
			}
			// si no está almacenado, lo almacenamos
			if(!repetido)
			{
				tabla[fila][columna] = aux;
				// vamos sumando los valores de cada fila
				sumaFila[fila] += tabla[fila][columna];
				// aumentamos en 1 la columna
				columna++;
				cont++;
				
				// en el momento en que la columna llegue al final del recorrido bajamos
				// a la fila siguiente
				if(columna == tabla.length)
				{
					columna = 0;
					fila++;
				}
			}
			else
			{
				System.out.println("REPETIDO.");
			}
		}
		
		sc.close();
		
		// almacenamos las sumas de cada columna
		for(int j = 0; j < tabla[0].length; j++)
		{
			for(int i = 0; i < tabla.length; i++)
			{
				sumaColumna[j] += tabla[i][j];
			}
		}
		System.out.println();
		
		int filaDiagonal = 0;
		int columnaDiagonal = 0;
		
		// almacenamos la suma de la diagonal 1
		while(filaDiagonal < tabla.length && columnaDiagonal < tabla[0].length)
		{
			sumaDiagonal[0] += tabla[filaDiagonal][columnaDiagonal];
			filaDiagonal++;
			columnaDiagonal++;
		}
		
		filaDiagonal = tabla.length - 1;
		columnaDiagonal = tabla[0].length - 1;
		
		// almacenamos la suma de la diagonal 2
		while(filaDiagonal >= 0 && columnaDiagonal >= 0)
		{
			sumaDiagonal[1] += tabla[filaDiagonal][columnaDiagonal];
			filaDiagonal--;
			columnaDiagonal--;
		}
		
		// mostramos la tabla
		for(int i = 0; i < tabla.length; i++)
		{
			for(int j = 0; j < tabla[0].length; j++)
			{
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		// mostramos la suma de las filas
		for(int i = 0; i < sumaFila.length; i++)
		{
			System.out.print(sumaFila[i] + " ");
		}
		System.out.println();
		
		// mostramos la suma de las columnas
		for(int i = 0; i < sumaFila.length; i++)
		{
			System.out.print(sumaColumna[i] + " ");
		}
		System.out.println();
		
		// mostramos la suma de la diagonal 1
		System.out.println(sumaDiagonal[0]);
		
		// mostramos la suma de la diagonal 2
		System.out.println(sumaDiagonal[1]);
		
		boolean cuadrado = true;
		
		// miramos si la suma de las columnas y filas son iguales
		// en el momento que una no lo sea, se saldrá del FOR
		for(int i = 0; i < tabla.length && cuadrado; i++)
		{
			for(int j = 0; j < tabla[0].length && cuadrado; j++)
			{
				if(sumaFila[i] != sumaColumna[j])
				{
					cuadrado = false;
				}	
			}
		}
		
		if(cuadrado)
		{
			// miramos si la suma de la primera fila (aquí da igual la posición, puesto que si es
			// mágico todas las sumas serán la misma, y sino, no entrará aquí) es igual a las
			// diagonales
			if(sumaFila[0] != sumaDiagonal[0] || sumaFila[0] != sumaDiagonal[1] )
			{
				cuadrado = false;
			}
			if(cuadrado)
			{
				System.out.println("CUADRADO MÁGICO.");
			}
		}
		else
		{
			System.out.println("NO ES MÁGICO.");
		}
	}
}
