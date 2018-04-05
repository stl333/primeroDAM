package ejercicio61PROFESOR;

import ejercicio55.Empleado;

public class Programador extends Empleado
{

	private String[] lenguajes;


	public Programador(String nombre, String telefono, String ...lenguajes)
	{
		super(nombre, telefono); // Constructor Empleado
		this.lenguajes = lenguajes;
	}

	public String[] getLenguajes()
	{
		return lenguajes;
	}


}
