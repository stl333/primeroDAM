package ejercicio36;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int aux;
		int cont = 0;
		boolean encontradaPos;
		int posColocado;


		while(cont < numeros.length)
		{
			System.out.println("Números del 1-10: ");
			aux = sc.nextInt();

			// si el número está en el rango entramos
			if(aux >= 1 && aux <= 10)
			{
				posColocado = 0;

				encontradaPos = false;

				// ES IGUAL QUE EL 31 PERO CON FOR EN VEZ DE WHILE

				// damos tantas vueltas como posiciones hayamos metido(cont)
				// en el momento en el que sepamos donde colocar el número, el FOR para

				// a diferencia del WHILE del ejercicio31, este FOR se ejecuta hasta que la condición del IF
				// es CIERTA
				for(int i = 0; i < cont && !encontradaPos; i++)
				{
					// ORDEN DESCENDENTE
					// el for va avanzando hasta que el número de la derecha es más pequeño o igual que el y guarda
					// la posición
					// si en vez de >= pusiésemos > el número se quedaría en la posición de antes, por lo que si estuviese repetido
					// no nos aparecería

					if(aux >= numeros[i])
					{
						posColocado = i;
						encontradaPos = true;
					}
				}
				if(aux == numeros[posColocado])
				{
					System.out.println("REPETIDO.");
				}
				else
				{
					// el for irá haciendo hueco hasta que lleguemos a la posición de colocado
					// va moviendo los números a la derecha
					for(int j = cont - 1; j >= posColocado; j--)
					{
						numeros[j+1] = numeros[j];
					}
					numeros[posColocado] = aux;
					cont++;
				}
				// Mostramos array
				for(int j = 0; j < cont; j++)
				{
					System.out.println(numeros[j]);
				}
			}
			else
			{
				System.out.println("FUERA DE RANGO.");
			}
		}
		sc.close();
	}
}
