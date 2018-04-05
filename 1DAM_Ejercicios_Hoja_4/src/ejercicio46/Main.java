package ejercicio46;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static String[] nombre = new String[10];
	private static String auxNombre;
	private static String buscar;
	private static String seleccion = "0"; // lo guardamos como String (se puede como int tambien)
	private static int cont = 0;
	private static boolean repetido;

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
		if(cont == nombre.length)
		{
			System.out.println("ARRAY LLENO.");
			return; // con esto no hace falta luego un ELSE
		}

		System.out.println("Introduce nombre: ");
		auxNombre = sc.nextLine();

		repetido = false;
		for(int i = 0; i < cont && !repetido; i++)
		{
			if(auxNombre.equalsIgnoreCase(nombre[i]))
			{
				repetido = true;
			}
		}
		if(!repetido)
		{
			nombre[cont] = auxNombre;
			cont++;
		}
		else
		{
			System.out.println("REPETIDO.");
		}
	}
	private static void listarNombre()
	{
		if(cont == 0)
		{
			System.out.println("ARRAY VACÍO.");
			return;
		}
		for(int i = 0; i < cont; i++)
		{
			System.out.println(nombre[i]);
		}
	}
	private static void buscarNombre()
	{
		if(cont == 0)
		{
			System.out.println("ARRAY VACÍO.");
			return;
		}
		System.out.println("Cadena a buscar: ");
		buscar = sc.nextLine();
		boolean encontrado = false;
		for(int i = 0; i < cont; i++)
		{
			if(nombre[i].contains(buscar))
			{
				System.out.println(nombre[i]);
				encontrado = true;
			}
		}
		if(!encontrado)
		{
			System.out.println("NO ENCONTRADO.");
		}
	}
	private static void eliminarNombre()
	{
		if(cont == 0)
		{
			System.out.println("ARRAY VACÍO.");
			return;
		}
		System.out.println("Cadena a eliminar: ");
		buscar = sc.nextLine();
		int posEliminar = -1;
		boolean encontrado = false;

		for(int i = 0; i < cont; i++)
		{
			if(buscar.equalsIgnoreCase(nombre[i]))
			{
				encontrado = true;
				posEliminar = i;
			}
		}
		if(!encontrado)
		{
			System.out.println("Nombre no encontrado.");
		}
		else
		{
			for(int i = posEliminar; i < cont - 1; i++)
			{
				nombre[i] = nombre[i+1];
			}
			cont--;
			System.out.println("Nombre eliminado.");
		}
	}
	private static void eliminarTodos()
	{
		cont = 0;
		System.out.println("TODO ELIMINADO.");
	}

}
