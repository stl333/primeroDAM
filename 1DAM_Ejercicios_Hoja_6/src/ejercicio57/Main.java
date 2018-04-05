package ejercicio57;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		System.out.println("Método esPrimo:\n ");
		if(Numero.esPrimo(10))
		{
			System.out.println("es primo");
		}
		else
		{
			System.out.println("no primo");
		}
		if(Numero.esPrimo(37))
		{
			System.out.println("es primo");
		}
		else
		{
			System.out.println("no primo");
		}

		// ----------------------------------
		// ----------------------------------
		// ----------------------------------

		System.out.println("\n\nMétodo esPerfecto:\n ");

		if(Numero.esPerfecto(6))
		{
			System.out.println("es perfecto");
		}
		else
		{
			System.out.println("no es perfecto");
		}

		if(Numero.esPerfecto(287))
		{
			System.out.println("es perfecto");
		}
		else
		{
			System.out.println("no es perfecto");
		}

		// ----------------------------------
		// ----------------------------------
		// ----------------------------------

		System.out.println("\n\nMétodo esCapicua:\n ");

		if(Numero.esCapicua(4224))
		{
			System.out.println("es capicua");
		}
		else
		{
			System.out.println("no es capicua");
		}
		if(Numero.esCapicua(28777))
		{
			System.out.println("es capicua");
		}
		else
		{
			System.out.println("no es capicua");
		}

		// ----------------------------------
		// ----------------------------------
		// ----------------------------------

		System.out.println("\n\nMétodo sonAmigos:\n ");

		if(Numero.sonAmigos(220, 284))
		{
			System.out.println("son amigos");
		}
		else
		{
			System.out.println("no son amigos");
		}
		if(Numero.sonAmigos(240, 824))
		{
			System.out.println("son amigos");
		}
		else
		{
			System.out.println("no son amigos");
		}

		// ----------------------------------
		// ----------------------------------
		// ----------------------------------

		System.out.println("\n\nMétodo extraeDivisores:\n ");

		for(int array: Numero.extraeDivisores(1000))
		{
			System.out.println(array);
		}

		// ----------------------------------
		// ----------------------------------
		// ----------------------------------

		System.out.println("\n\nMétodo duplica:\n ");

		// ----------------------------------
		int[] paraDuplicar = {1,2,3,5,10,500,35,80};
		

		for(int i = 0; i < paraDuplicar.length; i++)
		{
			System.out.println(paraDuplicar[i]);
		}

		System.out.println();

		Numero.duplica(paraDuplicar);

		for(int duplicar: paraDuplicar)
		{
			System.out.println(duplicar);
		}

		// ----------------------------------
		// ----------------------------------
		// ----------------------------------

		System.out.println("\n\nMétodo eliminaPrimos:\n ");

		int[] quitarPrimos = new int[10];
		Random random = new Random();

		for(int i = 0; i < quitarPrimos.length; i++)
		{
			quitarPrimos[i] = random.nextInt(20);
			System.out.println(quitarPrimos[i]);
		}

		System.out.println();

		for(int primosEliminados : Numero.eliminaPrimos(quitarPrimos))
		{
			System.out.println(primosEliminados);
		}

		// ----------------------------------
		// ----------------------------------
		// ----------------------------------

		System.out.println("\n\nMétodo ordena:\n ");

		int[] paraOrdenar = new int[10];

		for(int i = 0; i < paraOrdenar.length; i++)
		{
			paraOrdenar[i] = random.nextInt(200);
			System.out.println(paraOrdenar[i]);
		}
		
		System.out.println();

		Numero.ordena(paraOrdenar, Numero.ASCENDENTE);

		for(int ordenados: paraOrdenar)
		{
			System.out.println(ordenados);
		}

		System.out.println();
		
		Numero.ordena(paraOrdenar, Numero.DESCENDENTE);

		for(int ordenados: paraOrdenar)
		{
			System.out.println(ordenados);
		}
	}

}
