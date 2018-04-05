package ejercicio35;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int[] numeros = new int[8];
		int num;
		int cont = 0;
		boolean repetido;
		
		Random random = new Random();
		
		while(cont < numeros.length)
		{
			num = random.nextInt(10);
			repetido = false;
			
			for(int j = 0; j < cont && !repetido; j++)
			{
				if(num == numeros[j])
				{
					repetido = true;
				}
			}
			if(!repetido)
			{
				numeros[cont] = num;
				cont++;
			}
		}
		
		boolean ordenado = false;
		int aux;
		
		for(int i = 0; i < numeros.length - 1 && !ordenado; i++)
		{
			ordenado = true;
			
			for(int j = 0; j < numeros.length - 1 - i; j++)
			{
				if(numeros[j] < numeros [j+1])
				{
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
					
					ordenado = false;
				}
			}
		}
		
		for(int numLeer : numeros)
		{
			System.out.println(numLeer);
		}
	}
}
