package ejercicio53;

public class Nombres {

	// Atributos de clase

	private String[] nombres; // a este nivel aún no se ha creado el array
	private int cont; // con el private no es accesible desde fuera de este archivo

	// Constructor

	public Nombres(int max)
	{
		nombres = new String[max]; // aquí se ha creado el array
		cont = 0;
	}

	// Metodos. Nos permiten hacer operaciones en el objeto

	public boolean anadir(String nombre)
	{
		if(cont == nombres.length)
		{
			return false; // con esto se sale del metodo, por lo que no hace falta un ELSE
		}

		for(int i = 0; i < cont; i++) // al no haber boolean, no podemos "cortar" el FOR cuando haya
										// un repetido
		{
			if(nombre.equals(nombres[i]))
			{
				return false; // en caso de que haya repetido, se saldría del método
								// por lo que no es necesario hacerlo con booleans 'repetido'
			}
		}
		nombres[cont] = nombre;
		cont++;
		return true;
	}

	public boolean eliminar(String nombre)
	{
		int posicionEliminar = 0;
		boolean encontrado = false;

		for(int i = 0; i < cont && !encontrado; i++)
		{
			if(nombre.equals(nombres[i]))
			{
				posicionEliminar = i;
				encontrado = true;
			}
		}

		if(!encontrado)
		{
			return false;
		}

		for(int i = posicionEliminar; i < cont - 1; i++) 	// si no ponemos el '-1' cuando el array est�
															// lleno, al hacer 'i+1' se saldr� de este
															// y dar� error
		{
			nombres[i] = nombres[i+1];
		}

		cont--;
		return true;
	}

	public void vaciar()
	{
		cont = 0;
	}

	public String mostrar(int posicion)
	{
		if(posicion < 0 || posicion >=  cont)
		{
			return null;
		}
		return nombres[posicion];
	}

	public int numNombres()
	{
		return cont;
	}

	public int maxNombres()
	{
		return nombres.length;
	}

	public boolean estaLlena()
	{
		if(cont == nombres.length)
		{
			return true;
		}
		return false;
	}

	public boolean buscar(String buscar) // por cambiarle el nombre
	{
		for (int i = 0; i < cont; i++) {
			if(buscar.equals(nombres[i]))
			{
				return true;
			}
		}
		return false;
	}
}
