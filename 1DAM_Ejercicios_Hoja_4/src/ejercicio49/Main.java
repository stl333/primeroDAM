package ejercicio49;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadena: ");
		String cadena = sc.nextLine();
		sc.close();
		
		// Si se meten números, no sufren modificación
		String cadenaMayusculas = cadena.toUpperCase();
		
		// Podríamos ahorrarnos el cadenaMayusculas si hacemos un IF así:
		// if(cadena.toUpperCase().equals(cadena))
		if(cadenaMayusculas.equals(cadena))
		{
			System.out.println("Está todo en mayúsculas.");
		}
		else
		{
			System.out.println("No está todo en mayúsculas.");
		}

	}

}
