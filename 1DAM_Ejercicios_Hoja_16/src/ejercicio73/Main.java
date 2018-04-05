package ejercicio73;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int[][] cartonArray = {	{2,0,24,35,46,0,0,0,86},
								{0,0,0,37,0,51,61,73,88},
								{9,11,0,0,47,0,68,75,0} };



		if(Carton.esValido(cartonArray))
		{
			System.out.println("CARTÓN VÁLIDO.");

			Carton carton = new Carton(cartonArray);

			String seleccion = "";

			do
			{
				if(carton.tacharNumero(random.nextInt(89) + 1))
				{
					System.out.println("Tachado");
				}
				else
				{
					System.out.println("No encontrado");
				}

				if(carton.hayLinea())
				{
					System.out.println("LINEA");
				}
			}while(seleccion.equals("s") || !carton.hayBingo());

			System.out.println("BINGO");
		}
		else
		{
			System.out.println("NO VÁLIDO.");
		}

		/*
		Carton carton = new Carton(cartonArray);

		carton.mostrarCarton();

		carton.tacharNumero(46);
		carton.tacharNumero(37);
		carton.tacharNumero(51);
		carton.tacharNumero(61);
		carton.tacharNumero(86);
		carton.tacharNumero(46);
		carton.tacharNumero(73);
		carton.tacharNumero(88);

		carton.mostrarCarton();

		if(carton.hayLinea())
		{
			System.out.println("HAY LINEA");
		}
		else
		{
			System.out.println("NO HAY LINEA");
		}

		if(carton.hayBingo())
		{
			System.out.println("BINGO");
		}
		else
		{
			System.out.println("NO BINGO");
		}

		carton.tacharNumero(2);
		carton.tacharNumero(24);
		carton.tacharNumero(35);
		carton.tacharNumero(9);
		carton.tacharNumero(11);
		carton.tacharNumero(47);
		carton.tacharNumero(68);
		carton.tacharNumero(75);

		carton.mostrarCarton();

		if(carton.hayBingo())
		{
			System.out.println("BINGO");
		}
		else
		{
			System.out.println("NO BINGO");
		}
		*/
	}

}
