package ejercicio65;

public class Alumno implements IAlumno {

	private String nombre;
	private int[] notas;
	private int cont;

	private static final int NUM_NOTAS_MAX = 10;

	public Alumno(String nombre)
	{
		this.nombre = nombre;
		notas = new int[NUM_NOTAS_MAX];
		cont = 0;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public boolean anadeNota(int nota) {
		if(cont == NUM_NOTAS_MAX || nota < 0 || nota > 10)
		{
			return false;
		}

		notas[cont] = nota;
		cont++;
		return true;
	}

	@Override
	public int[] getNotas() {

		int[] notasMetidas = new int[cont];

		for(int i = 0; i < cont; i++)
		{
			notasMetidas[i] = notas[i];
		}

		return notasMetidas;

	}

	@Override
	public int numNotas() {
		return cont;
	}

	@Override
	public float getNotaMedia() {

		int suma = 0;

		for(int i = 0; i < cont; i++)
		{
			suma += notas[i];
		}

		if(cont == 0)
		{
			return -1;
		}

		return (float)suma / cont;

	}

	@Override
	public int getNumeroAprobados() {

		int aprobados = 0;

		for(int i = 0; i < cont; i++)
		{
			if(notas[i] >= 5)
			{
				aprobados++;
			}
		}
		return aprobados;
	}

	@Override
	public void borrarNotas() {

		cont = 0;

	}

}
