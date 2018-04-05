package ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		int cont = 0;
		boolean pares = true;
		
		System.out.println("Numero: ");
		num = sc.nextInt();
		
		while(num != 0)
		{
			if(num % 2 != 0)
			{
				pares = false;
			}	
			System.out.println("Numero: ");
			num = sc.nextInt();
			cont++;
		}
		sc.close();

		if(cont == 0)
		{
			System.out.println("No se han introducido numeros.");
		}
		else
		{
			if(pares)
			{
				System.out.println("Todos PARES.");
			}
			else
			{
				System.out.println("NO PARES.");
			}
		}
		
	}

}
