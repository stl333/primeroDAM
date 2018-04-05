package ejercicio72;

import java.util.Scanner;

public class Main {

	private static Ahorcado ahorcado = new Ahorcado();
	private static Scanner sc = new Scanner(System.in);
	private static String palabra;
	private static final int MAX_FALLOS = 10;

	public static void main(String[] args) {

		int seleccion = 0;

		while(seleccion != 3)
		{
			System.out.println("Elige opción."
					+ "\n1. PARTIDA NUEVA."
					+ "\n2. JUGAR.");
			seleccion = Integer.parseInt(sc.nextLine());

			switch(seleccion)
			{
				case 1:
					partidaNueva();
					break;
				case 2:
					jugar();
					break;
				case 3:
					break;
				default:
					System.out.println("Opción no válida.");
			}
		}
	}

	private static void partidaNueva(){
		System.out.println("PALABRA A ADIVINAR: ");
		palabra = sc.nextLine();
		ahorcado.partidaNueva(palabra);
	}

	private static void jugar()
	{
		for(int i = 0; i < 30; i++)
		{
			System.out.println();
		}

		System.out.println(ahorcado.getPanel());

		while(ahorcado.getNumeroFallos() < MAX_FALLOS && !ahorcado.panelCompleto())
		{
			System.out.println("Letra: ");

			if(ahorcado.ponerLetra(sc.nextLine().charAt(0)))
			{
				System.out.println("CORRECTO.");
				System.out.println(ahorcado.getPanel());
			}
			else
			{
				System.out.println("Incorrecto. Te quedan " + (MAX_FALLOS - ahorcado.getNumeroFallos())
						+ " fallos.");
				System.out.println(ahorcado.getPanel());
			}
		}
		if(ahorcado.panelCompleto())
		{
			System.out.println("HAS GANADO.");
		}
		else
		{
			System.out.println("GAME OVER.");
			System.out.println(palabra);
		}
	}

}
