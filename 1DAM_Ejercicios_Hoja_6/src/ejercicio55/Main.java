package ejercicio55;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Has llamado a " + Empleado.getNumeroEmpleados() + " empleados.");
		// al ser un metodo estatico no hace falta crear la clase con anterioridad

		Empleado[] empleados = new Empleado[4]; /* en este punto aún no están los cuatro empleados
		solo creamos un apuntador*/
		String nombre;
		String telefono;

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < empleados.length; i++)
		{
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Telefono: ");
			telefono = sc.nextLine();

			empleados[i] = new Empleado(nombre, telefono); // cada Empleado lo guardamos en
			// una direccion de memoria, donde se guarda el Empleado en sí
		}
		sc.close();

		for(int i = 0; i < empleados.length; i++)
		{
			System.out.println(empleados[i].getNombre()
					+ ", " + empleados[i].getTelefono());
		}

		System.out.println("Has llamado a " + Empleado.getNumeroEmpleados() + " empleados.");
	}	// si getNumeroEmpleados() no fuese estatico, se podría llamar con empleado[0].getNumeroEmpleados()

}
