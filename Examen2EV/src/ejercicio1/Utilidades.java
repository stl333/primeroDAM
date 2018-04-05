package ejercicio1;

public class Utilidades {

	public static boolean hayDosParesOMas(int[] nums)
	{
		int cont = 0;
		boolean dosPares = false;

		for(int i = 0; i < nums.length && !dosPares; i++)
		{
			if(nums[i] % 2 == 0)
			{
				cont++;

				if(cont == 2)
				{
					dosPares = true;
				}
			}
		}

		if(dosPares)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean hayRepetidos(int[] nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = i; j < nums.length; j++)
			{
				if(nums[i] == nums[j] && i != j)
				{
					return true;
				}
			}
		}
		return false;
	}

	public static float valorMedio(int[] nums)
	{
		int suma = 0;

		for(int i = 0; i < nums.length; i++) // se podría hacer con un FOR EACH
		{
			suma += nums[i];
		}

		return (float)suma / nums.length;
	}

	public static int[] soloImpares(int[] nums1, int[] nums2)
	{
		int[] impares = new int[numerosImpares(nums1) + numerosImpares(nums2)];

		int iImpares = 0;

		// estos dos FOR también se podrían hacer con un método,
		// pero CUIDADO porque tendríamos que guardar la posición en la que se
		// queda el primer FOR(en el método), para saber a partir de que posicion
		// guarda los números del segundo
		for(int i = 0; i < nums1.length; i++)
		{
			if(nums1[i] % 2 != 0)
			{
				impares[iImpares] = nums1[i];
				iImpares++;
			}
		}

		for(int i = 0; i < nums2.length; i++)
		{
			if(nums2[i] % 2 != 0)
			{
				impares[iImpares] = nums2[i];
				iImpares++;
			}
		}

		return impares;
	}

	private static int numerosImpares(int[] nums)
	{
		int cont = 0;

		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] % 2 != 0)
			{
				cont++;
			}
		}
		return cont;
	}


}
