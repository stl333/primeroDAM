package ejercicio69;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args)
	{
		final int NUM = 5;
		int[] enteros = new int[NUM];
		int posicion = 0;

		Scanner sc = new Scanner(System.in);

		int cont = 0;
		int divisor = 0;

		while(cont < NUM)
		{
			try
			{
				System.out.print("Introduce una posición del array:");
				posicion = Integer.parseInt(sc.nextLine());
				System.out.print("Introduce un divisor:");
				divisor = Integer.parseInt(sc.nextLine());
				enteros[posicion] = 5 / divisor;
				cont++;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Los datos tienen que ser numéricos");
			}
			catch(ArithmeticException e)
			{
				System.out.println("El divisor no puede ser 0.");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("La posición del array tiene que estar entre 0 y 4.");
			}
		}

		System.out.println("El contenido del array de enteros es:");
		for(int valor : enteros)
		System.out.println(valor);

		
	}
}
