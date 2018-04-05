package ejercicio59PROFESOR;

public class Alumno
{
	private String nombre;

	public final static int NO_HAY_NOTA = -1;

	private double[] notas;

	public Alumno(String nombre)
	{
		this.nombre = nombre;
		notas = new double [] {NO_HAY_NOTA, NO_HAY_NOTA, NO_HAY_NOTA};
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public boolean ponerNota(int evaluacion, double nota)
	{
		if(evaluacion < 1 || evaluacion > 3 || nota < 0 || nota > 10)
		{
			return false;
		}

		notas[evaluacion - 1] = nota;
		return true;
	}

	public boolean borrarNota(int evaluacion)
	{
		if(evaluacion < 1 || evaluacion > 3)
		{
			return false;
		}
		notas[evaluacion - 1] = NO_HAY_NOTA;
		return true;
	}

	public int numeroNotas()
	{
		int cont = 0;
		for (int i = 0; i < notas.length; i++)
		{
			if(notas[i] != NO_HAY_NOTA)
			{
				cont++;
			}
		}
		return cont;
	}

	public double notaMaxima()
	{
		double maxNota = NO_HAY_NOTA;
		for (int i = 0; i < notas.length; i++)
		{
			if(notas[i] > maxNota)
			{
				maxNota = notas[i];
			}
		}
		return maxNota;
	}

	public boolean tieneNota(int evaluacion)
	{
		if(evaluacion < 1 || evaluacion > 3)
		{
			return false;
		}

		// return !(notas[evaluacion -1] == NO_HAY_NOTA);
		if(notas[evaluacion - 1] != NO_HAY_NOTA)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public double getNota(int evaluacion)
	{
		if(evaluacion < 1 || evaluacion > 3)
		{
			return -1;
		}
		else
		{
			return notas[evaluacion - 1];
		}
	}

}
