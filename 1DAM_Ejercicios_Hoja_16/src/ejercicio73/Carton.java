package ejercicio73;

public class Carton implements ICarton {

	int[][] carton;
	private static final int NUM_TACHADO = -1;

	public Carton(int[][] carton)
	{
		this.carton = carton;
	}

	public void mostrarCarton()
	{
		for(int i = 0; i < carton.length; i++)
		{
			for(int j = 0; j < carton[0].length; j++)
			{
				if(carton[i][j] == NUM_TACHADO)
				{
					System.out.print("X\t");
				}
				else if(carton[i][j] == 0)
				{
					System.out.print("\t");
				}
				else
				{
					System.out.print(carton[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

	@Override
	public boolean tacharNumero(int numero) {

		for(int i = 0; i < carton.length; i++)
		{
			for(int j = 0; j < carton[0].length; j++)
			{
				if(carton[i][j] == numero)
				{
					carton[i][j] = NUM_TACHADO;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean hayLinea() {

		boolean linea;

		for(int i = 0; i < carton.length; i++)
		{
			linea = true;
			for(int j = 0; j < carton[0].length && linea; j++)
			{
				if(carton[i][j] != NUM_TACHADO && carton[i][j] != 0)
				{
					linea = false;
				}
			}
			if(linea)
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean hayBingo() {

		for(int i = 0; i < carton.length; i++)
		{
			for(int j = 0; j < carton[0].length; j++)
			{
				if(carton[i][j] != NUM_TACHADO && carton[i][j] != 0)
				{
					return false;
				}
			}
		}

		return true;
	}

	public static boolean esValido(int[][] carton)
	{
		if(carton.length == 3)
		{
			for(int i = 0; i < carton.length; i++)
			{
				if(carton[i].length != 9)
				{
					return false;
				}
			}
		}
		else
		{
			return false;
		}



		for(int i = 0; i < carton.length; i++)
		{

			for (int j = 0; j < carton[0].length; j++)
			{
				if(carton[i][j] < 0 || carton[i][j] > 90)
				{
					return false;
				}

				else if(carton[i][j] != 0)
				{
					for(int k = i; k < carton.length; k++)
					{
						for(int l = j; l < carton[0].length; l++)
						{
							if(carton[i][j] == carton[k][l] && (i != k || j != l))
							{
								return false;
							}
						}
					}
				}
			}
		}

		int contCero;

		for(int i = 0; i < carton.length; i++)
		{
			contCero = 0;

			for(int j = 0; j < carton[0].length; j++)
			{
				if(carton[i][j] == 0)
				{
					contCero++;
				}
			}
			if(contCero != 4)
			{
				return false;
			}
		}

		int mayorFila = 0;

		for(int i = 0; i < carton.length; i++)
		{
			for(int j = 0; j < carton[0].length; j++)
			{
				if(carton[i][j] != 0)
				{
					mayorFila = carton[i][j];

					for(int l = j; l < carton[0].length; l++)
					{
						if(j != l && carton[i][l] != 0 && carton[i][l] < mayorFila)
						{
							return false;
						}
					}
				}
			}
		}

		return true;
	}

}
