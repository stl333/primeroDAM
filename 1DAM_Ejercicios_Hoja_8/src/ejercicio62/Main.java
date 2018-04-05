package ejercicio62;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	private static Conductor[] conductores = new Conductor[10];
	private static int cont = 0;
	
	public static void main(String[] args)
	{
		String opcion = "0";
		
		while(!opcion.equals("5"))
		{
			mostrarMenu();
			opcion = sc.nextLine();
			
			switch(opcion)
			{
				case "1":
					introducirConductor();
					break;
				case"2":
					listarConductor();
					break;
				case "3":
					sumarKilometros();
					break;
				case "4":
					sumarCiudad();
					break;
				case "5":
					break;
				default:
					System.out.println("Opcion no valida.");
			}
		}
	}
	
	private static void mostrarMenu()
	{
		System.out.println("1. Introducir Conductor\n"
							+ "2. Listar conductores\n"
							+ "3. Sumar kilometros\n"
							+ "4. Sumar ciudad\n"
							+ "5. Salir\n");
	}
	
	private static void introducirConductor() // permitimos repetidos
	{
		System.out.println("Nombre conductor");
		String nombre = sc.nextLine();
		
		System.out.println("Telefono conductor");
		String telefono = sc.nextLine();
		
		conductores[cont] = new Conductor(nombre, telefono);
		cont++;
		
		System.out.println("Conductor añadido");
	}
	
	private static void listarConductor()
	{
		System.out.println("Nombre\tTlfn\tKM\tCiudades");
		for(int i = 0; i < cont; i++)
		{
			System.out.print(conductores[i].getNombre() + "\t"
					+ conductores[i].getTelefono() + "\t"
					+ conductores[i].getTotalKilometros() + "\t");
			
			if(conductores[i].getCiudadesRecorridas()[0].equals(""))
			{
				System.out.print("X");
			}
			else
			{
				for(String ciudadRecorridas : conductores[i].getCiudadesRecorridas())
				{
					System.out.print(ciudadRecorridas + " - ");
				}
			}
			
			System.out.println();
		}
	}
	
	private static void sumarKilometros()
	{
		System.out.println("Conductor al que sumar KM: ");
		String nombre = sc.nextLine();
		System.out.println("Kilometros a sumar: ");
		double km = Double.parseDouble(sc.nextLine());
		
		int posicionCond = 0;
		
		for(int i = 0; i < cont; i++)
		{
			if(nombre.equals(conductores[i]))
			{
				posicionCond = i;
			}
		}
		
		conductores[posicionCond].sumarKilometros(km);
	}
	
	private static void sumarCiudad()
	{
		System.out.println("Conductor al que sumar ciudad: ");
		String nombre = sc.nextLine();
		System.out.println("Ciudad a sumar: ");
		String ciudad = sc.nextLine();
		
		int posicionCond = 0;
		
		for(int i = 0; i < cont; i++)
		{
			if(nombre.equals(conductores[i]))
			{
				posicionCond = i;
			}
		}
		
		conductores[posicionCond].pasaPorCiudad(ciudad);
	}

}
