package ejercicio45;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String cadena;
		String max = "";

		System.out.print("Introduce cadena: ");
		cadena = sc.nextLine();

		while(!cadena.equals("fin"))
		{
			// aquí se pone >= porque pide que en caso de haber repetidas, se muestre la
			// última, si no lo pusiésemos, se quedaría almacenada la primera y no entraría
			// en el IF
			if(cadena.length() >= max.length())
			{
				max = cadena;
			}

			System.out.print("Introduce cadena: ");
			cadena = sc.nextLine();

		}
		sc.close();

		if(max.length() == 0)
		{
			System.out.println("No se ha metido ninguna cadena.");
		}
		else
		{
			System.out.println("La cadena más larga es " + max);
		}
	}
}
