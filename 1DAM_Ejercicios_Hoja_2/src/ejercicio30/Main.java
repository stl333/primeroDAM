package ejercicio30;
import java.util.Random;

public class Main
{

	public static void main(String[] args)
	{
		Random random = new Random();
		
		int[] numeros = new int[10];
		int cont = 0;
		int aux;
		boolean repetido;
		
		while(cont < numeros.length)
		{
			// 100 es el número del rango, pero va del 0 al 99, por lo que sumamos 1 al número generado y así irá
			// del 1 a 100 (el ejercicio pide del 1-100)
			aux = random.nextInt(100) + 1;
			
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
				// Lo guarda en la posición cont y después suma 1
				/* Es igual que poner:
				 * numeros[cont] = aux;
				 * cont++;
				 */
				numeros[cont++] = aux;
			}
		}
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
	}

}
