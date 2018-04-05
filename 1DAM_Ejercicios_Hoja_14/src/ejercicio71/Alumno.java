package ejercicio71;

public class Alumno {

	private String nombre;
	private int edad;
	private double nota;

	/*
	 * Se pone el THROWS porque la excepción EdadNoValidaException (y otras más)
	 * son excepciones de tipo CHECKED
	 * Al ser CHECKED nos obliga a TRY/CATCH (con los UNCHECKED también se puede,
	 * pero no es obligatorio).
	 */
	public Alumno(String nombre, int edad) throws EdadNoValidaException
	{
		this.nombre = nombre;

		if(edad < 0)
		{
			throw new EdadNoValidaException("Edad no válida.");
		}

		this.edad = edad;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) throws NotaNoValidaException{

		if(nota < 0 || nota > 10)
		{
			throw new NotaNoValidaException("Nota incorrecta.");
		}
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}


}
