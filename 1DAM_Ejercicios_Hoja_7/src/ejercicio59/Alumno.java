package ejercicio59;

public class Alumno {

	public static final double NO_HAY_NOTA = -1;

	private String nombre = "";
	private double[] notas = new double[3]; // se podría inicializar aquí
											// con = {-1, -1, -1} pero mejor en el constructor

	public Alumno(String nombre)
	{
		this.nombre = nombre;
		notas[0] = NO_HAY_NOTA;
		notas[1] = NO_HAY_NOTA;
		notas[2] = NO_HAY_NOTA;
		// en este caso lo inicializamos a mano, pero si el array tiene gran tamaño mejor hacerlo con un FOR
		/*
		 * se podría dejar arriba como private double[] notas;
		 * y aquí hacerlo como notas = new double[] {-1, -1, -1}
		 */
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
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

		for(int i = 0; i < notas.length; i++)
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
		if(numeroNotas() == 0)
		{
			return -1;
		}

		double max = NO_HAY_NOTA;

		for(int i = 0; i < notas.length; i++)
		{
			if(notas[i] > max)
			{
				max = notas[i];
			}
		}
		return max;
	}

	public boolean tieneNota(int evaluacion)
	{
		if(evaluacion < 1 || evaluacion > 3 || notas[evaluacion - 1] == NO_HAY_NOTA)
		{
			return false;
		}
		return true;

		/*
		 * se podría quitar el notas[evaluacion... del IF
		 * y poner en vez de 'return true':
		 *
		 * return !(notas[evaluacion - 1] == NO_HAY_NOTA);
		 */
	}

	public double getNota(int evaluacion)
	{
		if(!tieneNota(evaluacion))
		{
			return NO_HAY_NOTA;
		}
		return notas[evaluacion - 1];
	}
}
