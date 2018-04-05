package ejercicio57;

public class Numero {

	public final static int ASCENDENTE = 0;
	public final static int DESCENDENTE = 1;

	public static boolean esPrimo(int num)
	{
		for(int i = 2; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	private static int sumaDivisores(int num)
	{
		int suma = 0;
		for(int i = 1; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				suma += i;
			}
		}
		return suma;
	}

	public static boolean esPerfecto(int num)
	{
		return sumaDivisores(num) == num; // al estar llamandolo dentro de
		// la propia clase no hace falta poner Numero.sumaDivisores
	}

	public static boolean esCapicua(int num)
	{
		String numCadena = num + "";
		for(int i = 0; i < numCadena.length() / 2; i++)
		{
			if(numCadena.charAt(i) != numCadena.charAt(numCadena.length() - 1 - i))
			{
				return false;
			}
		}
		return true;

		/* ESTA ES LA MANERA MATEMATICA
		 * int resto = 0;
		int inverso = 0;
		int original = num;

		while(num != 0)
		{
			resto = num % 10;
			num = num / 10;
			inverso = inverso * 10 + resto;
		}

		if(inverso == original)
		{
			return true;
		}
		else
		{
			return false;
		}
		 */

	}

	public static boolean sonAmigos(int num1, int num2)
	{
		return Numero.sumaDivisores(num1) == num2 &&
				Numero.sumaDivisores(num2) == num1;
	}

	public static int[] extraeDivisores(int num)
	{
		int tamanio = 0;

		for(int i = 1; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				tamanio++;
			}
		}

		int[] divisores = new int[tamanio];
		int cont = 0;

		for(int i = 1; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				divisores[cont] = i;
				cont++;
			}
		}

		return divisores;
	}

	public static void duplica(int[] duplicados)
	{
		for(int i = 0; i < duplicados.length; i++)
		{
			duplicados[i] *= 2;
		}
	}

	/**
	 * Ordena un array numerico de manera ascendente o descendente
	 * segun se indique en la constante ASCENDENTE o DESCENDENTE
	 * @param ordenados >>> es el array a ordenar
	 * @param num >>> ASCENDENTE / DESCENDENTE
	 */
	public static void ordena(int[] ordenados, int num)
	{
		int aux;
		boolean ordenado = false;

		for(int i = 0; i < ordenados.length - 1 && !ordenado; i++)
		{
			ordenado = true;
			for(int j = 0; j < ordenados.length - 1 - i; j++)
			{
				if(num == ASCENDENTE && ordenados[j] > ordenados[j + 1]
						|| num == DESCENDENTE && ordenados[j] < ordenados[j + 1])
				{
					aux = ordenados[j];
					ordenados[j] = ordenados[j+1];
					ordenados[j+1] = aux;

					ordenado = false;
				}
			}
		}
		/*
		if(num == ASCENDENTE)
		{
			for(int i = 0; i < ordenados.length; i++)
			{
				for(int j = i; j < ordenados.length; j++)
				{
					if(ordenados[i] > ordenados[j] && i != j)
					{
						aux = ordenados[i];
						ordenados[i] = ordenados[j];
						ordenados[j] = aux;
					}
				}
			}
		}

		if(num == DESCENDENTE)
		{
			for(int i = 0; i < ordenados.length; i++)
			{
				for(int j = i; j < ordenados.length; j++)
				{
					if(ordenados[i] < ordenados[j] && i != j)
					{
						aux = ordenados[i];
						ordenados[i] = ordenados[j];
						ordenados[j] = aux;
					}
				}
			}
		}*/
	}

	public static int[] eliminaPrimos(int[] sinPrimos)
	{

		int cont = 0;

		for(int i = 0; i < sinPrimos.length; i++)
		{
			if(!esPrimo(sinPrimos[i]))
			{
				cont++;
			}
		}

		int[] primosEliminados = new int[cont];

		cont = 0;

		for(int i = 0; i < sinPrimos.length; i++)
		{
			if(!esPrimo(sinPrimos[i]))
			{
				primosEliminados[cont] = sinPrimos[i];
				cont++;
			}
		}

		return primosEliminados;
	}
}
