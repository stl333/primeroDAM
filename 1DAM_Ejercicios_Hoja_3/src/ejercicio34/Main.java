package ejercicio34;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int aux;
		int[] numeros = new int[12];
		int cont = 0;
		boolean repetido;
		
		while(cont < 12)
		{
			System.out.println("Número impar: ");
			aux = sc.nextInt();
			
			if(aux % 2 != 0)
			{
				repetido = false;
				for(int i = 0; i < cont && !repetido; i++)
				{
					if(aux == numeros[i])
					{
						repetido = true;
					}
				}
				if(!repetido)
				{
					numeros[cont] = aux;
					cont++;
				}
				else
				{
					System.out.println("REPETIDO.");
				}
			}
			else
			{
				System.out.println("NO IMPAR.");
			}
		}
		
		sc.close();
		
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}

	}

}
