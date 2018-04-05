package ejercicio54;
import java.util.Scanner;

import ejercicio53.Nombres;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static String seleccion = "0"; // lo guardamos como String (se puede como int tambien)

	private static Nombres nombres = new Nombres(10);

	public static void main(String[] args) {

		do
		{
			mostrarMenu();
			seleccion = sc.nextLine();

			switch(seleccion)
			{
				case "1":
					introducirNombre();
					break;
				case "2":
					listarNombre();
					break;
				case "3":
					buscarNombre();
					break;
				case "4":
					eliminarNombre();
					break;
				case "5":
					eliminarTodos();
					break;
				case "6":
					// si no ponemos esta opción, al poner 6 se metería en el DEFAULT
					break;
				default:
					System.out.println("Seleccion NO VALIDA.");
					break;
			}
			System.out.println();
		}while(!seleccion.equals("6"));
		sc.close();

	}

	private static void mostrarMenu()
	{
		System.out.println("1­ Introducir nombre."
				+ "\n2­ Listar nombres."
				+ "\n3­ Buscar nombre."
				+ "\n4­ Eliminar nombre."
				+ "\n5­ Eliminar todos los nombres."
				+ "\n6 Salir.");
	}

	private static void introducirNombre()
	{
		if(nombres.estaLlena())
		{
			System.out.println("LISTA LLENA.");
		}
		else
		{
			System.out.println("Nombre: ");
			if(!nombres.anadir(sc.nextLine()))
			{
				System.out.println("Repetido.");
			}
			else
			{
				System.out.println("Añadido.");
			}
		}
	}
	private static void listarNombre()
	{
		for(int i = 0; i < nombres.numNombres(); i++)
		{
			System.out.println((i+1) + ". " + nombres.mostrar(i));
		}
	}
	private static void buscarNombre()
	{
		System.out.println("Nombre a buscar: ");
		if(nombres.buscar(sc.nextLine()))
		{
			System.out.println("Encontrado.");
		}
		else
		{
			System.out.println("No encontrado.");
		}
	}
	private static void eliminarNombre()
	{
		System.out.println("Nombre a eliminar: ");
		if(nombres.eliminar(sc.nextLine()))
		{
			System.out.println("Eliminado.");
		}
		else
		{
			System.out.println("No encontrado.");
		}
	}
	private static void eliminarTodos()
	{
		nombres.vaciar();
	}
}
