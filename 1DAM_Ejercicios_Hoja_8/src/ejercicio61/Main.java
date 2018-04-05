package ejercicio61;

import ejercicio55.Empleado;

public class Main {

	public static void main(String[] args) {

		Empleado[] empleados = new Empleado[6];

		empleados[0] = new Programador("Andres", "5", "Java", "C", "Python", "HTML");
		empleados[1] = new Programador("Carlos", "457", "eclipse", "xml");
		empleados[2] = new Empleado("JoseJEFE", "546");
		empleados[3] = new Programador("XXX", "547", "Schema", "DTD");
		empleados[4] = new Empleado("Julian", "56");
		empleados[5] = new Programador("Mario", "4786", "Linux", "Windows");

		for (int i = 0; i < empleados.length; i++) {

			System.out.println(empleados[i].getNombre());
			System.out.println(empleados[i].getTelefono());

			if(empleados[i] instanceof Programador)
			{
				Programador programador = (Programador)empleados[i];

				for(String lenguajes : programador.getLenguajes()) // a esto se le llama 'for each'
				{
					System.out.println(lenguajes);
				}
			}
			System.out.println("----------------------");
		}

	}

}
