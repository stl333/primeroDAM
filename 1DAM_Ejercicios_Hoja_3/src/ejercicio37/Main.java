package ejercicio37;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[][] numeros = new int[6][4];
		Random random = new Random();

		int suma;
		int indiceMax = 0;
		int max = 0;

		// almacenamos el array y vamos calculando las sumas de cada fila
		for(int i = 0; i < numeros.length; i++)
		{
			suma = 0;
			for(int j = 0; j < numeros[0].length; j++)
			{
				numeros[i][j] = random.nextInt(10) + 1;
				suma += numeros[i][j];
			}
			System.out.println(suma);

			// aquí con NO poner >=, en el momento que un valor tome el máximo, si hay otro con ese valor, no entrará en el if
			// por lo que se imprimiría la primera de las filas con ese valor
			if(suma > max)
			{
				max = suma;
				indiceMax = i;
			}
		}

		System.out.println("La fila con más suma es " + indiceMax + " con un valor de " + max + ".");


		/* esto no lo pide el ejercicio, imprimimos la tabla y los resultados para comprobar
		que está bien hecho */

		System.out.println("\n");

		for(int i = 0; i < numeros.length; i++)
		{
			for(int j = 0; j < numeros[0].length; j++)
			{
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
