package ejercicio64;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	private static Baraja baraja;

	public static void main(String[] args) {

		baraja = new Baraja();

		int seleccion = -1;

		do
		{
			mostrarMenu();
			seleccion = sc.nextInt();

			switch(seleccion)
			{
				case 1:
					listarBarajaNum();
					break;
				case 2:
					listarBarajaNombre();
					break;
				case 3:
					introducirCarta();
					break;
				case 4:
					barajarCarta();
					break;
				case 5:
					extraerCartaAzar();
					break;
				case 6:
					extraerCartaSuperior();
					break;
				case 7:
					extraerCartaElegida();
					break;
				case 8:
					ordenarBaraja();
					break;
				case 9:
					numCartas();
				case 10:
					break;
				default:
					System.out.println("Seleccion errónea.");
			}
		}while(seleccion!=10);

	}

	private static void mostrarMenu()
	{
		System.out.println("1: Listar por número.\n" +
				"2: Listar por nombre.\n" +
				"3: Introducir carta.\n" +
				"4: Barajar.\n" +
				"5: Extraer carta AL AZAR.\n" +
				"6: Extraer carta SUPERIOR.\n" +
				"7: Extraer carta ELEGIDA.\n" +
				"8: Ordenar la baraja.\n" +
				"9: Número de cartas.\n" +
				"10: Salir.");
	}

	private static void listarBarajaNum()
	{
		/*
		for(int listar : baraja.getCartas())
		{
			System.out.println(listar);
		}
		System.out.println();
		*/
		
		for(int i = 1; i <= 40; i++)
		{
			System.out.println(baraja.traducir(i));
		}
	}

	private static void listarBarajaNombre()
	{
		int[] leer = baraja.getCartas();

		for(int i = 0; i < baraja.getNumCartas(); i++)
		{
			System.out.println(baraja.traducir(leer[i]));
		}
		System.out.println();
	}

	private static void introducirCarta()
	{
		System.out.println("Numero de carta que quieres meter: ");

		if(baraja.ponerCarta(sc.nextInt()))
		{
			System.out.println("Introducida con éxito.");
		}
		else
		{
			System.out.println("ERROR.");
		}
		System.out.println();
	}

	private static void barajarCarta()
	{
		baraja.barajar();

		System.out.println();
	}

	private static void extraerCartaAzar()
	{
		if(baraja.extraerCartaAlAzar() == -1)
		{
			System.out.println("NO QUEDAN CARTAS.");
		}
		else
		{
			System.out.println("Has extraído la carta: " + baraja.traducir(baraja.extraerCartaAlAzar()));
		}
		System.out.println();
	}

	private static void extraerCartaSuperior()
	{
		if(baraja.extraerCartaArriba() == -1)
		{
			System.out.println("NO QUEDAN CARTAS.");
		}
		else
		{
			System.out.println("Has extraído la carta: " + baraja.traducir(baraja.extraerCartaArriba()));
		}

		System.out.println();
	}

	private static void extraerCartaElegida()
	{
		System.out.println("Posición de la carta a extraer: ");
		int num = sc.nextInt();

		if(baraja.extraerCarta(num) == -1)
		{
			System.out.println("ERROR.");
		}
		else
		{
			System.out.println("Has extraído la carta: " + baraja.traducir(num));
		}
		System.out.println();
	}

	private static void ordenarBaraja()
	{
		baraja.ordenar();

		System.out.println();
	}

	private static void numCartas()
	{
		System.out.println("Actualmente hay " + baraja.getNumCartas() + " cartas en la baraja.");
		System.out.println();
	}

}
