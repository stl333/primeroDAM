package ejercicio38;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();

		int[][] tabla = new int[4][4];

		for (int i = 0; i < tabla.length; i++)
		{
			for (int j = 0; j < tabla[0].length; j++)
			{
				tabla[i][j] = random.nextInt(100);
			}
		}

		for (int i = 0; i < tabla.length; i++)
		{
			for (int j = 0; j < tabla[0].length; j++)
			{
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}

		boolean repetido = false;


		int fila = 0;
		int columna = 0;
		int cont = 0;


		while (cont < tabla.length * tabla[0].length && !repetido)
		{
			for (int i = fila; i < tabla.length && !repetido; i++)
			{
				for (int j = columna; j < tabla[0].length && !repetido; j++)
				{
					if(tabla[fila][columna] == tabla[i][j] && (fila != i || columna != j))
					{
						repetido = true;
					}
				}
			}

			if(columna < tabla[0].length - 1)
			{
				columna++;
				cont++;
			}
			else
			{
				fila++;
				columna = 0;
				cont++;
			}
		}

		// esto hace lo mismo pero con un FOR
		/*
		for(int fila = 0; fila < tabla.length && !repetido; fila++)
		{
			for(int columna = 0; columna < tabla[0].length && !repetido; columna++)
			{
				for (int i = fila; i < tabla.length && !repetido; i++)
				{
					for (int j = columna; j < tabla[0].length && !repetido; j++)
					{
						if(tabla[fila][columna] == tabla[i][j] && (fila != i || columna != j))
						{
							repetido = true;
						}
					}
				}
			}
		}*/

		if(!repetido)
		{
			System.out.println("NO HAY REPETIDOS.");
		}
		else
		{
			System.out.println("HAY REPETIDOS.");
		}
	}
}
