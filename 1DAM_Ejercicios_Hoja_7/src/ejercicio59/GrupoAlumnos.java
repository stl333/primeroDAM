package ejercicio59;

public class GrupoAlumnos {

	private Alumno[] alumnos;
	private int cont; // se podria inicializar el 0 aqui

	public GrupoAlumnos(int numMaximo)
	{
		alumnos = new Alumno[numMaximo];
		cont = 0;
	}

	public boolean anadirAlumno(String nombre)
	{
		if(alumnos.length == 0)
		{
			return false;
		}

		boolean encontrado = false;

		for(int i = 0; i < cont && !encontrado; i++)
		{
			if(alumnos[i].getNombre().equalsIgnoreCase(nombre))
			{
				return false;
			}
		}
		alumnos[cont] = new Alumno(nombre);
		// alumnos[cont] = nombre; DA ERROR porque no se puede guardar
		// String en un tipo alumno
		cont++;
		return true;
	}

	public Alumno[] getAlumnos()
	{
		Alumno[] alumnosAux = new Alumno[cont];

		for(int i = 0; i < cont; i++)
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
		for(int i = 0; i < cont; i++)
		{
			if(alumnos[i].getNombre().equalsIgnoreCase(nombre))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Busca la posicion del alumno en el array
	 * @param nombre
	 * @return posicion dentro del array // -1 si no se encuentra
	 */
	private int buscarAlumno(String nombre)
	{
		for(int i = 0; i < cont; i++)
		{
			if(alumnos[i].getNombre().equalsIgnoreCase(nombre))
			{
				return i;
			}
		}
		return -1;
	}

	public boolean ponerNota(String alumno, int evaluacion, double nota)
	{
		int posicionAlumno = buscarAlumno(alumno);

		if(posicionAlumno == -1)
		{
			return false;
		}

		if(alumnos[posicionAlumno].ponerNota(evaluacion, nota))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean borrarNota(String alumno, int evaluacion)
	{
		int posicionAlumno = buscarAlumno(alumno);

		if(posicionAlumno == -1)
		{
			return false;
		}

		if(alumnos[posicionAlumno].borrarNota(evaluacion))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean borrarAlumno(String alumno)
	{
		int posicionAlumno = buscarAlumno(alumno);

		if(posicionAlumno == -1)
		{
			return false;
		}

		for(int i = posicionAlumno; i < cont - 1; i++)
		{
			alumnos[i] = alumnos[i+1];
		}

		cont--;
		return true;
	}
}
