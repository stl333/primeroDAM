package ejercicio40mejorado;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[][] tabla = new int[3][3];

		// recorremos el array hasta llenar todos las posiciones
		for (int i = 0; i < tabla.length; i++)
		{
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.print("Número [" + i + "]["+ j + "]: ");
				tabla[i][j] = sc.nextInt();
			}
		}
		sc.close();

		if(!arrayRepetidos(tabla) &&
				filasSumanLoMismo(tabla) &&
				columnasSumanLoMismo(tabla) &&
				diagonalesSumanLoMismo(tabla))
		{
			System.out.println("ES CUADRADO MAGICO.");
		}
		else
		{
			System.out.println("NO ES CUADRADO MAGICO.");
		}
	}

	private static boolean arrayRepetidos(int[][] numeros)
	{
		boolean repetido = false;
		for(int i = 0; i < numeros.length && !repetido; i++)
		{
			for(int j = 0; j < numeros[0].length && !repetido; j++)
			{
				for (int i2 = i; i2 < numeros.length && !repetido; i2++)
				{
					for (int j2 = j; j2 < numeros[0].length && !repetido; j2++)
					{
						if(numeros[i][j] == numeros[i2][j2] && (i != i2 || j != j2))
						{
							repetido = true;
						}
					}
				}
			}
		}
		return repetido;
	}
	
	private static boolean filasSumanLoMismo(int[][] numeros)
	{
		int sumaFila = 0;
		for (int columna = 0; columna < numeros[0].length; columna++) // numeros[0] porque sumamos las columnas de la fila 0
		{
			// almacenamos la primera fila
			sumaFila += numeros[0][columna];
		}

		int sumaFilaAux;
		for (int fila = 1; fila < numeros.length; fila++) // 1 porque la 0 ya la tenemos guardada
		{
			sumaFilaAux = 0;
			for (int columna = 0; columna < numeros[0].length; columna++)
			{
				sumaFilaAux += numeros[fila][columna];
			}
			// comparamos la primera fila con las demás
			if(sumaFilaAux != sumaFila)
			{
				return false;
			}
		}
		return true;
	}
	
	private static boolean columnasSumanLoMismo(int[][] numeros)
	{
		int sumaColumna = 0;
		for (int fila = 0; fila < numeros.length; fila++)
		{
			// almacenamos la primera columna
			sumaColumna += numeros[fila][0];
		}

		int sumaColumnaAux;
		
		for (int columna = 1; columna < numeros[0].length; columna++) // 1 porque la 0 ya la tenemos guardada
		{
			sumaColumnaAux = 0;
			for(int fila = 0; fila < numeros.length; fila++)
			{
				sumaColumnaAux += numeros[fila][columna];
			}
			// comparamos la primera columna con las demás
			if(sumaColumnaAux != sumaColumna)
			{
				return false;
			}
		}
		return true;
	}
	private static boolean diagonalesSumanLoMismo(int[][] numeros)
	{
		int sumaDiagonal = 0;
		for(int i = 0; i < numeros.length; i++)
		{
			sumaDiagonal += numeros[i][i];
		}
		for(int i = 0; i < numeros.length; i++)
		{
			sumaDiagonal -= numeros[i][numeros[0].length - 1 - i];
		}
		if(sumaDiagonal == 0) // igual a 0 porque en una has ido sumando y en otra restando, por lo que si son iguales, es como
			// si la suma se "cancelase", o lo que es lo mismo, es igual a 0.
		{
			return true;
		}
		return false;
	}
}