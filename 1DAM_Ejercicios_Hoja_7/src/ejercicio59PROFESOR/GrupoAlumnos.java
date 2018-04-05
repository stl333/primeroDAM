package ejercicio59PROFESOR;

public class GrupoAlumnos
{
	private Alumno[] alumnos;
	private int cont;

	public GrupoAlumnos(int numMaximo)
	{
		alumnos = new Alumno[numMaximo];
		cont = 0;
	}

	public boolean anadirAlumno(String nombre)
	{
		if(alumnos.length == cont)
		{
			return false;
		}

		for (int i = 0; i < cont; i++)
		{
			if(alumnos[i].getNombre().equalsIgnoreCase(nombre))
			{
				return false;
			}
		}
		alumnos[cont] = new Alumno(nombre);
		cont++;
		return true;

	}

	public Alumno[] getAlumnos()
	{
		Alumno[] alumnosAux = new Alumno[cont];

		for (int i = 0; i < cont; i++)
		{
			alumnosAux[i] = alumnos[i];
		}
		return alumnosAux;
	}

	public boolean estaLleno()
	{
		return cont == alumnos.length;
	}

	public boolean existeAlumno(String nombre)
	{
		for (int i = 0; i < cont; i++)
		{
			if(alumnos[i].getNombre().equalsIgnoreCase(nombre))
			{
				return true;
			}
		}
		return false;
	}


	/**
	 * Busca un alumno por su nombre
	 * @param nombre
	 * @return posición dentro del array, o -1 si no lo encuentra
	 */
	private int buscarAlumno(String nombre)
	{
		for (int i = 0; i < cont; i++)
		{
			if(alumnos[i].getNombre().equalsIgnoreCase(nombre))
			{
				return i;
			}
		}
		return -1;
	}

	public boolean ponerNota(String nombre, int evaluacion, double nota)
	{
		int posicion = buscarAlumno(nombre);

		if(posicion == -1)
		{
			return false;
		}

		if(alumnos[posicion].ponerNota(evaluacion, nota))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean borrarNota(String nombre, int evaluacion)
	{
		int posicion = buscarAlumno(nombre);
		if(posicion == -1)
		{
			return false;
		}

		if(alumnos[posicion].borrarNota(evaluacion))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean borrarAlumno(String nombre)
	{
		int posicion = buscarAlumno(nombre);
		if(posicion == -1)
		{
			return false;
		}

		for (int i = posicion; i < cont - 1; i++)
		{
			alumnos[i] = alumnos[i + 1];
		}
		cont--;
		return true;
	}

}
