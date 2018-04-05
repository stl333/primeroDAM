package ejercicio70;

public class Alumno {

	private String nombre;
	private int edad;
	private double nota;

	public Alumno(String nombre, int edad)
	{
		this.nombre = nombre;

		if(edad < 0)
		{
			throw new IllegalArgumentException("Edad no válida.");
		}

		this.edad = edad;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {

		if(nota < 0 || nota > 10)
		{
			throw new IllegalArgumentException("Nota incorrecta.");
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
