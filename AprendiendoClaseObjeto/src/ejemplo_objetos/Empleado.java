package ejemplo_objetos;

public class Empleado {

	// Atributos
	private String nombre; 	// con el private, no se puede acceder al atributo
							//desde fuera de esta clase
	private float sueldo;
	private String categoria;


	// Constructor (se tiene que llamar igual que la clase)

	/**
	 * Empleado con sus datos personales y profesionales
	 * @param nombre
	 * @param sueldo
	 * @param categoria
	 */

	// @param significa 'parámetro'
	public Empleado(String nombre, float sueldo, String categoria) // mismo orden en que luego se hace la llamada
	{
		this.nombre = nombre; // con el 'this.' hacemos referencia a atributo de clase
		this.sueldo = sueldo;
		this.categoria = categoria;
	}


	// Métodos

	/**
	 * Muestra el nombre del empleado
	 * @return
	 */
	public String getNombre() // si pongo String, el return tiene que ser String
	{
		return nombre; 	// se puede poner también 'this.nombre', pero al no haber
						// más de un 'nombre' en este apartado, no hace falta,
						// puesto que no da lugar a confusión
	}
	// get recupera valores de un atributo, set los asigna

	public float getSueldo() // si pongo float, el return tiene que ser float
	{
		return sueldo;
	}

	public String getCategoria()
	{
		return categoria;
	}

	public void setSueldo(float sueldo) // void significa que no devuelve nada
	{
		this.sueldo = sueldo;
	}

	/**
	 * Sube el sueldo del empleado en la cantidad 'subida'
	 * @param subida
	 */
	public void subirSueldo(float subida)
	{
		if(subida > 1000)
		{
			subida = 1000;
		}
		sueldo += subida;
	}
}
