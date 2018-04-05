package ejercicio60;

public class Calcula {

	private Calcula() // crear el metodo privado para que no sea llamado desde fuera
	{

	}

	public static int mayor(int ... num)
	{
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < num.length; i++)
		{
			if(num[i] > max)
			{
				max = num[i];
			}
		}
		return max;
	}

	public static double mayor(double ... num)
	{
		double max = Double.MIN_VALUE;

		for(int i = 0; i < num.length; i++)
		{
			if(num[i] > max)
			{
				max = num[i];
			}
		}
		return max;
	}

	public static String mayor(String ... cadena)
	{
		String max = "";

		for(int i = 0; i < cadena.length; i++)
		{
			if(cadena[i].length() > max.length())
			{
				max = cadena[i];
			}
		}

		return max;
	}

	public static int menor(int ... num)
	{
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < num.length; i++)
		{
			if(num[i] < min)
			{
				min = num[i];
			}
		}
		return min;
	}

	public static double menor(double ... num)
	{
		double min = Double.MAX_VALUE;

		for(int i = 0; i < num.length; i++)
		{
			if(num[i] < min)
			{
				min = num[i];
			}
		}
		return min;
	}

	public static String menor(String ... cadena)
	{
		String min = cadena[0]; // tambien valdria para el maximo

		for(int i = 1; i < cadena.length; i++)
		{
			if(cadena[i].length() < min.length())
			{
				min = cadena[i];
			}
		}

		return min;
	}

}
