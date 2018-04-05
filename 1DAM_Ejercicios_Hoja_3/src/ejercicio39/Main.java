package ejercicio39;
import java.util.Random;

public class Main {

	public static void main(String[] args)
	{
		Random random = new Random();

		int[] numeros = new int[10];

		// almacenamos valores en el array y lo mostramos
		for(int i = 0; i < numeros.length; i++)
		{
			numeros[i] = random.nextInt(100);
			System.out.print(numeros[i] + " ");
		}
		System.out.println();

		int aux;
		// intercambiamos posiciones (si no limitamos los movimientos a la mitad de la longitud, la segunda mitad la intercambiará
		// por la primera y tendremos el array original de nuevo
		for(int i = 0; i < numeros.length / 2; i++)
		{
			aux = numeros[i];
			numeros[i] = numeros[numeros.length - 1 - i];
			numeros[numeros.length - 1 - i] = aux;
		}

		/*OTRA MANERA
		 * for(int i = 0, j = numeros.length - 1; i < numeros.length / 2; i++, j--)
		 * {
		 * 		aux = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = aux;
		  	} */
		

		// mostramos el array cambiado
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.print(numeros[i] + " ");
		}
	}
}
