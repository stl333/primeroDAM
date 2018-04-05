package ejercicio28;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		final int FILAS = 3;
		final int COLUMNAS = 2;
		int[][] numeros = new int [FILAS][COLUMNAS];
		Scanner sc = new Scanner(System.in);
		
		// Introducimos los números por teclado
		for(int filas = 0; filas < numeros.length; filas++) 
		{
			for(int columnas = 0; columnas < numeros[0].length; columnas++)
			{
				System.out.print("Número [" + (filas+1) + "][" + (columnas+1) + "]: ");
				numeros[filas][columnas] = Integer.parseInt(sc.nextLine());
			}
		}
		
		int busqueda;
		// en este caso no hace falta poner = ""; porque se va a meter el valor en el do while
		// por lo que no hay que inicializarlo a = "";
		String respuesta;
		boolean encontrado;
		
		do
		{
			// Mostramos el array en cada bucle del do while
			for(int filas = 0; filas < numeros.length; filas++) 
			{
				for(int columnas = 0; columnas < numeros[0].length; columnas++)
				{
					System.out.print(numeros[filas][columnas] + "\t");
				}
				System.out.println("\n\n");
			}
			
			// Pedimos número a buscar
			System.out.print("Número a buscar: ");
			busqueda = Integer.parseInt(sc.nextLine());
			
			// Reseteamos el boolean en cada bucle del DO WHILE
			encontrado = false;
			
			// Recorremos el array buscando el número
			for(int filas = 0; filas < numeros.length && !encontrado; filas++)
			{
				for(int columnas = 0; columnas < numeros[0].length && !encontrado; columnas++)
				{
					// Si lo encuentra lo imprime indicando fila y columna
					if(busqueda == numeros[filas][columnas])
					{
						// Si queremos que esta línea se imprima fuera del FOR podemos guardar 'filas' y 'columnas' en variables 'aux'
						System.out.println("Encontrado en fila " + (filas+1) + " y columna " + (columnas+1));
						encontrado = true;
					}
					/* Esto sería válido si queremos que para cada posición nos indique si lo ha encontrado o no.
					else
					{
						System.out.println("NO encontrado en fila " + (filas+1) + " y columna " + (columnas+1));
					}*/
				}
			}
			// Si no lo encuentra también lo dice
			if(!encontrado)
			{
				System.out.println("No encontrado.");
			}
			
			// Indicamos si queremos repetir la búsqueda o no
			System.out.print("¿Quieres seguir buscando? (s/n): ");
			respuesta = sc.nextLine();
			
		// Mientras la respuesta sea 's' repetiremos el DO WHILE
		}while(respuesta.equals("s"));	
	}
}
