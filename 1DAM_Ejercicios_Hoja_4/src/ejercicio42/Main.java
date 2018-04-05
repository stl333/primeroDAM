package ejercicio42;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce cadena de caracteres: ");
		String cadena = sc.nextLine();
		sc.close();

		/*
		System.out.println("La primera letra es: " + cadena.charAt(0));
		System.out.println("La última letra es: " + cadena.charAt(cadena.length() - 1));
		*/

		for(int i = cadena.length() - 1; i >= 0; i--)
		{
			System.out.print(cadena.charAt(i));
		}
	}
}
