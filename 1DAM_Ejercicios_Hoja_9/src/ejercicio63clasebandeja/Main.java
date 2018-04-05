package ejercicio63clasebandeja;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	private static double tipo;
	private static int cantidad;
	private static final double[] EUROS = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 20, 50, 100,
			200, 500};

	private static CajaRegistradora cr = new CajaRegistradora("1", EUROS);

	/* cambiando de los metodos el 'cr' a 'cr2' podríamos seleccionar los dolares
	private static final double[] DOLARES = {0.01, 0.1, 0.2, 0.5, 1, 2, 3, 4, 5, 10, 20, 50, 100, 500,
			1000, 2000, 5000};

	private static CajaRegistradora cr2 = new CajaRegistradora("2", DOLARES);*/

	public static void main(String[] args) {

		String seleccion;

		do
		{
			mostrarMenu();
			seleccion = sc.nextLine();

			switch(seleccion)
			{
			case "1":
				ingresarMoneda();
				break;

			case "2":
				listarCaja();
				break;

			case "3":
				mostrarSaldo();
				break;

			case "4":
				extraerMonedas();
				break;

			case "5":
				cr.vaciarCajaRegistradora();
				break;

			case "6":
				break;

			default:
				System.out.println("Opción errónea.");
				break;
			}
		}while(!seleccion.equals("6"));
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
		System.out.println("Tipo Moneda (0.05, 1, 100,...)");
		tipo = Double.parseDouble(sc.nextLine());

		if(!cr.monedaValida(tipo))
		{
			System.out.println("Error. Moneda no válida.");
		}
		else
		{
			System.out.println("Cantidad: ");
			cantidad = Integer.parseInt(sc.nextLine());

			if(cr.meterMonedas(tipo, cantidad))
			{
				System.out.println("Introducido con éxito.");
			}
		}
	}

	private static void listarCaja()
	{
		System.out.println("Moneda\tCantidad");
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
				System.out.println(monedasImprimir[i] + "\t" + cr.getUnidadesTipoMoneda(monedasImprimir[i]));
			}
		}
	}

	private static void mostrarSaldo()
	{
		System.out.println(cr.getSaldo());
	}

	private static void extraerMonedas()
	{
		System.out.println("Tipo Moneda (0.05, 1, 100,...)");
		tipo = Double.parseDouble(sc.nextLine());

		if(!cr.monedaValida(tipo))
		{
			System.out.println("Error. Moneda no válida.");
		}
		else
		{
			System.out.println("Cantidad: ");
			cantidad = Integer.parseInt(sc.nextLine());

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
