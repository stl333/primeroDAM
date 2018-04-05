package ejercicio47;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce cadena 1: ");
		String cadena1 = sc.nextLine();
		System.out.println("Introduce cadena 2: ");
		String cadena2 = sc.nextLine();
		sc.close();

		int max;
		boolean cadena2Menor;
		if(cadena1.length() > cadena2.length() ||
				cadena1.length() == cadena2.length())
		{
			max = cadena2.length();
			cadena2Menor = true;
		}
		else
		{
			max = cadena1.length();
			cadena2Menor = false;
		}

		for(int i = 0; i < max; i++)
		{
			System.out.print(cadena1.charAt(i) + "" + cadena2.charAt(i));

		}

		if(cadena2Menor)
		{
			for(int i = max; i < cadena1.length(); i++)
			{
				System.out.print(cadena1.charAt(i));
			}
		}
		else
		{
			for(int i = max; i < cadena2.length(); i++)
			{
				System.out.print(cadena2.charAt(i));
			}
		}
	}

}
