package ejercicio43;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] cadena = new String[5];

		for(int i = 0; i < cadena.length; i++)
		{
			System.out.print("Cadena " + (i + 1) + ": ");
			cadena[i] = sc.nextLine();
		}
		sc.close();

		String aux;
		boolean ordenado = false;;

		for(int i = 0; i < cadena.length - 1 && !ordenado; i++)
		{
			ordenado = true;

			for(int j = 0; j < cadena.length - 1 - i; j++)
			{
				if(cadena[j].compareToIgnoreCase(cadena[j+1]) > 0)
				{
					aux = cadena[j];
					cadena[j] = cadena[j+1];
					cadena[j+1] = aux;

					ordenado = false;
				}
			}
		}

		for(int i = 0; i < cadena.length; i++)
		{
			System.out.println(cadena[i]);
		}
	}

}
