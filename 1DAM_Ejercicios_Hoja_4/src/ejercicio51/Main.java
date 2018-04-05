package ejercicio51;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce frase: ");
		String frase = sc.nextLine();
		sc.close();

		for(int i = 0; i < frase.length(); i++)
		{
			if(frase.charAt(i) != 'a')
			{
				System.out.print(frase.charAt(i));
			}
		}

	}

}
