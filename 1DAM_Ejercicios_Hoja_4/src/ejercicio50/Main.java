package ejercicio50;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce cadena: ");
		String cadena = sc.nextLine();
		String[] cadenaArray = cadena.split("");
		
		// estas dos líneas se pueden simplificar en:
		// String[] cadenaArray = sc.nextLine().split(" ");
		
		for (int i = cadenaArray.length - 1; i >= 0; i--) 
		{
			System.out.print(cadenaArray[i]+ " ");
		}

	}

}
