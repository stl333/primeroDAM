package ejercicio61;

import ejercicio55.Empleado;

public class Programador extends Empleado
{
	// atributos
	private String[] lenguajes; // con esto creamos el apuntador (la direccion de memoria
	// donde se va a encontrar ese array) pero no hay nada dentro
	// al ser private solo es accesible desde esta Clase, no desde sus subclases
	// nombre y telefono ya están declarados en el Empleado
	// si queremos acceder a ellos habrá que hacerlo con los metodos
	// getNombre y getTelefono de la clase Empleados

	// constructor
	public Programador(String nombre, String telefono, String ... lenguajes) {

		super(nombre, telefono); //constructor Empleado

		this.lenguajes = lenguajes; // aqui pasamos la direccion de memoria de uno a otro
		// y como consecuencia, todo lo que se encuentra en esa direccion AKA el array de lenguajes

	}

	public String[] getLenguajes()
	{
		return lenguajes;
	}


}
