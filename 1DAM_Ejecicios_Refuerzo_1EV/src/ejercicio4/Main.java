package ejercicio4;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] array = new int[19];
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = random.nextInt(200);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		boolean repetido = false;
		
		for(int i = 0; i < array.length && !repetido; i++)
		{
			for(int j = i + 1; j < array.length && !repetido; j++)
			{
				if(array[i] == array[j])
				{
					repetido = true;
				}
			}
		}
		
		if(repetido)
		{
			System.out.println("NUMEROS REPETIDOS.");
		}
		else
		{
			System.out.println("NO REPETIDOS.");
		}

	}

}
