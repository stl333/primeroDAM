package ejercicio36x2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int num;
		boolean[] numeros = new boolean[10]; // tendrá las posiciones 0-9
		boolean todosIntroducidos = false;

		while(!todosIntroducidos)
		{
			System.out.println("Número del 1-10: ");
			num = sc.nextInt();

			if(num >= 1 && num <= 10)
			{
				numeros[num - 1] = true; // el 1 se almacenará en el 0, el 2 en el 1,...
			}

			todosIntroducidos = true;
			for(int i = 0; i < numeros.length && todosIntroducidos; i++)
			{
				if(!numeros[i])
				{
					todosIntroducidos = false;
				}
			}
			if(todosIntroducidos)
			{
				System.out.println("TODOS INTRODUCIDOS.");
			}
		}
		sc.close();
	}
}
