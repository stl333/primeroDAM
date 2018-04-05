package ejercicio63;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	private static double tipo;
	private static int cantidad;

	private static CajaRegistradora cr;

	/* cambiando de los metodos el 'cr' a 'cr2' podríamos seleccionar los dolares
	private static final double[] DOLARES = {0.01, 0.1, 0.2, 0.5, 1, 2, 3, 4, 5, 10, 20, 50, 100, 500,
			1000, 2000, 5000};

	private static CajaRegistradora cr2 = new CajaRegistradora("2", DOLARES);*/

	public static void main(String[] args) {

		final double[] EUROS = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 20, 50, 100,
				200, 500}; // si en vez de double fuese float ACORDARSE de poner la f despues de cada numero

		cr = new CajaRegistradora("1", EUROS);

		int seleccion; // como todos los datos van a ser numericos, no hace falta ponerlo
		// como String, puesto que no es necesario parsear

		do
		{
			mostrarMenu();
			seleccion = sc.nextInt();

			switch(seleccion)
			{
			case 1:
				ingresarMoneda();
				break;

			case 2:
				listarCaja();
				break;

			case 3:
				mostrarSaldo();
				break;

			case 4:
				extraerMonedas();
				break;

			case 5:
				cr.vaciarCajaRegistradora();
				break;

			case 6:
				break;

			default:
				System.out.println("Opción errónea.");
				break;
			}
		}while(seleccion != 6);
	}

	private static void mostrarMenu()
	{
		System.out.println("1.­ Ingresar monedas. (Pedirá tipo y unidades)\n" +
				"2.­ Listar contenido. (Por cada tipo de moneda, unidades.)\n" +
				"3.­ Mostrar saldo.\n" +
				"4.­ Extraer monedas. (Pedirá tipo y número)\n" +
				"5.­ Vaciar caja.\n" +
				"6.­ Salir.");
	}

	private static void ingresarMoneda()
	{
		System.out.println("Tipo Moneda (0,05, 1, 100,...)");
		tipo = sc.nextDouble();

		if(!cr.monedaValida(tipo))
		{
			System.out.println("Error. Moneda no válida.");
		}
		else
		{
			do
			{
				System.out.println("Cantidad: ");
				cantidad = sc.nextInt();

				if(cantidad < 0)
				{
					System.out.println("Cantidad por debajo de cero. REPITE.");
				}

			}while(cantidad < 0);

			if(cr.meterMonedas(tipo, cantidad))
			{
				System.out.println("Introducido con éxito.");
			}
		}
	}

	private static void listarCaja()
	{
		System.out.println("Moneda\tCantida\tImporte"); // si le ponemos la d, se pasa del tamaño
		// y lo cuenta como dos tabulaciones
		
		/* asi estaria bien, pero para hacerlo mas entendible
		for(int i = 0; i < cr.getNumTipoMonedas(); i++)
		{
			System.out.println(cr.getTiposDeMonedas()[i] + "\t" + cr.getUnidadesTipoMoneda(cr.getTiposDeMonedas()[i]));
		}*/

		double[] monedasImprimir = cr.getTiposDeMonedas();

		for(int i = 0; i < cr.getNumTipoMonedas(); i++)
		{
			if(cr.getUnidadesTipoMoneda(monedasImprimir[i]) != 0)
			{
				System.out.println(monedasImprimir[i] + "\t" + 
						cr.getUnidadesTipoMoneda(monedasImprimir[i]) + "\t" +
						monedasImprimir[i] * cr.getUnidadesTipoMoneda(monedasImprimir[i]));
			}
		}
	}

	private static void mostrarSaldo()
	{
		System.out.println("El saldo es " + cr.getSaldo() + ".");
	}

	private static void extraerMonedas()
	{
		System.out.println("Tipo Moneda (0.05, 1, 100,...)");
		tipo = sc.nextDouble();

		if(!cr.monedaValida(tipo))
		{
			System.out.println("Error. Moneda no válida.");
		}
		else
		{
			System.out.println("Cantidad: ");
			cantidad = sc.nextInt();

			if(cantidad > cr.getUnidadesTipoMoneda(tipo))
			{
				System.out.println("Has introducido más cantidad de la disponible.");
			}
			else if(cr.sacarMonedas(tipo, cantidad))
			{
				System.out.println("Sacado con éxito.");
			}
		}
	}
}
