package ejercicio61PROFESOR;

import java.util.Scanner;
import ejercicio55.Empleado;

public class Main
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Número de empleados a introducir: ");
		int numEmpleados = Integer.parseInt(sc.nextLine());

		Empleado[] empleados = new Empleado[numEmpleados];

		String nombre;
		String telefono;
		String lenguajes;

		for (int i = 0; i < empleados.length; i++)
		{
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			System.out.print("Teléfono: ");
			telefono = sc.nextLine();

			System.out.print("Lenguajes de programación separados por espacio:");
			lenguajes = sc.nextLine();

			if(lenguajes.length() == 0) // No conoce lenguajes
			{
				empleados[i] = new Empleado(nombre, telefono);
			}
			else
			{
				empleados[i] = new Programador(nombre, telefono, lenguajes.split(" "));
			}
		}
		sc.close();

		// Mostrar los empleados

		Programador programador;
		System.out.println("Nombre\tTeléfono\t");
		for (int i = 0; i < empleados.length; i++)
		{
			System.out.print(empleados[i].getNombre() + "\t");
			System.out.println(empleados[i].getTelefono() + "\t");

			//if(empleados[i] instanceof Programador)
			{
				programador = (Programador) empleados[i];
				for(String lenguaje: programador.getLenguajes())
				{
					System.out.println("\t" + lenguaje);
				}
			}
			System.out.println();

		}


	}

}
