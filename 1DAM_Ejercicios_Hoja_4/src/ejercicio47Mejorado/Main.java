package ejercicio47Mejorado;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce cadena 1: ");
		String cadena1 = sc.nextLine();
		System.out.println("Introduce cadena 2: ");
		String cadena2 = sc.nextLine();
		sc.close();

		int i = 0;
		while(i < cadena1.length() && i < cadena2.length())
		{
			System.out.print(cadena1.charAt(i) + "" + cadena2.charAt(i));
			i++;
		}
		while(i < cadena1.length()) // este while y el siguiente actúan parecido a un IF
		{
			System.out.print(cadena1.charAt(i));
			i++;
		}
		while(i < cadena2.length())
		{
			System.out.print(cadena2.charAt(i));
			i++;
		}
	}
}
