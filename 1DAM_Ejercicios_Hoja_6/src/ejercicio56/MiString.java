package ejercicio56;

public class MiString {

	public static String alReves(String cadena)
	{
		String aux = ""; // hay que inicializarlo a algo, sino saldra 'null'

		for(int i = cadena.length() - 1; i >= 0; i--)
		{
			aux += cadena.charAt(i);
		}

		return aux;
	}

	public static String limpiaCaracteres(String cadena, String borrado)
	// probar en casa a tomar el borrado como bloque (como el metodo contains) en vez de
	// caracteres sueltos
	{
		String aux = "";
		boolean encontrado;

		for(int i = 0; i < cadena.length(); i++)
		{
			encontrado = false;

			for(int j = 0; j < borrado.length() && !encontrado; j++)
			{
				if(cadena.charAt(i) == borrado.charAt(j))
				{
					encontrado = true;
				}
			}

			if(!encontrado)
			{
				aux += cadena.charAt(i);
			}
		}

		return aux;
	}

	public static String limpiaBloque(String cadena, String borrado)
	{
		String aux = "";
		boolean bloque;

		for(int i = 0; i < cadena.length(); i++)
		{
			bloque = true;

			for(int j = 0; j < borrado.length() && bloque; j++)
			{
				if(cadena.charAt(i) == borrado.charAt(j) && j != borrado.length() - 1)
				{
					i++;
				}
				else if(cadena.charAt(i) != borrado.charAt(j))
				{
					bloque = false;
					i -= j;
				}
			}

			if(!bloque)
			{
				aux += cadena.charAt(i);
			}
		}

		return aux;
	}

	public static String sustituye(String cadena, char car1, char car2)
	// distingue entre mayúsculas y minúsculas
	{
		String aux = "";

		for(int i = 0; i < cadena.length(); i++)
		{
			if(cadena.charAt(i) == car1)
			{
				aux += car2;
			}
			else
			{
				aux += cadena.charAt(i);
			}
		}
		return aux;
	}

	public static boolean todosIguales(String cadena)
	{
		/*
		if(cadena.length() <= 1)
		{
			return false;
		} ESTO PARA EL CASO DE QUE LA CADENA TENGA 0 o 1 CARACTER*/
		for(int i = 1; i < cadena.length(); i++)
		{
			if(Character.toLowerCase(cadena.charAt(0)) != Character.toLowerCase(cadena.charAt(i)))
				// no lo pide el ejercicio, pero transformamos moment�neamente los caracteres a min�sculas
				// y as� nos dira que, por ejemplo, 'B' es igual a 'b'
				// este m�todo no hace un cambio permanente, por lo que ese caracter (al imprimirlo por ejemplo)
				// seguir� siendo como el original (may�scula o min�scula)
			{
				return false;
			}
		}
		return true;
	}

	public static String quitaEspacios(String cadena)
	{
		String aux = "";

		for(int i = 0; i < cadena.length(); i++)
		{
			if(cadena.charAt(i) != ' ')
			{
				aux += cadena.charAt(i);
			}
		}
		return aux;
	}

	public static boolean esNumeroEntero(String cadena)
	{
		for(int i = 0; i < cadena.length(); i++)
		{
			if(cadena.charAt(i) < '0' || cadena.charAt(i) > '9')
				// aqui estamos haciendo la comprobacion con los valores
				// que toman el 0 y el 9 en la tabla ASCII, no con el propip
				// valor del 0 y 9
			{
				return false;
			}
		}
		return true;
		
		// otra manera de hacerlo es crear un String con valor "0123456789"
		// y buscar caracter a caracter si (parecido a lo que hemos hecho
		// el metodo esDigito
	}
	
	public static boolean esNumeroEntero2(String cadena)
	{
		for(int i = 0; i < cadena.length(); i++)
		{
			if(!esDigito(cadena.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
	
	private static boolean esDigito(char caracter)
	{
		String digitos = "0123456789";
		boolean encontrado = false;
		
		for(int i = 0; i < digitos.length() && !encontrado; i++)
		{
			if(caracter == digitos.charAt(i))
			{
				return true;
			}
		}
		return false;
		
		/* si lo hiciesemos con el codigo ASCII nos quedaria el metodo
		 * simplemente con el return (sin el for, if, ni nada)
		 * 
		 * seria
		 * return caracter >= '0' && caracter <= '9'
		 * esto nos daría un true o false
		 */
	}

}
